package chapter7;

public class ArrayInitValue {
    public static void main(String[] args) {
        ArrayInitValue arrayInitValue = new ArrayInitValue();
        arrayInitValue.referenceTypes();
    }

    public void primitiveTypes() {
        byte[] byteArray = new byte[3];
        short[] shortArray = new short[3];
        int[] intArray = new int[3];
        long[] longArray = new long[3];
        float[] floatArray = new float[3];
        double[] doubleArray = new double[3];
        char[] charArray = new char[3];
        boolean[] booleanArray = new boolean[3];
        System.out.println("byteArray[0] : " + byteArray[0]);
        System.out.println("shortArray[0] : " + shortArray[0]);
        System.out.println("intArray[0] : " + intArray[0]);
        System.out.println("longArray[0] : " + longArray[0]);
        System.out.println("floatArray[0] : " + floatArray[0]);
        System.out.println("doubleArray[0] : " + doubleArray[0]);
        System.out.println("charArray[0] : [" + charArray[0]+ "]");
        System.out.println("booleanArray[0] : " + booleanArray[0]);

    }

    public void referenceTypes() {
        String[] strings = new String[3];
        ArrayInitValue [] array = new ArrayInitValue[3];
        strings[0] = "Java";
        array[0] = new ArrayInitValue();
        System.out.println("strings[0] : " + strings[0]);
        System.out.println("array[0] : " + array[0]);
    }
}
