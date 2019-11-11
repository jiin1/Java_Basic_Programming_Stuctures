package com.lobach;

public class ConsolePant {

    public void Square(int h, int n) {
        for (int i = 1; i <= h; i++) {
            for (int j = 0; j < n; j++)
                System.out.print("# ");
            if (i == h) break;
            System.out.println();
        }
    }

    public void Triangle(int n) {
        int count=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("# ");
                if (j == count) break;
                       }
            ++count;
            if (i == n) break;
            System.out.println();
        }
    }

    public void HourGlass(int n){
         for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
             if (i == 1 || i == n||i==j||j==n-i+1) System.out.print("# ");
              else System.out.print("  ");
            }
            if (i == n) break;
            System.out.println();
        }




    }


}
