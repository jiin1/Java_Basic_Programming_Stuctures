package com.lobach;

import com.lobach.OneTwoDimArrays;

public class Array15 extends OneTwoDimArrays {
    public Array15() {
        super(15, -50, 50);
        int[] dummy=new int[getSize()];
        dummy=getArr();
        super.print();
        System.out.println("");
        int counter=0;
        int counter1=0;
        int num=0;
        int num1=0;
        for(int count=0;count<getSize();count++) {
            if (dummy[count] > counter){
                counter =dummy[count] ;
                num=count;
            }
        }
        System.out.println("max: "+counter);
        System.out.println("his last number entry is: "+(num+1));
        counter1=counter;
        for(int count=0;count<getSize();count++) {
            if (dummy[count] < counter1){
                counter1=dummy[count];
                num1=count;
            }
        }
        System.out.println("min: "+counter1);
        System.out.println("his last number entry is: "+(num1+1));
    }
}
