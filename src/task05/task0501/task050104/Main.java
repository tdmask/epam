package task05.task0501.task050104;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Main {
    private static final int TOTAL = 100_000_000;
    private static final int NUM_THREADS = 8;
    private static final int MIN_RANGE = 20;
    private static final int RANDOM_RANGE = 100;

    final static int[] array = new int[TOTAL];

    public static void main(String[] args) {
        // filling Array
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * RANDOM_RANGE);
        }
        ForkJoinPool pool = new ForkJoinPool(NUM_THREADS);
        Stopwatch.start();
        int sum = pool.invoke(new Adder(0, TOTAL - 1));
        System.out.print("Result (ForkJoin way): " + sum + ". \t");
        Stopwatch.stop();
        int sumForTest = 0;
        Stopwatch.start();
        for (int i = 0; i < TOTAL; i++) {
            sumForTest = sumForTest + array[i];
        }
        System.out.print("Result (usual way)   : " + sumForTest + ". \t");
        Stopwatch.stop();
    }

    static class Adder extends RecursiveTask<Integer> {
        int start, end;

        public Adder(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {
            if ((end - start) <= MIN_RANGE) {
                int localSum = 0;
                for (int i = start; i <= end; i++) {
                    localSum = localSum + array[i];
                }
//                System.out.printf("--[adding]: Array's range is [%d - %d]. Adder = %d \n", start, end, localSum);
                return localSum;
            } else {
                int mid = (start + end) / 2;
//                System.out.printf("--[splitting]: Array's ranges are [%d - %d], [%d - %d] \n", start, mid, mid+1, end);
                Adder firsHalf = new Adder(start, mid);
                firsHalf.fork();
                Adder secondHalf = new Adder(mid + 1, end);
                int resultSecond = secondHalf.compute();
                return firsHalf.join() + resultSecond;
            }
        }
    }

}
