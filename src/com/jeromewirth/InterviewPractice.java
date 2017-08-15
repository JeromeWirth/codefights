package com.jeromewirth;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class InterviewPractice {

    int firstDuplicate(int[] a) {
        List<Integer> n = new ArrayList<Integer>();
        int dublicate = -1;
        boolean bDub = false;
        int i = 0;

        while (bDub || i == a.length) {
            // Prüfe ob das ArrayList leer ist
            if (n.size() != 0) {
                //ist die aktuelle Zahl bereits in der Liste?
                for (int j = 0; j < n.size(); j++) {
                    if (a[i] == n.get(j)) {
                        System.out.println("IN DEM IF");
                        dublicate = 1 + i;
                        bDub = true;
                    }
                }
            }
            i++;
            n.add(a[i]);
        }

        return dublicate;
    }
}
