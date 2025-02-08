public class SampleProject {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int sum = add(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);

        String message = "Hello, World!";
        printMessage(message);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void printMessage(String message) {
        if (message != null) {
            System.out.println(message.toUpperCase());
        } else {
            System.out.println("No message provided.");
        }
    }
}
