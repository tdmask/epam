package task05.task0501.task050102;

class Counter implements Runnable {
    private Store store;

    Counter(Store store) {
        this.store = store;
        new Thread(this, "Counter").start();
    }

    public void run() {
        while (store.getValue() < store.getAmount()) {
            store.changeValue(store.getValue()+1);
        }
    }
}
