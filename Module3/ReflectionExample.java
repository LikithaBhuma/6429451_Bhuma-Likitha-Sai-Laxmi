package Projects;
import java.lang.reflect.Method;
class SampleClass {
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
    public int add(int a, int b) {
        return a + b;
    }
}
public class ReflectionExample {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("SampleClass");
            Object obj = cls.getDeclaredConstructor().newInstance();
            Method[] methods = cls.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("Method: " + method.getName());
                System.out.println("Parameter Types: " + method.getParameterTypes().length);
            }
            Method greetMethod = cls.getMethod("greet", String.class);
            greetMethod.invoke(obj, "Krishna");
            Method addMethod = cls.getMethod("add", int.class, int.class);
            int result = (int) addMethod.invoke(obj, 5, 3);
            System.out.println("Result of add(): " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
