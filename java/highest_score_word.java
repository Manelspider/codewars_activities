import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class highest_score_word {

    /*
       Given a string of words, you need to find the highest scoring word.
        Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
        For example, the score of abad is 8 (1 + 2 + 1 + 4).
        You need to return the highest scoring word as a string.
        If two words score the same, return the word that appears earliest in the original string.
        All letters will be lowercase and all inputs will be valid.
     */

    private static Character[] diccionary = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    protected static Integer sumWords(String word){
        int sum = 0;
        for(Character ch:word.toCharArray()){

            OptionalInt optionalPos = IntStream.range(0, diccionary.length)
                .filter(i -> diccionary[i] == ch)
                .findFirst();

            int pos = optionalPos.orElse(-1) + 1;
            sum += pos;
        }
        return sum;
    }

    public static String high(String s) {
        int highest_score = 0;
        String  highest_score_word = "";
        String[] WordsSet = s.split(" ");

        for(String word : WordsSet){
           int totalWord = sumWords(word.toLowerCase());

            System.out.println(totalWord);

           if(totalWord > highest_score){
               highest_score = totalWord;
               highest_score_word = word;
           }
        }

        return highest_score_word;
    }

    /*

    Best alternative

      public static String high(String s) {

        String winner = "";
        int highScore = 0;

        for (String word : s.split(" ")) {
            int score = 0;
            for (char c : word.toCharArray()) {
              score += c - 'a' + 1;
            }
            if (score > highScore) {
              winner = word;
              highScore = score;
            }
        }

        return winner;
      }

    */


    public static void main(String[] args) {
        String result = high("b aa");
        System.out.println(result);
    }

}
