package com.lobach;

public class TwoDimArrA extends OneTwoDimArrays {

    public TwoDimArrA() {
        super(8, 8, 1, 99);
        int[][] arr = new int[8][8];
        arr = getTwoDimArr();
        int num1 = 0, num = 0;
        long mult = 1, mult1 = 1;
        for (int count = 0; count < arr.length; count++) {
            for (int count1 = 0; count1 < arr.length; count1++) {
                if (count == count1) {
                    num1 += arr[count][count1];
                    mult *= arr[count][count1];
                }
                if (count1 == (arr.length - (count + 1))) {
                    num += arr[count][count1];
                    mult1 *= arr[count][count1];
                }

            }
        }
        System.out.println("Main diagonal summ : " + num1 + " multiply: " + mult);
        System.out.println("Indirect diagonal summ : " + num + " multiply: " + mult1);

    }
}
