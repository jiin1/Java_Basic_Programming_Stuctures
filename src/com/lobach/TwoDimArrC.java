package com.lobach;

public class TwoDimArrC extends OneTwoDimArrays {
    public TwoDimArrC() {
        super(8, 5, -10, 10);
        print();
        int[][] arr = new int[9][6];
        arr = getTwoDimArr();
        int num = 0;
        for (int count1 = 0; count1 < getLength(); count1++) {
            for (int count = 0; count < getWidth(); count++) {
                if (0 > arr[count1][count]) {
                    arr[count1][count] = arr[count1][count] * -1;
                }
                if (num<arr[count1][count])
                    num=arr[count1][count];
            }
        }
        System.out.println("max value is "+num);
    }
}
