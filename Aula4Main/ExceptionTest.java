package Aula4Main;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            int [] array = new int[5];
            int length = arrayLenght(array);
            int value = getValueFromArrayCatch(array, 10);
            int result = divideCatch(10, value);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("An arithmetic error occurred: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("A null pointer error occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An array index out of bounds error occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }
    
    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
    public static int divideCatch(int dividend, int divisor) {
        try {
            if (divisor == 0) {
                throw new ArithmeticException("Divisor cannot be zero");
            }
            return dividend / divisor;
        } catch (ArithmeticException e) {
            System.out.println("An arithmetic error occurred: " + e.getMessage());
            return 9999999;
        }
    }
    public static int getValueFromArray(int[] array, int index) {
        return array[index];
    }

    public static int getValueFromArrayCatch(int[] array, int index) {
        try {
            return array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds error occurred: " + e.getMessage());
            return 0;
        }
    }
    public static int arrayLenght(int[] array) {
        return array.length;
    }
}
