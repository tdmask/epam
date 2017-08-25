package temp.task050102_v03;

class Counter implements Runnable {
    private final int TOTAL = 10;
    private Store store;

    Counter(Store store) {
        this.store = store;
        new Thread(this, "Counter").start();
    }

    public void run() {
        while (store.getValue() < TOTAL) {
            store.changeValue(store.getValue()+1);
        }
    }
}
