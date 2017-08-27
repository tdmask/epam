package task05.task0501.task050103;
// ver.2
public class Stopwatch {
    static private long startTime;
    static private long stopTime;


    public static void start(){
        startTime = System.currentTimeMillis();

    }
    public static void stop() {
        stopTime = System.currentTimeMillis();
        System.out.println("duration: " + (stopTime-startTime) + " ms");
    }
}
