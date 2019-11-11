package com.lobach;
import java.util.Random;

public class Array20 extends OneTwoDimArrays {
    public Array20() {
        super(10, 0, 20);
        super.print();
        int[] dummy=new int[getSize()];
        dummy=getArr();
        int counter=0;
        for(int count=0;count<getSize();count++) {
            if (dummy[count] % 2 != 0)
                counter++;
        }
        System.out.println("");
        System.out.println("Quantity of odd numbers is: "+counter);
        System.out.println("Quantity of unodd numbers is: "+(getSize()-counter));
    }
/* private int[] arr;

    public Array20() {
        this.arr = new double[20];
        Random random= new Random();
        for(int count=0;count<20;count++)
            arr[count]=random.doubles();
    }*/
}
