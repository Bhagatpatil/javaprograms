public class average_of_marks {
    public static void main(String[] args) {
        float[] marks = { 45.2f, 78.3f, 35.6f, 65.8f, 56.9f };
        float sum = 0;
        for (float element : marks) {

            sum = sum + element;

        }
        System.out.println(" average of marks   =  " +sum / marks.length);
    }

}
