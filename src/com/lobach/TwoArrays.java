package com.lobach;

public class TwoArrays {
    private int[] arr1;
    private int[] arr2;

    public TwoArrays() {
        OneTwoDimArrays arr1 = new OneTwoDimArrays(10, 0, 10);
        OneTwoDimArrays arr2 = new OneTwoDimArrays(10, 0, 10);
        arr1.print();
        arr2.print();
        this.arr1 = arr1.getArr();
        this.arr2 = arr2.getArr();
        int counter = 0;
        for (int count = 0; count < this.arr1.length; count++) {
            counter += this.arr1[count];
        }
        System.out.println("Average vol of array #1 is:"+(float)(counter/this.arr1.length));

        int counter1 = 0;
        for (int count = 0; count < this.arr2.length; count++) {
            counter1 += this.arr2[count];
        }
        System.out.println("Average vol of array #2 is:"+(float)(counter1/this.arr1.length));
        if(counter>counter1)
            System.out.println("Average vol of array #1 is bigger");
        else if(counter==counter1)
            System.out.println("Average volums of arrays are equal");
        else
            System.out.println("Average vol of array #2 is bigger");




    }

}



