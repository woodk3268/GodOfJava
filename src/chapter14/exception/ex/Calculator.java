package chapter14.exception.ex;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.printDivide(1, 2);
        try {
            calculator.printDivide(1, 0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void printDivide(double d1, double d2) throws IllegalArgumentException {
        if (d2 == 0) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
        double result = d1 / d2;
        System.out.println(result);
    }
}
