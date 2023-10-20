/*in the program use currentfilename and newfilename and method of renameTo
 * and rename falename is successfuly
 * */
package filehandling;

import java.io.File;

public class file_rename_03 {
    public static void main(String[] args) {
        File currentfilename = new File("filehandling/oppo.txt");
        File newfilename = new File("realme.txt");

        boolean value = currentfilename.renameTo(newfilename);

        if (value) {
            System.out.println("file rename is succesfully");
        } else {
            System.out.println("file rename failed");
        }
    }
}
