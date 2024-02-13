public class BugExample {

    public static void main(String[] args) {
        // Intentional bug: Division by zero
        int result = divideByZero();

        // Intentional bug: Null pointer exception
        String text = null;
        int length = text.length();

        System.out.println("Result: " + result);
    }

    private static int divideByZero() {
        return 10 / 0;
    }
}
