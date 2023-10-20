/*in the program use for delete the file*/
package filehandling;

import java.io.File;

public class file_deleting_03 {
    public static void main(String[] args) {
        File file = new File("filehandling/ramfile0.txt");
        if (file.delete()) {
            System.out.println("file is delete");
        } else {
            System.out.println("file is can't delete");
        }
    }
}
