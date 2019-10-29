package practiceexercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTxt {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("C:\\Users\\d.porter\\Documents\\AUFTEST\\new8.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        String st;
        
        while((st = br.readLine()) != null){
//            System.out.println(st);
        }
        
        FileReader fr = new FileReader("C:\\Users\\d.porter\\Documents\\AUFTEST\\new8.txt");
        
        int i;
        while ((i = fr.read()) != -1){
            System.out.print((char) i);
//            System.out.println(i);
        }
        
    }

}
