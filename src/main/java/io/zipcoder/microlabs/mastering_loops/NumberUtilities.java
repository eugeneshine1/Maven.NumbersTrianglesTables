package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String numbers = "";
        for (int x = start; x < stop; x++) {
            if (x % 2 == 0) {
                numbers += Integer.toString(x);
            }
        }
        return numbers;
    }


    public static String getOddNumbers(int start, int stop) {
        String numbers = "";
        for (int x = start; x < stop; x++) {
            if (x % 2 != 0) {
                numbers += Integer.toString(x);
            }
        }
        return numbers;

    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder s = new StringBuilder();
        for (int x = start; x < stop; x += step) {
            s.append(x*x);
        }
        return s.toString();
    }


    public static String getRange (int stop) {
        return NumberUtilities.getRange(0,stop,1);
    }

    public static String getRange(int start, int stop) {
        return NumberUtilities.getRange(start,stop,1);
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder str = new StringBuilder();
        for (int i = start; i < stop; i += step) {
            str.append(i);
        }
        return str.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder s = new StringBuilder();
        for (int x = start; x < stop; x += step) {
            s.append((int)(Math.pow(x,exponent)));
        }
        return s.toString();
    }
}
