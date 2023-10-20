/*in the program use createNewFile() method and create new file
 * */
package filehandling;

import java.io.File;
import java.io.IOException;

public class file_creating_03 {
    public static void main(String[] args) {
        File name = new File("filehandling/newramfile3.txt");
        try {
            boolean isfile = name.createNewFile();
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
