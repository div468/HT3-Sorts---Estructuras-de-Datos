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
        
        int[] arr = sorts.generador(10, 500);
        System.out.println("Ordenamiento con insertion sort:");
        sorts.insertionSort(arr);
        sorts.printA(arr);

        System.out.println("Ordenamiento con selction sort:");
        sorts.selectionSort(arr);
        sorts.printA(arr);


    }
}