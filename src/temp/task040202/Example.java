package temp.task040202;

public class Example {
    private int intPrivate;
    @MyAnnotation
    public int intPublic;

    @Override
    public String toString() {
        return "Example { " +
                "intPrivate = " + intPrivate +
                ", intPublic = " + intPublic +
                " }";
    }

    public Example(){
        System.out.println("new instance of Example()");
        this.intPrivate = 5;
        this.intPublic = 10;
    }

    public Example(int intPrivate, int intPublic) {
        System.out.println("new instance of Example(int, int)");
        this.intPrivate = intPrivate;
        this.intPublic = intPublic;
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
}
