package task04.task0402.task040202;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class ReflectionParser {

    public Object cloneClass(Object o) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = o.getClass();
//        Class<?>[] param0 = new Class[]{};
//        Constructor<?> constructor = clazz.getConstructor(param0);
//        return constructor.newInstance();
        Class<?>[] param3 = new Class[]{int.class, int.class, int.class};
        Constructor<?> constructor = clazz.getConstructor(param3);
        return constructor.newInstance(50, 50, 50);
    }

    public void showClassFieldsValue(Object o) throws IllegalAccessException {
        Class clazz = o.getClass();
        Field[] fields = clazz.getDeclaredFields();
        System.out.println("Fields of the Class '" + clazz.getName() + "' :");
        for (Field field : fields) {
            Class fieldType = field.getType();
            field.setAccessible(true);
            System.out.println("type: " + fieldType + "; name: " + field.getName() + "; value: " + field.get(o));
            field.setAccessible(false);
        }
    }

    public void setClassField(Object o, String nameMethod, int value) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Class clazz = o.getClass();
        Method method = clazz.getMethod(nameMethod, int.class);
        method.invoke(o, value);
    }


}