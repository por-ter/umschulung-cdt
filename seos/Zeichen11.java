package seos;

// Replace a certain letter at a specific point
public class Zeichen11 {

    public static void main(String[] args) {
//        String myName = "domanokz";
//        String newName = myName.substring(0, 4) + 'x' + myName.substring(5);
//
//        System.out.println(newName);
//
//        String test = "Here is a complete sentence!";
//
//        String newTest = test.substring(0, 20) + 'B' + test.substring(21);
//
//        System.out.println(newTest);

        String str = "this is a test";
        System.out.println(replaceCharAt(str, 8, 'K'));
    }

    public static String replaceCharAt(String s, int pos, char c) {
        return s.substring(0, pos) + c + s.substring(pos + 1);
    }
}
