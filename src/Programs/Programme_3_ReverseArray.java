package Programs;

/**
 * Write a Java program to reverse an array of integer values.
 */
public class Programme_3_ReverseArray {
    //Main method
        public static void main(String[] args) {
            int[] originalArray = {1, 2, 3, 4, 5};
            int[] reversedArray = reverse(originalArray);

            System.out.println("Original Array:");
            printArray(originalArray);

            System.out.println("Reversed Array:");
            printArray(reversedArray);
        }

        // Function to reverse an array
        public static int[] reverse(int[] arr) {
            int length = arr.length;
            int[] reversed = new int[length];

            for (int i = 0; i < length; i++) {
                reversed[i] = arr[length - 1 - i];
            }

            return reversed;
        }

        // Function to print an array
        public static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
}

