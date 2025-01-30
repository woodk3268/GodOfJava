package chapter7;

public class ArrayPrint {
    public static void main(String[] args) {
        ArrayPrint array = new ArrayPrint();
        array.printPrimitiveArray();
    }

    public void printString() {
        System.out.println("String array"+new String[0]);
        System.out.println("int array"+new ArrayPrint[0]);
    }

    public void printPrimitiveArray() {
        System.out.println("byte array"+new byte[0]);
        System.out.println("short array"+new short[0]);
        System.out.println("int array"+new int[0]);
        System.out.println("long array"+new long[0]);
        System.out.println("float array"+new float[0]);
        System.out.println("double array"+new double[0]);
        System.out.println("char array"+new char[0]);
        System.out.println("boolean array"+new boolean[0]);

    }

}
