/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Ing. Douglas Barrios
 * @author: Julián Divas, Derek Coronado y Andrés Ismalej
 * Creación: 08/02/2025
 * última modificación: -
 * File Name: Main.java
 * Descripción: clase main para ejecutar el ordenamiento de los 3000 números.
 */
public class Main {
    public static void main(String[] args) {
        Sorts sorts = new Sorts();

        // Generar un array de 3000 números aleatorios
        Integer[] originalArray = sorts.generador(3000, 5000);

        System.out.println("\n--- Profiling de algoritmos de ordenamiento ---\n");

        // Insertion Sort
        {
            Integer[] arr = originalArray.clone();
            long timeInsertion = Profiler.measureTime(() -> sorts.insertionSort(arr));
            long memoryInsertion = Profiler.measureMemory(() -> sorts.insertionSort(arr));
            System.out.println("Insertion Sort: Tiempo = " + timeInsertion / 1_000_000 + " ms, Memoria = " + memoryInsertion / 1024 + " KB");
        }

        // Selection Sort
        {
            Integer[] arr = originalArray.clone();
            long timeSelection = Profiler.measureTime(() -> sorts.selectionSort(arr));
            long memorySelection = Profiler.measureMemory(() -> sorts.selectionSort(arr));
            System.out.println("Selection Sort: Tiempo = " + timeSelection / 1_000_000 + " ms, Memoria = " + memorySelection / 1024 + " KB");
        }

        // Quick Sort
        {
            Integer[] arr = originalArray.clone();
            long timeQuick = Profiler.measureTime(() -> sorts.quickSort(arr));
            long memoryQuick = Profiler.measureMemory(() -> sorts.quickSort(arr));
            System.out.println("Quick Sort: Tiempo = " + timeQuick / 1_000_000 + " ms, Memoria = " + memoryQuick / 1024 + " KB");
        }

        // Radix Sort
        {
            Integer[] arr = originalArray.clone();
            long timeRadix = Profiler.measureTime(() -> sorts.radixSort(arr));
            long memoryRadix = Profiler.measureMemory(() -> sorts.radixSort(arr));
            System.out.println("Radix Sort: Tiempo = " + timeRadix / 1_000_000 + " ms, Memoria = " + memoryRadix / 1024 + " KB");
        }
    }
}
