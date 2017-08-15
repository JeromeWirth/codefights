package com.jeromewirth;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Spliterator;

public class InterviewPractice {

    int firstDuplicate(int[] a) {

        boolean dublette[]  = new boolean[a.length];

        for (int i = 0; i < a.length; i++) {
            if(dublette[a[i]-1] == true) {
                return a[i];
            } else {
                dublette[a[i]-1] = true;
            }
        }

        return -1;
    }

    char firstNotRepeatingCharacter(String s) {
        Hashtable letters = new Hashtable<char, boolean>();

        // durchlaufe den gesamten String
        for (int i = 0; i < s.length(); i++) {
            // befindet sich der aktuelle Buchstabe in der Hashtable
            if(letters.contains(s.charAt(i))) {

            } else {

            }
        }


        return '_';
    }

}
