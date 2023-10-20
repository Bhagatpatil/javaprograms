/*in the program use createNewFile() method and create new file
 * */
package filehandling;

import java.io.File;
import java.io.IOException;

public class file_creating_01 {
    public static void main(String[] args) {
        File fname = new File("filehandling/newramfile1.txt");
        try {
            boolean isfile = fname.createNewFile();
            if (isfile) {
                System.out.println("Create new file");
            } else {
                System.out.println("This file is already exist");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
