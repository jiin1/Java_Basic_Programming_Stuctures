package com.lobach;

import java.util.Random;

public class OneTwoDimArrays {
    private int[] arr;
    private int[][] arr1;
    private int min_val;
    private int max_val;
    private int size;
    private int length;
    private int width;
    private int num;


    /**
     * @param size    size one-dimention array
     * @param min_val minimum array's range value generating
     * @param max_val maximum array's range value generating
     */

    public OneTwoDimArrays(int size, int min_val, int max_val) {
        if (min_val >= max_val) {
            System.out.println("One-dimensional array have wrong border range! Let's try again!");
            System.out.println("");
        } else {
            this.size = size;
            this.arr = new int[size];
            Random rand = new Random();

            num = max_val - min_val;

            for (int count = 0; count < size; count++) {
                arr[count] = rand.nextInt(num + 1) + min_val;
            }
            this.min_val = min_val;
            this.max_val = max_val;
        }
    }

    /**
     * @param length  second-dimention array
     * @param width   second-dimention array
     * @param min_val minimum array's range value generating
     * @param max_val maximum array's range value generating
     */
    public OneTwoDimArrays(int length, int width, int min_val, int max_val) {
        if (min_val >= max_val) {
            System.out.println("Second-dimensional array have wrong border range ! Let's try again!");
            System.out.println("");
        } else {
            this.arr1 = new int[length][width];
            Random rand = new Random();

            num = max_val - min_val;

            for (int count1 = 0; count1 < length; count1++) {
                for (int count = 0; count < width; count++) {
                    arr1[count1][count] = rand.nextInt(num + 1) + min_val;
                }
            }
            this.min_val = min_val;
            this.max_val = max_val;
            this.length = length;
            this.width = width;
        }
    }


    public void print() {
        System.out.println("Minimum value of array " + min_val);
        System.out.println("Maximum value of array " + max_val);

        if (size != 0) {
            System.out.println("Size of array " + size);
            for (int count = 0; count < size; count++) {
                System.out.print(arr[count] + " ");
            }
            System.out.println("");
        } else {
            System.out.println("Width of array " + width);
            System.out.println("Length of array " + length);
            for (int count1 = 0; count1 < length; count1++) {
                for (int count = 0; count < width; count++) {
                    System.out.print(arr1[count1][count] + " ");
                }
                System.out.println("");
            }
        }
        System.out.println("");

    }

    public void print(int[][] arr, int leng, int wid) {
        System.out.println(" ");
        for (int count1 = 0; count1 < leng; count1++) {
            for (int count = 0; count < wid; count++) {
                System.out.print(arr[count1][count] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getMin_val() {
        return min_val;
    }

    public void setMin_val(int min_val) {
        this.min_val = min_val;
    }

    public int getMax_val() {
        return max_val;
    }

    public void setMax_val(int max_val) {
        this.max_val = max_val;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[] getArr() {
        return arr;
    }

    public int[][] getTwoDimArr() {
        return arr1;
    }
}
