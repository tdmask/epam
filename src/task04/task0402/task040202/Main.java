package task04.task0402.task040202;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        Example classExample = new Example();
        ReflectionParser parser = new ReflectionParser();
        System.out.println("Original Class: " + classExample);

        Example clone = (Example) parser.cloneClass(classExample);
        System.out.println("Cloned Class: " + clone);

        parser.showClassFieldsValue(clone);

        parser.setClassField(clone, "setIntPrivate", 33);
        System.out.println("Modified Class: " + clone);
    }
}
