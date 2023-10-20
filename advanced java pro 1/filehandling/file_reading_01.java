/*
in the program use Filereader and read a available on pathname file
* any type file is readble this program
*/
package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file_reading_01 {
    public static void main(String[] args) {
        File obj1 = new File("filehandling/ramfile3.txt");
        try {
            Scanner sc = new Scanner(obj1);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
