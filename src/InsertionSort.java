public class InsertionSort {

    public static void sort(int[] array, boolean decrescente) {
        if (decrescente) {
            sortDesc(array);
        } else {
            sortAsc(array);
        }
    }

    // Método de ordenação crescente
    public static void sortAsc(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    // Método de ordenação decrescente
    public static void sortDesc(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};

        System.out.println("Array original:");
        printArray(array);

        sort(array, false);
        System.out.println("Array ordenado em ordem crescente:");
        printArray(array);

        sort(array, true);
        System.out.println("Array ordenado em ordem decrescente:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
