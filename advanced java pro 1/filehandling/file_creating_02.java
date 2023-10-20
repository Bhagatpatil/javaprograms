/*in the program use createNewFile() method and create new file
 * */
package filehandling;

import java.io.File;
import java.io.IOException;

public class file_creating_02 {
    public static void main(String[] args) {
        File obj = new File("filehandling/newramfile2.txt");
        try {
            boolean isfile = obj.createNewFile();

            if (isfile) {
                System.out.println("create new file");
            } else {
                System.out.println("This file is already exist");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
