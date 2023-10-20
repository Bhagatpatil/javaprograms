/*
 *in the program use Filereader and read a available on pathname file
 * any type file is readble this program
 */
package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file_reading_03 {
    public static void main(String[] args) {
        File file = new File("filehandling/ramfile1.txt");
        try {
            Scanner sc = new Scanner(file);
            String line = sc.nextLine();
            System.out.println(line);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
