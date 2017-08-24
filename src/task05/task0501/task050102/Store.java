package task05.task0501.task050102;

class Store {
    private int value = 0;
    private boolean isChanged = true; // false = no changes; true = value is changed;
    // true - by default because we need to start from 0 according the task

    synchronized void printValue() {
        while (!isChanged) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(value);
        isChanged = false;
        notify();
    }

    synchronized void changeValue(int n) {
        while(isChanged)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        this.value = n;
        isChanged = true;
        notify();
    }

    public int getValue(){
        return this.value;
    }
}
