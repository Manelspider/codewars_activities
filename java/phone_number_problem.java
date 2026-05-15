import java.util.*;

// Required for 2nd solve

import java.util.Arrays;

public class phone_number_problem {

    /*
        Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.

        Example

        Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"

        The returned format must be correct in order to complete this challenge.

        Don't forget the space after the closing parentheses!
     */

    /* Own Solve */

    public static String createPhoneNumber(int[] numbers) {
        
        String prefix = "(";
        String stack01 = "";
        String stack02 = "";

        for (int i = 0; i < numbers.length; i++) {
            if(i < 3){
                prefix = prefix + numbers[i];
            }
            else if (i < 6){
                stack01 = stack01 + numbers[i];
            }
            else{
                stack02 = stack02 + numbers[i];
            }
        }

        prefix = prefix + ")";

        return prefix + " " + stack01 + "-" + stack02;
    }

    // Good Alternative, more simple and can be used for regex or used directly
    // as inclusive on own string format based on array position

    public static String createPhoneNumberALT(int[] n) {
        Integer[] resBoxed = Arrays.stream(n).boxed().toArray(Integer[]::new);
        String PHONE_FORMAT = "(%d%d%d) %d%d%d-%d%d%d%d";
        return String.format(PHONE_FORMAT, (Object[]) resBoxed);
    }

    void main(String[] args) {
        String phoneNumber = createPhoneNumberALT(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        System.out.println(phoneNumber);
    }

}