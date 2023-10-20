/*
in the program use Filereader and read a available on pathname file
* any type file is readble this program
*/
package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file_reading_02 {
    public static void main(String[] args) {
        File obj2 = new File("filehandling/ramfile2.txt");

        try {
            Scanner sc = new Scanner(obj2);
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
