package seos;

public class SchaltBerech {

    public static int schalt(int jahr) {
        int leap = 0;

        if (jahr % 4 == 0 && (jahr % 100 != 0 || jahr % 400 == 0)) {
            leap = 0;
        } else {
            leap = 1;
        }
        return leap;
    }
}
