package temp.task040202;

public class Main {
    public static void main(String[] args) {
        Example classExample = new Example();
        ReflectionParser parser = new ReflectionParser();
        System.out.println("--info: Example.toString");
        System.out.println(classExample);

        parser.showFieldWithAnnotations(classExample);
    }
}
