package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        return TableUtilities.getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return TableUtilities.getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder S = new StringBuilder();
        for (int i =1; i <= tableSize; i++){
            for (int j =1; j <= tableSize; j++){
                S.append(String.format("%3d |", i *j));
            }
            S.append("\n");
        }
        return S.toString();
    }
}
