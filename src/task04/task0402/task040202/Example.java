package task04.task0402.task040202;

public class Example {
    private int intPrivate;
    public int intPublic;
    protected int intProtected;

    public Example(){
        this.intPrivate = 5;
        this.intProtected = 10;
        this.intPublic = 20;
    }

    public Example(int intPrivate, int intPublic, int intProtected) {
        this.intPrivate = intPrivate;
        this.intPublic = intPublic;
        this.intProtected = intProtected;
    }

    public int getIntPrivate() {
        return intPrivate;
    }

    public void setIntPrivate(int intPrivate) {
        this.intPrivate = intPrivate;
    }

    public int getIntPublic() {
        return intPublic;
    }

    public void setIntPublic(int intPublic) {
        this.intPublic = intPublic;
    }

    public int getIntProtected() {
        return intProtected;
    }

    public void setIntProtected(int intProtected) {
        this.intProtected = intProtected;
    }

    @Override
    public String toString() {
        return "Example { " +
                "intPrivate=" + intPrivate +
                ", intProtected=" + intProtected +
                ", intPublic=" + intPublic +
                " }";
    }
}
