package chapter5;

public class OperatorTilde {
    public static void main(String[] args) {
        OperatorTilde operatorTilde = new OperatorTilde();
        byte b = 127;
        operatorTilde.printTildeResult(b);
        b=1;
        operatorTilde.printTildeResult(b);
    }
    public void printTildeResult (byte b){
        System.out.println("original + " + b);
        System.out.println("Tilde + " + ~b);
    }
}
