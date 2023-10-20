/*in the program use file deleting
 *it's program file delete but, only here folder in any file is delete
 */
package filehandling;

import java.io.File;

public class file_deleting_02 {
    public static void main(String[] args) {
        File obj = new File("filehandling/ramfile1.txt");
        if (obj.delete()) {
            System.out.println("delete the file");
        } else {

            System.out.println("con't delete the file");
        }
    }
}
