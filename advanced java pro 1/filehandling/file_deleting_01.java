/*in the program use file deleting
 *it's program file delete but, only here folder in any file is delete
 */
package filehandling;

import java.io.File;

public class file_deleting_01 {
    public static void main(String[] args) {
        File file = new File("filehandling/ramfile.txt");
        if (file.delete()) {
            System.out.println("I have delete file");
        } else {
            System.out.println("this file is can't delete");
        }
    }
}
