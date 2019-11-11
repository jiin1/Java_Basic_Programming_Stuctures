package com.lobach;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Random;

public class SortArrays {
    private int arr[];
    private int[] arr1;
    private int[] arr2;

    public SortArrays(int n) {
        this.arr = new int[--n];
        this.arr1 = new int[n];
        this.arr2 = new int[n];
        Random rand = new Random();
        int num = 0;
        for (int count =0;count<n;count++) {
            arr[num] = rand.nextInt(10000);
            arr1[num]=arr[num];
            arr2[num]=arr[num];
            num++;
        }
    }

    public void printer() {
        System.out.println("arr:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("arr1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("");
        System.out.println("arr2:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println("");
        System.out.println("end of print");
    }

    public int[] getArr() {
        return arr;
    }


    private long BubbleSort( int[] arr) {
        long time = System.nanoTime();
        int var = 0;
        for (int i = arr.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    var = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = var;
                }
            }
        }
        long finish_time = System.nanoTime() - time;
       // System.out.println("Lead time of Bubble sort is:" + finish_time);
        return finish_time;
    }

    private long SelectionSort(int[] arr) {
        long time = System.nanoTime();
        for (int i = 0; i < arr.length - 1; i++) {
            int var = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[var]) {
                    var = j;
                }
            }
            int var1 = arr[i];
            arr[i] = arr[var];
            arr[var] = var1;


        }

        long finish_time = System.nanoTime() - time;
      //  System.out.println("Lead time of Selection sort is:" + finish_time);
        return finish_time;
    }


    private long DefaultSort(int[] arr) {
        long time = System.nanoTime();
        Arrays.sort(arr);
        long finish_time = System.nanoTime() - time;
      //  System.out.println("Lead time of Default sort is:" + finish_time);
        return finish_time;
    }

    public void Main(){
        long time_of_bubble =0 ;
        long  time_of_Selection = 0;
        long time_of_Default = 0;
        for (int count = 0; count < 100; count++) {
            time_of_bubble +=BubbleSort(this.arr);
            time_of_Selection += SelectionSort(this.arr1);
            time_of_Default += DefaultSort(this.arr2);

        }
        System.out.println("Average time to run of bubble sort = " +time_of_bubble/100+" nanoseconds");
        System.out.println("Average time to run of Selection = "+time_of_Selection/100+" nanoseconds");
        System.out.println("Average time to run of Default = "+time_of_Default/100+" nanoseconds");
    }
}
