package temp.task050102_v03;

class Store {
    private int value = 0;
    private boolean isPrinted = false; // false = no printed; true = value is printed;

    synchronized void printValue() {
        while (isPrinted) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(value);
        isPrinted = true;
        notify();
    }

    synchronized void changeValue(int n) {
        while(!isPrinted)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        this.value = n;
        isPrinted = false;
        notify();
    }

    public int getValue(){
        return this.value;
    }
}
