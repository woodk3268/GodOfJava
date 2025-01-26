package chapter5;

public class OperatorComparison {
    public static void main(String[] args) {
        OperatorComparison sample = new OperatorComparison();
        // sample.comparison();
        //sample.comparison2();
        sample.comparison3();
    }

    public void comparison() {
        int intValue1 = 1;
        int intValue2 = 2;
        int intValue3 = 1;

        System.out.println(intValue1 == intValue2);
        System.out.println(intValue1 == intValue3);

        System.out.println(intValue1 != intValue2);
        System.out.println(intValue1 != intValue3);
    }

    public void comparison2() {
        char charValue = 'a';
        System.out.println(97 == charValue);
        int intValue = 1;
        double doubleValue = 1.0;
        System.out.println(intValue == doubleValue);
    }

    public void comparison3() {
        boolean isTrue = true;
        boolean isFalse = false;
        boolean isTrue2 = true;

        System.out.println(isTrue == isFalse);
        System.out.println(isTrue == isTrue2);

        System.out.println(isTrue != isFalse);
        System.out.println(isTrue != isTrue2);

    }
}
