package task05.task0501.task050102;

class Printer implements Runnable{

    private Store store;
    Printer(Store store) {
        this.store = store;
        new Thread(this, "Printer").start();
    }
    public void run() {
        while(store.getValue() < store.getAmount()-1) {
            store.printValue();
        }
    }
}
