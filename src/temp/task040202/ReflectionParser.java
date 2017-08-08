package temp.task040202;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionParser {

    public Object createNewObject(Object o) throws IllegalAccessException, InstantiationException {
        Class clazz = o.getClass();
        return clazz.newInstance();
    }

    public void showClassFieldsValue(Object o) throws IllegalAccessException {
        Class clazz = o.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Class fieldType = field.getType();
            field.setAccessible(true);
            System.out.println("type: " + fieldType + "; name: " + field.getName() + "; value: " + field.get(o));
            field.setAccessible(false);
        }
    }

    public void showFieldWithAnnotations(Object o) {
        Class clazz = o.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(field.getName() + " with annotation " + annotation.toString());
            }
        }
    }



    public void getClassConstructors(Object o) {
        Constructor<?>[] constructors = o.getClass().getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
    }

    public void setField(Object o) {
        Class clazz = o.getClass();
        Field[] fields = clazz.getDeclaredFields();
    }

    public void showClassName(Object o) {
        Class clazz = o.getClass();
        System.out.println(clazz.getName());
    }

    public void showClassFields(Object o) {
        Class clazz = o.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }

    public void showClassMethods(Object o) {
        Class clazz = o.getClass();
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }


}
