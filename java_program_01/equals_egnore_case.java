public class equals_egnore_case {
    public static void main(String[] args) {
        String name = "RAm";
        System.out.println(name.equalsIgnoreCase("Ram"));

        // output is = true

        String name1 = "John"; // Initialize the 'name' variable with a value
        System.out.println(name1.equalsIgnoreCase("johna"));

        // output is = false

        String name2= "navnath";
        System.out.println(name2.equalsIgnoreCase("navnah"));

    }

}
