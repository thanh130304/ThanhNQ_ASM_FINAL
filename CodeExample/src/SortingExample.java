import java.util.Random;

public class SortingExample {

    // Bubble Sort
    public static void bubbleSort(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Quick Sort
    public static void quickSort(double[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(double[] arr, int low, int high) {
        double pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int size = 1000; // Example array size (can be adjusted)
        double[] arrBubbleSort = new double[size];
        double[] arrQuickSort = new double[size];

        // Generate random array
        for (int i = 0; i < size; i++) {
            double value = random.nextDouble() * 100; // Random value between 0 and 100
            arrBubbleSort[i] = value;
            arrQuickSort[i] = value;
        }

        // Bubble Sort
        long startTime = System.nanoTime();
        bubbleSort(arrBubbleSort);
        long endTime = System.nanoTime();
        System.out.println("Bubble Sort executed in " + (endTime - startTime) + " nanoseconds");

        // Quick Sort
        startTime = System.nanoTime();
        quickSort(arrQuickSort, 0, arrQuickSort.length - 1);
        endTime = System.nanoTime();
        System.out.println("Quick Sort executed in " + (endTime - startTime) + " nanoseconds");

        // Optionally, display sorted arrays (only if necessary)
        // System.out.println("Bubble Sort Result: " + Arrays.toString(arrBubbleSort));
        // System.out.println("Quick Sort Result: " + Arrays.toString(arrQuickSort));
    }
}
