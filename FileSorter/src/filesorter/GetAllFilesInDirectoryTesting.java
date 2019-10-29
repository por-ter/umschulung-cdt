package filesorter;

import static filesorter.RecursiveFileDisplay.displayDirectoryContents;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;

public class GetAllFilesInDirectoryTesting {

    public static void main(String[] args) throws IOException {
        File dir = new File("C:\\Users\\d.porter\\Documents\\Aufgabe - Folder Sorter");
        File destinationDir = new File("C:\\Users\\d.porter\\Documents\\!ZumTesten");

        System.out.println("Getting all files in " + dir.getCanonicalPath() + " including those in subdirectories");

        try {
            List<File> files = (List<File>) FileUtils.listFiles(dir, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);
            File[] subDirs = dir.listFiles((FileFilter) DirectoryFileFilter.DIRECTORY);

            String extensionType;
            File destination = null;
            for (File file : files) {
//                System.out.println("file: " + file.getCanonicalPath());                
                extensionType = FilenameUtils.getExtension(file.getCanonicalPath());
//                System.out.println(extensionType);
                createFolder(destinationDir, extensionType);
                destination = new File(destinationDir + "\\" + extensionType);
                FileUtils.moveFileToDirectory(file, destination, true);
            }

            for (File dirs : subDirs) {
                System.out.println("Directory: " + dirs.getName());

                if (dirs.length() == 0) {
                    System.out.println("deletable");
                } else {
                    System.out.println(dirs.length());
                }

//                if (file.isDirectory()){
//                    System.out.println("directory: " + file.getCanonicalPath());
//                    displayDirectoryContents(file);
//                }
            }
            

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createFolder(File destinationDir, String extensionType) {
        File f = null;
        f = new File(destinationDir + "\\" + extensionType);

        if (f.mkdir()) {
            System.out.println("new folder created");
        } else {
            System.out.println("cannot be created/already exists");
        }
    }
}
