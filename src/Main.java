import java.lang.reflect.Field;

// main class - contains main method
public class Main {

    // main method - jvm calls this method
    public static void main(String[] args) throws Exception {
        // use of annotations
        EmployeeClass ec = new EmployeeClass();
        ec.setName("ritesh sangwan");

        // reflection
        Class<?> clazz = ec.getClass();
        Field field = clazz.getDeclaredField("name");
        Roles role = field.getDeclaredAnnotation(Roles.class);

        System.out.println("Role value ==> " + role.value());
        System.out.println("Role abc ==> " + role.abc());
    }
}