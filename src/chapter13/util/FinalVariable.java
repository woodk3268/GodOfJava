package chapter13.util;

public class FinalVariable {
    final int instanceVariable =1;

    public static void main(String[] args) {
        FinalVariable finalVariable = new FinalVariable();
        finalVariable.method(0);
    }

    public void method(final int parameter) {
        final int localVariable;
        System.out.println("instanceVariable: " + instanceVariable);
        System.out.println("parameter: " + parameter);
        localVariable = 3;
        System.out.println("localVariable: " + localVariable);
    }
}
