import java.util.Arrays;

    public class HeapSort {
        public static void main(String[] args) {
            int[] arr = new int[] {4, 7, 3, 1, 9, 2, 6, 8, 10, 5};
            System.out.println(Arrays.toString(arr));
            heapSort(arr);
            System.out.print(Arrays.toString(arr));
        }
        public static void heapSort(int[] arr) {
            for (int i = (arr.length / 2) - 1; i >= 0; i--) {
                heaping(arr, arr.length, i);
            }
            for (int i = arr.length - 1; i >= 0; i--) {
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
                heaping(arr, i, 0);
            }
        }
        public static void heaping(int[] arr, int heapSize, int rootIndex) {
            int largest = rootIndex;
            int leftChild = 2 * rootIndex + 1;
            int rightChild = 2 * rootIndex + 2;
            if (leftChild < heapSize && arr[leftChild] > arr[largest]) {
                largest = leftChild;
            }
            if (rightChild < heapSize && arr[rightChild] > arr[largest]) {
                largest = rightChild;
            }
            if (largest != rootIndex) {
                int temp = arr[rootIndex];
                arr[rootIndex] = arr[largest];
                arr[largest] = temp;
                heaping(arr, heapSize, largest);
            }
        }
    }

