package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file_reading_04 {
    public static void main(String[] args) {
        File obj = new File("filehandling/ramfile1.txt");
        try {
            Scanner sc = new Scanner(obj);
            String ob = sc.nextLine();
            System.out.println(ob);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
