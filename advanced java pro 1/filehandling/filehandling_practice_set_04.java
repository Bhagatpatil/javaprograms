/*in the program use a createNewFile and Filewriter and create new file and in the file print
 * multipication table
 * */
package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filehandling_practice_set_04 {
    public static void main(String[] args) {
        File obj = new File("filehandling/practicefile4.txt");
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

        try {
            FileWriter obj1 = new FileWriter("filehandling/practicefile4.txt");
            for (int num = 1; num <= 10; num++) {
                for (int i = 1; i <= 10; i++) {
                    String store = i + "X" + num + "=" + (num * i) + "\t\t";
                    obj1.write(store);
                }
                obj1.write("\n");
            }
            obj1.close();
            System.out.println("save multiplication table in practicefile4 ");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
