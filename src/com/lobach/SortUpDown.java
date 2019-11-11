package com.lobach;

import java.util.Arrays;

public class SortUpDown extends OneTwoDimArrays {
    public SortUpDown() {
        super(99,1,99);
        int size=super.getSize();
        int[] dummy= new int[size];
               dummy= super.getArr();
        Arrays.sort(dummy);
        super.print();
        System.out.println("");

        for(int count=super.getSize()-1;count>=0; --count)
            System.out.print(dummy[count]+" ");
    }



}
