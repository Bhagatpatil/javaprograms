/*in the program use a createNewFile and Filewriter and create new file and in the file print
 * multipication table
 * */
package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filehandling_practice_set_01 {
    public static void main(String[] args) {

        //code of createNewFile
        File obj = new File("filehandling/practicefile1.txt");
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

        // code of multipication table
        int i = 19;
        String table = "";
        for (int j = 1; j <= 10; j++) {
            table += i + "X" + (j) + "=" + i * j;
            table += "\n";
        }


        //code of file writer
        try {
            FileWriter obj1 = new FileWriter("filehandling/practicefile1.txt");
            obj1.write(table);
            obj1.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
