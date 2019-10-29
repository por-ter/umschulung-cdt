package filesorter;

import java.io.File;

public class DeleteEmptyDir {

    public static void main(String[] args) {

        File dir = new File("C:\\Users\\d.porter\\Documents\\AUFTEST\\TEST");

        removeDir(dir);

    }

    public static void removeDir(final File folder) {
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
                        System.out.println(folder + " was empty and has been deleted");
                        tmpF.delete();
                    }
                }
            }
            if (!folder.delete()) {
                System.out.println("can't delete folder : " + folder);
            }
        }
    }

}
