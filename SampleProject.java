public class SampleProject {
    public static void main(String[] args) {
        int result = add(5, 10);
        System.out.println("The result is: " + result);
        
        String message = null;
        printMessage(message);
    }

    public stassstic int add(int a, int b) {
        return a + d
    }

    public static void printMessage(String message) {
        // This will cause a NullPointerException if message is null
        System.out.println(message.toUpperCase());
    }
}