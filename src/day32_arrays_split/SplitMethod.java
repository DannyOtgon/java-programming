package day32_arrays_split;

import java.util.*;

public class SplitMethod {
    public static void main(String[] args) {
        String words = "java:python:selenium:html";
        String [] wordsArray = words.split(":");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of array = "+wordsArray.length);

        String sentence = "today I am coding java arrays";
        String [] sentenceArray = sentence.split(" ");
        System.out.println(sentenceArray.length);
        System.out.println(Arrays.toString(sentenceArray));
        System.out.println(sentenceArray[0]);

        for ( String each : sentenceArray){
            System.out.print(each +" ");
        }

    }
}
