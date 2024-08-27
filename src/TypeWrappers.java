// simple class to show type wrappers, autoboxing and auto-unboxing
public class TypeWrappers {

    public static void main(String[] args) {
        // use of type wrappers
        Character ch = Character.valueOf('A');
        Integer i = Integer.valueOf(10);
        Boolean b = Boolean.valueOf(true);
        Long l = Long.valueOf(111111111111L);

        // auto boxing and auto unboxing
        test(Integer.valueOf(10));
        Integer ii = test(10);

        Integer a = Integer.valueOf(10);
        int ip = 20;
        Integer c = a + ip; // here autoboxing and unboxing is happening automatically
    }

    // simple method to show autoboxing and unboxing in action
    // when we call this method with int primitive type it will be automatically boxed in integer object
    // this method returns integer object which is automatically unboxed in integer primitive type
    private static int test(Integer value) {
        return Integer.valueOf(10);
    }
}
