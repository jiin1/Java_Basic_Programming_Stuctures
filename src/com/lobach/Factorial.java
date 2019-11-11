package com.lobach;

public class Factorial {
    int n=0;
    public long CalcCycle (int n){
        int count=1;
        for(int i=1;i<=n;i++){
            count *= i;
        }
        return count;
    }

    public long CalcRec (int n){
        if(n<=0)
            return 1;
        else
            return n*CalcRec(n-1);
    }

}
