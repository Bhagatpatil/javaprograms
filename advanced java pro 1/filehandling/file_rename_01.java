/*in the program use currentfilename and newfilename and method of renameTo
 * and rename falename is successfuly*/
package filehandling;

import java.io.File;

public class file_rename_01 {
    public static void main(String[] args) {

        File currentFile = new File("filehandling/newfile.txt");
        File newFile = new File("filehandling/oldfile.txt");

        /* Rename the file */
        boolean success = currentFile.renameTo(newFile);

        if (success) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("File rename failed.");
        }
    }
}
