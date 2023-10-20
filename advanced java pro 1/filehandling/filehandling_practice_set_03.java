/*in the program use a createNewFile and Filewriter and create new file and in the file print
 * multipication table
 * */
package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filehandling_practice_set_03 {
    public static void main(String[] args) {
        File file = new File("filehandling/practicefile3.txt");
        try {
            boolean isfile = file.createNewFile();
            if (isfile) {
                System.out.println("create new file ");
            } else {
                System.out.println("This file already exist");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileWriter obj = new FileWriter("filehandling/practicefile3.txt");

            for (int num = 1; num <= 10; num++) {
                for (int i = 1; i <= 10; i++) {
                    String line = i + " x " + num + " = " + i * num + "\t\t";
                    obj.write(line);
                }
                obj.write("\n");
            }
            obj.close();
            System.out.println("multiplication tabel save as  practicefile3  ");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
