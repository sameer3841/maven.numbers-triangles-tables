package com.github.curriculeon;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String ans = "";
        for(int i = start; i < stop; i++)
            if(i % 2 == 0) ans += i;
        return ans;
    }


    public static String getOddNumbers(int start, int stop) {
        String ans = "";
        for(int i = start; i < stop; i++)
            if(i % 2 != 0) ans += i;
        return ans;
    }


    public static String getSquareNumbers(int start, int stop, int step) {return getExponentiations(start, stop, step, 2);}

    public static String getRange(int start) {return getRange(0,start,1);}

    public static String getRange(int start, int stop) {return getRange(start,stop,1);}


    public static String getRange(int start, int stop, int step) {
        String ans = "";
        for(int i = start; i < stop; i+=step) ans += i;
        return ans;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String ans = "";
        for(int i = start; i < stop; i+=step)
            ans += (int)Math.pow(i,exponent);
        return ans;
    }
}
