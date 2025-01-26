package chapter5;

public class OperatorIncrement {
    public static void main(String[] args) {
        OperatorIncrement sample = new OperatorIncrement();
        sample.increment();
    }

    public void increment() {
        int intValue = 10;
        System.out.println(intValue++);
        System.out.println(intValue);
        System.out.println(++intValue);
    }
    public void increment2() {
        int intValue = 10;
        System.out.println(intValue);
        intValue++;
        System.out.println(intValue);
        ++intValue;
        System.out.println(intValue);
    }
}
