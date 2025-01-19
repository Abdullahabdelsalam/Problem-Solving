package programsSE.datatypes;

public class GarbageCollection {
    public static void main(String s[]) throws Exception
    {
        Runtime runtime  =  Runtime.getRuntime();
        System.out.println("Free memory in JVM before Garbage Collection = "+runtime .freeMemory());
                runtime .gc();
        System.out.println("Free memory in JVM after Garbage Collection = "+runtime .freeMemory());
    }
}
