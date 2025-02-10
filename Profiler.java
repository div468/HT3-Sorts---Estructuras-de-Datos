public class Profiler {

    public static long measureTime(Runnable sortMethod) {
        long startTime = System.nanoTime();
        sortMethod.run();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long measureMemory(Runnable sortMethod) {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc(); 

        long beforeMemory = runtime.totalMemory() - runtime.freeMemory();
        sortMethod.run();
        long afterMemory = runtime.totalMemory() - runtime.freeMemory();

        return afterMemory - beforeMemory;
    }
}
