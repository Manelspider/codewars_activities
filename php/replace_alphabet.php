<?php

#In this kata you are required to, given a string, replace every letter with its position in the alphabet.

#If anything in the text isn't a letter, ignore it and don't return it.

#"a" = 1, "b" = 2, etc.

function alphabet_position(string $s): string {

    $diccAlph = array('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
    
    $strPositions = "";

    foreach(str_split(strtolower($s)) as $charStr){
        $matches = array_filter($diccAlph, function ($elem) use($charStr){
            return $elem == $charStr;
        });

        if (!empty($matches)) {
            $position = array_key_first($matches) + 1;
            $strPositions .= ($strPositions === "" ? "" : " ") . $position;
        }
    }

    return $strPositions;
}

alphabet_position('Pruebas');