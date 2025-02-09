import java.util.Random;

public class Sorts {

    /*
     * Generador de Array con números al azar.
     * @param array Array de enteros al azar.
     */
    public int[] generador(int tamanio, int limite) {
        int[] array = new int[tamanio];
        Random random = new Random();
        for (int i = 0; i < tamanio; i++) {
            array[i] = random.nextInt(limite);
        } 
        return array;
    }

    /*
     * Ordenamiento de Array con el algoritmo de Insertion Sort.
     * @param array Array de enteros desordenado.
     */
    public void insertionSort(int [] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int clave = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > clave) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = clave;
        }
    }

    /*
     * Ordenamiento de Array con el algoritmo de Selection Sort.
     * @param array Array de enteros desordenado.
     */
    public void selectionSort(int [] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int indice = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[indice]) {
                    indice = j;
                }
            }
            int pivot = array[indice];
            array[indice] = array[i];
            array[i] = pivot;
        }
    }

    /*
     * Ordenamiento de Array con el algoritmo de Quick Sort.
     * @param array Array de enteros desordenado.
     */
    public void quickSort(int[] array) {
        quickSortRecursive(array, 0, array.length - 1);
    }

    private void quickSortRecursive(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSortRecursive(array, low, pi - 1);
            quickSortRecursive(array, pi + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    /*
     * Ordenamiento de Array con el algoritmo de Radix Sort.
     * @param array Array de enteros desordenado.
     */
    public void radixSort(int[] array) {
        int max = getMax(array);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(array, exp);
        }
    }

    private int getMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private void countingSort(int[] array, int exp) {
        int n = array.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            int index = (array[i] / exp) % 10;
            count[index]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int index = (array[i] / exp) % 10;
            output[count[index] - 1] = array[i];
            count[index]--;
        }

        for (int i = 0; i < n; i++) {
            array[i] = output[i];
        }
    }

    /*
     * Método para imprimir el Array.
     * @param array Array de enteros.
     */
    public void printA(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }
}
