/*
 * in the program use a filewrittwer() and createNewFile() method
 * and create new file and write this file
 * this program is real word program
 * */
package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class file_writer_01 {
    public static void main(String[] args) {
        //code to create new file
       /* File myfile = new File("ramfile.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("can not create file because error");
            throw new RuntimeException(e);
        }*/


        //code to write to a file
        try {
            FileWriter myfilewriter = new FileWriter("filehandling/ramfile0.txt");
            myfilewriter.write("this is file is created by ram patil  \n Thanks for visit");
            myfilewriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
