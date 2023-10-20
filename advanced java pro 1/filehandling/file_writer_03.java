/*
 * in the program use a filewrittwer() and createNewFile() method
 * and create new file and write this file
 * this program is real word program
 * */
package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class file_writer_03 {
    public static void main(String[] args) {
        File obj = new File("filehandling/ramfile2.txt");
        try {
            obj.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileWriter obj1 = new FileWriter("filehandling/ramfile2.txt");
            obj1.write("This file created by ram patil \n it is thrred file \n Thanks for visit");
            obj1.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
