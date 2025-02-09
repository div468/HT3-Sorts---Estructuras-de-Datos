/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Ing. Douglas Barrios
 * @author: Julián Divas, Derek Coronado y Andrés Ismalej
 * Creación: 08/02/2025
 * última modificación: -
 * File Name: Sorts.java
 * Descripción: clase Sorts con métodos para ejecutar los diferentes 
 * tipos de ordenamientos.
 */

import java.util.Random;

public class Sorts{

    /*
     * Generador de Array con números al azar.
     * @param array Array de enteros al azar.
     */
    public int[] generador(int tamanio, int limite) {
        // Se define el array de enteros con un tamaño variable.
        int[] array = new int[tamanio];
        Random random = new Random();

        // Se crea el array de enteros al azar segun el limite de números a elegir. 
        for (int i = 0; i < tamanio; i++) {
            array[i] = random.nextInt(limite);
        } 
        return array;
    }
    
    /*
     * Ordenamiento de Array con el algoritmo de Insertion Sort.
     * @param array Array de enteros desordenado.
     */
    public void insertionSort(int [] array){
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int clave = array[i];
            int j = i - 1;

            // Mueve adelante los numeros mayores a la "clave".
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
        // Define n como el tamaño del array.
        int n = array.length;

        // Recorre todo el array.
        for (int i = 0; i < n - 1; i++) {
            // Encuentra el indice del número menor de la parte desordenada.
            int indice = i;
            for (int j = i +1; j < n; j++) {
                if (array[j] < array[indice]) {
                    indice = j;
                }
            }

            // Intercambia el elemento menor con el primero elemento de la parte desordenada.
            int pivot = array[indice];
            array[indice] = array[i];
            array[i] = pivot;
        }
    }

    public void printA(int[] array) {
        // Recorre todo el array.
        for (int i = 0; i < array.length; ++i){
            // Imprime cada posición del array.
            System.out.println(array[i] + "");
        }
        // Espacio entre números. 
        System.out.println();
    }
}

