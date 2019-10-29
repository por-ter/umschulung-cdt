package filesorter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CopyPaste {

    public static void main(String[] args) {
        
        // Basically copies and pastes specified file into different folder and renames it
        try {
            Path temp = Files.move(Paths.get("C:\\Users\\d.porter\\Documents\\Aufgabe - Folder Sorter\\Source\\Transcript.docx"),
                    Paths.get("C:\\Users\\d.porter\\Documents\\Aufgabe - Folder Sorter\\Source\\Test\\TranscriptCopy.docx"));
            
            if(temp != null){
                System.out.println("File renamed and moved successfully");
            }else{
                System.out.println("Failed to move file");
            }
            
        } catch (IOException ex) {
            Logger.getLogger(CopyPaste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
