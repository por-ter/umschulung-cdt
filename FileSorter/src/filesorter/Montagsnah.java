package filesorter;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;

public class Montagsnah {

    public static void main(String[] args) throws IOException {
        File dir = new File("C:\\Users\\d.porter\\Documents\\AUFTEST");
        File destinationDir = new File("C:\\Users\\d.porter\\Documents\\!ZumTesten");

        System.out.println("Getting all files in " + dir.getCanonicalPath() + " including those in subdirectories");

        organiseDir(dir, destinationDir);

        System.out.println("\n\nDelete empty folders and sub folders? (Y/N)");
        Scanner eing = new Scanner(System.in);
        String inp = eing.nextLine();

        if (inp.equalsIgnoreCase("Y")) {
            removeDir(dir);
        } else {
            System.exit(0);
        }

    }

    public static void organiseDir(File dir, File destinationDir) {
        try {
            List<File> files = (List<File>) FileUtils.listFiles(dir, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);

            String extensionType;
            File destination = null;

            for (File file : files) {             
                extensionType = FilenameUtils.getExtension(file.getCanonicalPath());
                createFolder(destinationDir, extensionType);
                destination = new File(destinationDir + "\\" + extensionType);
                FileUtils.moveFileToDirectory(file, destination, true);
            }

            System.out.println("All files moved");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void removeDir(final File folder) {
        Scanner eing = new Scanner(System.in);
        String prompt;
        // check if folder file is a real folder
        if (folder.isDirectory()) {
            File[] list = folder.listFiles();
            if (list != null) {
                for (int i = 0; i < list.length; i++) {
                    File tmpF = list[i];
                    if (tmpF.isDirectory()) {
                        removeDir(tmpF);
                    }
                    if (tmpF.length() == 0) {
                        System.out.println("Delete dir = " + tmpF + " (Y/N)?" );
                        prompt = eing.nextLine();
                        if(prompt.equalsIgnoreCase("y")){
                            tmpF.delete();
                            System.out.println(tmpF + " was empty and has been deleted");                        
                        }                        
                    }
                }
            }
            if (!folder.delete()) {
                System.out.println("can't delete folder : " + folder);
            }
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
