package com.jeromewirth;

import java.util.*;

public class InterviewPractice {

    int firstDuplicate(int[] a) {

        boolean dublette[]  = new boolean[a.length];

        for (int i = 0; i < a.length; i++) {
            if(dublette[a[i]-1]) {
                return a[i];
            } else {
                dublette[a[i]-1] = true;
            }
        }

        return -1;
    }

//    char firstNotRepeatingCharacter(String s) {
//        int counter = 0;
//
//        for(int i = 0; i < s.length(); i++) {
//            char temp = s.charAt(i);
//            for(int j = 0; j < s.length(); j++) {
//                if(temp == s.charAt(j)) {
//                    counter++;
//                }
//            }
//            if(counter < 2) {
//                return s.charAt(i);
//            } else {
//                counter = 0;
//            }
//        }
//
//        return '_';
//    }

//    char firstNotRepeatingCharacter(String s) {
//        HashMap<Character, Integer> a = new HashMap<Character, Integer>();
//        char letter;
//
//        for (int i = 0; i < s.length(); i++) {
//            letter = s.charAt(i);
//
//            if(a.containsKey(letter)) {
//                a.put(letter, a.get(letter)+1);
//            } else {
//                a.put(letter, 1);
//            }
//        }
//
//        for(Character key : a.keySet()) {
//            if(a.get(key) == 1) {
//                return key;
//            }
//        }
//
//        return '_';
//    }

    char firstNotRepeatingCharacter(String s) {

//        int counter = 0;
//
//        for(int i = 0; i < s.length(); i++) {
//            char temp = s.charAt(i);
//            for(int j = 0; j < s.length(); j++) {
//                if(temp == s.charAt(j)) {
//                    counter++;
//                }
//            }
//            if(counter < 2) {
//                return s.charAt(i);
//            } else {
//                counter = 0;
//            }
//        }
//
//        return '_';

        for(int i = 0; i<s.length(); i++) {
            char letter = s.charAt(i);
            if(s.indexOf(letter) == s.lastIndexOf(letter)) {
                return letter;
            }
        }

        return '_';
    }

}
