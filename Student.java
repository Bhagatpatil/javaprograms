public class Student {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("    Name: " + name);
        System.out.println("    Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an instance of Student using the constructor
        Student student1 = new Student("Alice", 20);

        // Displaying student information using the displayInfo method
        System.out.println("Student 1:");
        student1.displayInfo();

        // Creating another instance of Student using the constructor
        Student student2 = new Student("Bob", 22);

        // Displaying student information using the displayInfo method
        System.out.println("\nStudent 2:");
        student2.displayInfo();
    }
}