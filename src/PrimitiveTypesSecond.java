public class PrimitiveTypesSecond {
    int intDefault1;
    byte byteDefault;
    short shortDefault;
    long longDefault;
    float floatDefault;
    double doubleDefault;
    char charDefault;
    boolean booleanDefault;
    public void defaultValues() {
        System.out.println("intDefault1: " + intDefault1);
        System.out.println("byteDefault: " + byteDefault);
        System.out.println("shortDefault: " + shortDefault);
        System.out.println("longDefault: " + longDefault);
        System.out.println("floatDefault: " + floatDefault);
        System.out.println("doubleDefault: " + doubleDefault);
        System.out.println("charDefault: " + charDefault);
        System.out.println("booleanDefault: " + booleanDefault);
    }

    public static void main(String[] args) {
        PrimitiveTypesSecond types = new PrimitiveTypesSecond();
        types.defaultValues();
    }
}
