public class idk{
    public static void main(String[] args) {
        try {
            // Code that might throw exceptions
            int[] numbers = {1, 2, 3};

            // Accessing an element beyond the array's bounds
            int result = numbers[5]; // This will cause an ArrayIndexOutOfBoundsException

            // Attempting division by zero
            result = 10 / 0; // This won't be reached
        } catch (ArithmeticException e) {
            // Catch block for ArithmeticException
            System.err.println("Caught ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch block for ArrayIndexOutOfBoundsException
            System.err.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            // Generic catch block for any other exceptions
            System.err.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Continuing after try-catch blocks");
    }
}
