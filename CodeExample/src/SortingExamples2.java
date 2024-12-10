public class SortingExamples2 {

    // Bubble Sort with O(1) space complexity
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Quick Sort with O(log n) space complexity
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);  // Left part
            quickSort(arr, pi + 1, high); // Right part
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // Index of smaller element
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap the pivot element to its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // Method to print an array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example array
        int[] arrBubble = {64, 25, 12, 22, 11};
        int[] arrQuick = {64, 25, 12, 22, 11};

        // Display array before sorting
        System.out.println("Bubble Sort Example (Space Complexity O(1))");
        System.out.println("Array before sorting:");
        printArray(arrBubble);

        // Perform Bubble Sort
        bubbleSort(arrBubble);
        System.out.println("Array after sorting using Bubble Sort:");
        printArray(arrBubble);

        // Display array before sorting for Quick Sort
        System.out.println("\nQuick Sort Example (Space Complexity O(log n))");
        System.out.println("Array before sorting:");
        printArray(arrQuick);

        // Perform Quick Sort
        quickSort(arrQuick, 0, arrQuick.length - 1);
        System.out.println("Array after sorting using Quick Sort:");
        printArray(arrQuick);
    }
}