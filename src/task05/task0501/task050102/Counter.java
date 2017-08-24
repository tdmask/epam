package task05.task0501.task050102;

class Counter implements Runnable {
    private final int TOTAL = 1_000_000;
    private Store store;

    Counter(Store store) {
        this.store = store;
        new Thread(this, "Counter").start();
    }

    public void run() {
        while (store.getValue() < TOTAL-1) {
            store.changeValue(store.getValue()+1);
        }
    }
}
