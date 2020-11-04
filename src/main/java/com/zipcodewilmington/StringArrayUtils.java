package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        if (Arrays.asList(array).contains(value)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        Collections.reverse(Arrays.asList(array));
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int counter = 0;
        for (int i=1; i<=(array.length/2); i++){
            if (!array[i].equals(array[array.length-i-1])){
                counter += 1;
                break;
            }
        }
        if (counter>0){
            return false;
        } else {
            return true;
        }
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean answer = false;
        StringBuilder stringBuilder = new StringBuilder();
        for (String x : array){
            stringBuilder.append(x);
        }
        String s = "";
        s = stringBuilder.toString();
        for(char i = 'A'; i <= 'Z'; i++){
            if ((s.indexOf(i) < 0) && (s.indexOf((char)i+32)< 0)){
                answer = false;
            }else{
                answer = true;
            }
        }
        return answer;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)){
                counter += 1;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> newArray = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(valueToRemove)) {
                newArray.add(array[i]);
            }
        }
        String[] strArr = newArray.toArray(new String[0]);
        return strArr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> newArray = new ArrayList<>();
        for (int i=0; i<(array.length-1); i++){
            if (!array[i].equals(array[i+1])){
                newArray.add(array[i]);
            }
        }
        newArray.add(array[array.length-1]);
        String[] strArr = newArray.toArray(new String[0]);
        return strArr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> newArray = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        int i=1;
        word.append(array[0]);
        while (i<(array.length)){
            if (array[i].equals(array[i-1])){
                word.append(array[i]);
            } else {
                newArray.add(word.toString());
                word.setLength(0);
                word.append(array[i]);
            }
            i++;
        }
        newArray.add(word.toString());
        String[] strArr = newArray.toArray(new String[0]);
        return strArr;
    }


}
