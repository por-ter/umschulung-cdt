package seos;

import java.util.*;

public class Array2dMinMax {

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        int[][] arr = {{2, 5, 8, 9}, {15, 16, 19, 13}, {23, 25, 28, 29}};

        int max=0, min=0;
        max = arr[0][0];
        min = arr[0][0];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                } else if (arr[i][j] < min) {
                    min = arr[i][j];
                }
                System.out.println("min "+min+" max "+max);
            }
        }
        
    }
}
