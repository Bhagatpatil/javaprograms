import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file_handling_01 {
    public static void main(String[] args) {
        File obj = new File("ram1.txt");
        try{
        Scanner sc = new Scanner(obj);
        String line = sc.nextLine();
        System.out.println(line);
        }catch(FileNotFoundException e){
           System.out.println(e);
        }
    }
}
