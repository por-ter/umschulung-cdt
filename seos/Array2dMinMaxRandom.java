package seos;

public class Array2dMinMaxRandom {

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        int[][] arr = new int[5][5];
        
        System.out.format(" -------------------\n");
        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[a].length; b++) {
                arr[a][b] = (int) (Math.random() * 99);
                System.out.format("%4d", arr[a][b]);
            }
            System.out.println("");
        }
        System.out.format(" -------------------");
        System.out.println("\n\tMin: " + min(arr));
        System.out.println("\tMax: " + max(arr));
    }

    public static int min(int[][] arr) {
        int min=0;

        for (int a = 0; a < arr.length; a++) {
            min = arr[0][0];
            for (int b = 0; b < arr[a].length; b++) {
                if (arr[a][b] < min) {
                    min = arr[a][b];
                }
            }
        }
        return min;
    }

    public static int max(int[][] arr) {
        int max = arr[0][0];

        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[a].length; b++) {
                if (arr[a][b] > max) {
                    max = arr[a][b];
                }                
            }            
        }
        return max;
    }
}
