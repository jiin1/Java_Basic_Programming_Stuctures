package com.lobach;

import java.util.Arrays;

public class TwoDimArrD extends OneTwoDimArrays {
    public TwoDimArrD() {
        super(10, 7, 0, 100);
        print();
        int[][] arr = new int[getLength()][getWidth()];
        arr = getTwoDimArr();
        int num = 0;
        for (int count1 = 0; count1 < getLength(); count1++) {
                Arrays.sort(arr[count1]);
                }
        print(arr,getLength(),getWidth());
             }
        }

