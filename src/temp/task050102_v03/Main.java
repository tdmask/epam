package temp.task050102_v03;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        System.out.println("Start main");

        new Counter(store);
        new Printer(store);

    }
}
