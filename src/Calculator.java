public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator class started");
        Calculator calc = new Calculator();
        int a = 10;
        int b = 5;
        System.out.println("Addition of " + a + " and " + b + " is: " + calc.add(a, b));
        System.out.println("Subtraction of " + a + " and " + b + " is: " + calc.subtract(a, b));
        System.out.println("Multiplication of " + a + " and " + b + " is: " + calc.multiply(a, b));
        System.out.println("Division of " + a + " and " + b + " is: " + calc.divide(a, b));
    }
    public int add(int num1, int num2) {
        int sum;
        sum = num1+num2;
        return sum;
    }
    public int subtract(int num1, int num2) {
        int difference;
        difference = num1-num2;
        return difference;
    }
    public int multiply(int num1, int num2) {
        int product;
        product = num1*num2;
        return product;
    }
    public int divide(int num1, int num2) {
        int quotient;
        quotient = num1/num2;
        return quotient;
    }

}
