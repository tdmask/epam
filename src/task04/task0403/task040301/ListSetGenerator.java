package task04.task0403.task040301;


import java.util.*;

public class ListSetGenerator {


    public static List<Integer> randomList(int total, int start, int end) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < total; i++) {
            list.add((int) (Math.random() * (end - start + 1)) + start);
        }
        return list;
    }

    public static Set<Integer> randomSet(int total, int start, int end) {

        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < total; i++) {
            set.add((int) (Math.random() * (end - start + 1)) + start);
        }
        return set;
    }

}
