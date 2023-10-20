/*in the program use currentfilename and newfilename and method of renameTo
 * and rename falename is successfuly
 * */
package filehandling;

import java.io.File;

public class file_rename_02 {
    public static void main(String[] args) {


        File currentFile = new File("filehandling/Bhagat");
        File Newfile = new File("filehandling/ram.txt");

        boolean success = currentFile.renameTo(Newfile);

        if (success) {
            System.out.println("file rename succesfully");
        } else {
            System.out.println("file name failed");
        }

    }

}
