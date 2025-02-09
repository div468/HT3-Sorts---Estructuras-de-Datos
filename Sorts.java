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
     * @param array 
     */
    public void insertionSort(int [] array){
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

    public void printA(int[] array) {
        for (int i = 0; i < array.length; ++i){
            System.out.println(array[i] + "");
        }
        System.out.println();
    }
}

