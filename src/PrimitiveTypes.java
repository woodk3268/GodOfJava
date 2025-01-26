public class PrimitiveTypes {
    int intDefault1;
    public void defaultValues() {
        int intDefault2;
        System.out.println("intDefault: " + intDefault1);
       // System.out.println("intDefault2: " + intDefault2);
    }
    public void checkByte() {
        byte byteMin = -128;
        byte byteMax = 127;
        System.out.println("byteMin: " + byteMin);
        System.out.println("byteMax: " + byteMax);
        byteMin = (byte) (byteMin - 1);
        byteMax = (byte) (byteMax + 1);
        System.out.println("byteMin-1: " + byteMin);
        System.out.println("byteMax+1: " + byteMax);
    }
    public void checkOtherTypes() {
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;
        System.out.println("shortMax: " + shortMax);
        System.out.println("intMax: " + intMax);
        System.out.println("longMax: " + longMax);
        shortMax = (short) (shortMax + 1);
        intMax = intMax + 1;
        longMax = longMax + 1;
        System.out.println("shortMax+1: " + shortMax);
        System.out.println("intMax+1: " + intMax);
        System.out.println("longMax+1: " + longMax);
    }
    public void checkBoolean() {
        boolean flag = true;
        System.out.println("flag: " + flag);
        flag = false;
        System.out.println("flag: " + flag);
    }
    public static void main(String[] args) {
        PrimitiveTypes types = new PrimitiveTypes();
        types.checkByte();
        types.checkOtherTypes();
    }
}
