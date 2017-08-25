package temp.task050102_v03;

class Printer implements Runnable{

    private Store store;
    Printer(Store store) {
        this.store = store;
        new Thread(this, "Printer").start();
    }
    public void run() {
        while(true) {
            store.printValue();
        }
    }
}
