import java.io.File;

public class bhagat {
    public static void main(String[] args) {
        File file = new File("new.text");

        try{
            boolean value = file.createNewFile();
            
            

            if (value)
            {
                System.out.println("the new file");
            } else {
                System.out.println("the file already exist");
            }
        }
         catch (Exception e) {
            e.getStackTrace();
            
        }
    }
}
