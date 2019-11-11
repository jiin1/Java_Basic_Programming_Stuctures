package com.lobach;

import java.util.Map;

public class FreqOfOccurrence extends OneTwoDimArrays {
    public FreqOfOccurrence() {
        super(20, -1, 1);
        int[] dummy = new int[getSize()];
        int[][] key = new int[3][2];
        dummy = getArr();
        super.print();
        System.out.println("");
        int num = 0;
        for (int counter = 0; counter < getSize(); counter++) {
            switch (dummy[counter]) {
                case (-1):
                    key[0][1] += 1;
                    break;
                case (0):
                    key[1][1] += 1;
                    break;
                case (1):
                    key[2][1] += 1;
                    break;
            }
        }

        if (key[2][1] == key[1][1]) {

            if (key[2][1] > key[0][1])
                System.out.println("Frequecy of occurrence val -1 and 1 is higher, " + key[2][1] + " times");
            else System.out.println("Frequecy of occurrence val 1 and val -1 is equal");

        } else if (key[1][1] == key[0][1]) {

            if (key[1][1] > key[2][1])
                System.out.println("Frequecy of occurrence val -1 and 0 is higher, " + key[1][1] + " times");
            else System.out.println("Frequecy of occurrence val 1 and val -1 is equal");

        } else if (key[0][1] == key[2][1]) {

            if (key[2][1] > key[1][1])
                System.out.println("Frequecy of occurrence val 1 and 0 is higher, " + key[1][1] + " times");
            else System.out.println("Frequecy of occurrence val 1 and val -1 is equal");
        }


        if (key[0][1] > key[1][1] & key[0][1] > key[2][1])
            System.out.println("Frequecy of occurrence val -1 is higher, " + key[0][1] + " times");
        else if (key[2][1] > key[0][1] & key[2][1] > key[1][1])
            System.out.println("Frequecy of occurrence val 1 is higher, " + key[2][1] + " times");
        else if (key[1][1] > key[0][1] & key[1][1] > key[2][1])
            System.out.println("Frequecy of occurrence val 0 is higher, " + key[1][1] + " times");

    }

}

