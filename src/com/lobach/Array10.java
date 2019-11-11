package com.lobach;

public class Array10 extends OneTwoDimArrays{
    public Array10() {
        super(10, 1, 100);
        super.print();
        int[] dummy=new int[getSize()];
        dummy=getArr();

        for(int count=0;count<getSize();count++) {
            if (dummy[count] % 2 != 0)
                dummy[count]=0;
        }
        System.out.println("");

        for(int count=0;count<getSize();count++) {
            System.out.print(dummy[count]+" ");

        }
    }
}
