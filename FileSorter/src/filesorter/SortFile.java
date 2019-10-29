/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesorter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.ATOMIC_MOVE;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class SortFile {

    public static void main(String[] args){
        //opendirectorydialog
        File source = new File("C:\\Users\\d.porter\\Documents\\Aufgabe - Folder Sorter\\Test6");       
        
        String[] filesInDir = source.list();
        Arrays.sort(filesInDir);

        ArrayList<String> fileTypes = new ArrayList<>();

        for (int i = 0; i < filesInDir.length; i++) {
            fileTypes.add(filesInDir[i].substring(filesInDir[i].lastIndexOf(".") + 1));
        }
        
        List test = fileTypes;
        seperateDuplicates(test);
        createFolders(test, source);
        
        try{
            for(int j = 0; j < filesInDir.length; j++){
            Path fileSource = Paths.get(source+"\\"+filesInDir[j]);
            Path fileDestination = Paths.get(source+"\\"+filesInDir[j].substring(filesInDir[j].lastIndexOf(".") + 1)+"\\"+filesInDir[j]);
            Files.move(fileSource, fileDestination, ATOMIC_MOVE);
        }
        }catch(IOException e){
            System.out.println("No datein in Ordner to move");
            System.exit(0);
        }
    }
    
    public static void createFolders(List test, File source){
        for(int i = 0; i < test.size(); i++){
            File f = new File(source + "\\" + test.get(i).toString());
            if(f.mkdir()){
                System.out.println("created");
            }else{
                System.out.println("cannot be created/already exists");
            }
        }
    }
    
    public static List seperateDuplicates(List test){
        Set<String> set = new HashSet<>(test);
        test.clear();
        test.addAll(set);
        
        return test;
    }

    /*
    get all files in folder
    foreach file
    if
        directory exists --> move
    else
        directory not exists --> create, move
    */
    
    
}
