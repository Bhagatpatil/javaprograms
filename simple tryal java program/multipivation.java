import java.io.FileWriter;
import java.io.IOException;

public class multipivation {
    public static void main(String[] args) {
        String outputFileName = "multiplication_table.txt";

        try (FileWriter writer = new FileWriter(outputFileName)) {
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                        
                    int product = i * j;
                    String line = i + " x " + j + " = " + product + "\n";
                    
                    writer.write(line);
                  
                    
                }
                
            }
            System.out.println("Multiplication table from 1 to 10 has been saved to '" + outputFileName + "'.");
          
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
