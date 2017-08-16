package com.jeromewirth;

import java.util.*;

public class InterviewPractice {

    int firstDuplicate(int[] a) {

        boolean dublette[] = new boolean[a.length];

        for (int num : a) {
            if (dublette[num - 1]) {
                return num;
            } else {
                dublette[num - 1] = true;
            }
        }

        return -1;
    }

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
