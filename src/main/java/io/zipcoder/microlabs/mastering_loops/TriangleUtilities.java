package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder s = new StringBuilder();
        for (int i =1 ; i < numberOfRows; i++){
            for (int j =1 ; j<= i; j++){
                s.append("*");
            }
                s.append("\n");
        }
        return s.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder s = new StringBuilder();
        for (int i =0 ; i < numberOfStars; i++){
            s.append("*");
        }
        return s.toString();
    }

    public static String getSmallTriangle() {
        return null;
    }

    public static String getLargeTriangle() {
        return null;
    }
}
