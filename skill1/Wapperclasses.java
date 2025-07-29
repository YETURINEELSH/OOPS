package skill1;
public class Wapperclasses{
    public static void main(String[] args) {
        int primitiveInt = 42;
        Integer wrappedInt = Integer.valueOf(primitiveInt);  // boxing
        int unboxedInt = wrappedInt.intValue();              // unboxing

        double primitiveDouble = 3.14;
        Double wrappedDouble = primitiveDouble;              // auto-boxing
        double unboxedDouble = wrappedDouble;                // auto-unboxing

        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Unboxed Integer: " + unboxedInt);
        System.out.println("Wrapped Double: " + wrappedDouble);
        System.out.println("Unboxed Double: " + unboxedDouble);
    }
}
