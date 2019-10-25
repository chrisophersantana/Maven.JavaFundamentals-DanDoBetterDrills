package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        return null;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){
        String word = new String(firstSegment + secondSegment);

        return word;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){


        return firstSegment  + secondSegment;
    }


    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        String firstThree = "";

        if (input.length() > 3) {
            firstThree = input.substring(0,3);
        } else {
            firstThree = input;
        }

        return firstThree;
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        String lastthree  = "";

        if(input.length() > 3) {
            lastthree = input.substring(input.length() - 3);
        } else {
            lastthree = input;
        }
        return lastthree;
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){

        return inputValue == comparableValue;
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
        char c = ' ';

        if (inputValue.length() % 2 == 0) {
            Integer middle = inputValue.length()/2 -1;
             c = inputValue.charAt(middle);
        } else if(inputValue.length() % 2 == 1) {
            Integer middle = inputValue.length()/2 ;
                 c = inputValue.charAt(middle);
            }
        return c;
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){

        String [] word = spaceDelimitedString.split( " ");

        for (String words : word)
        {return word[0];}



        return null;
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        String [] word = spaceDelimitedString.split( " ");

        for (String words : word)
        {return word[1];}

        return null;
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){

        String reverse = "";
        for ( int i = stringToReverse.length() -1; i >= 0 ; i--) {
            reverse = reverse + stringToReverse.charAt(i);
        }


        return reverse;
    }
}
