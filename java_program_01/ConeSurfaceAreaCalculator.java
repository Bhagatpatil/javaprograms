import java.util.Scanner;

public class ConeSurfaceAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the radius and slant height of the cone
        System.out.print("Enter the radius of the cone's base: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the slant height of the cone: ");
        double slantHeight = scanner.nextDouble();

        // Calculate the surface area of the cone
        double surfaceArea = Math.PI * radius * (radius + slantHeight);

        // Output the result
        System.out.println("Surface area of the cone: " + surfaceArea);

        // Close the scanner
        scanner.close();
    }
}
