package com.lobach;

public class TwoDimArrB extends OneTwoDimArrays {
    public TwoDimArrB() {
        super(8, 5, -99, 99);
        int[][] arr = new int[9][6];
        arr = getTwoDimArr();
        print();
        int num = 0, wid = 0, leng = 0;
        for (int count1 = 0; count1 < getLength(); count1++) {
            for (int count = 0; count < getWidth(); count++)
                if (num < arr[count1][count]) {
                    num = arr[count1][count];
                    wid = count;
                    leng = count1;
                }
        }
        System.out.println("maximum is: "+ num+" he is located on "+(wid+1)+" col and "+(leng+1)+" row");
    }
}