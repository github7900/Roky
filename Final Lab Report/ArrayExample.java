public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = null;
        int size = -5;

        try {
            if (size < 0) {
                throw new NegativeArraySizeException("Array size cannot be negative");
            }
            arr = new int[size];
            System.out.println("Array created successfully");
        } catch (NegativeArraySizeException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            if (arr == null) {
                System.out.println("Array creation failed");
            }
        }
    }
}