package task05.task0501.task050102;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        System.out.println("Start main");
        new Counter(store);
        new Printer(store);
    }
}
