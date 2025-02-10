/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Ing. Douglas Barrios
 * @author: Julián Divas, Derek Coronado y Andrés Ismalej
 * Creación: 08/02/2025
 * última modificación: -
 * File Name: Profiler.java
 * Descripción: Clase utilitaria para medir el tiempo y consumo de memoria de algoritmos de ordenamiento.
 */

 public class Profiler {

    /**
     * Mide el tiempo de ejecución de un método de ordenamiento.
     * 
     * @param sortMethod El método de ordenamiento a ejecutar.
     * @return El tiempo de ejecución en nanosegundos.
     */
    public static long measureTime(Runnable sortMethod) {
        long startTime = System.nanoTime();
        sortMethod.run();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    /**
     * Mide el consumo de memoria de un método de ordenamiento.
     * 
     * @param sortMethod El método de ordenamiento a ejecutar.
     * @return La cantidad de memoria utilizada en bytes.
     */
    public static long measureMemory(Runnable sortMethod) {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc(); // Solicitar la recolección de basura para obtener una medición más precisa.

        long beforeMemory = runtime.totalMemory() - runtime.freeMemory();
        sortMethod.run();
        long afterMemory = runtime.totalMemory() - runtime.freeMemory();

        return afterMemory - beforeMemory;
    }
}

