package temp.task050103_v01;


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
