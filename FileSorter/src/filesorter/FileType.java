/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesorter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author d.porter
 */
public class FileType {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Stream<Path> walk = Files.walk(Paths.get("C:\\Users\\d.porter\\Documents\\Aufgabe - Folder Sorter\\Source"))) {

            List<String> result = walk.filter(Files::isRegularFile)
                    .map(x -> x.toString()).collect(Collectors.toList());

            result.forEach(System.out::println);
            

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
