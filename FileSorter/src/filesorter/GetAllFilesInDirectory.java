package filesorter;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;

public class GetAllFilesInDirectory {

    public static void main(String[] args) throws IOException {
        File dir = new File("C:\\Users\\d.porter\\Documents\\Aufgabe - Folder Sorter");

        System.out.println("Getting all files in " + dir.getCanonicalPath() + " including those in subdirectories");

        try {
            List<File> files = (List<File>) FileUtils.listFiles(dir, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);
            for (File file : files) {
                System.out.println("file: " + file.getCanonicalPath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
