/*in the program use a createNewFile and Filewriter and create new file and in the file print
 * multipication table
 * */
package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filehandling_practice_set_02 {
    public static void main(String[] args) {

        File fil = new File("filehandling/practicefile2.txt");
        try {
            boolean isfile = fil.createNewFile();
            if (isfile) {
                System.out.println("create new file");
            } else {
                System.out.println("This file is already created");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int i = 1;
        int num = 20;
        String table = "";
        for (i = 1; i <= 10; i++) {
            table += num + "x" + (i) + "=" + num * i;
            table += "\n";

        }


        try {
            FileWriter obj = new FileWriter("filehandling/practicefile2.txt");
            obj.write(table);
            obj.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
