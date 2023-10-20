/*
 * in the program use a filewrittwer() and createNewFile() method
 * and create new file and write this file
 * this program is real word program
 * */
package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class file_writer_02 {
    public static void main(String[] args) {
        File one = new File("filehandling/ramfile1.txt");
        try {
            one.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileWriter myfile = new FileWriter("filehandling/ramfile1.txt");
            myfile.write("ram patil creted by  second file");
            myfile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
