package chapter7;

public class ArrayLength {
    public static void main(String[] args) {
        ArrayLength array = new ArrayLength();
        array.printArrayLength();
    }
    public void printArrayLength() {
        int [] oneDim = new int[3];
        int [][] twoDim = new int[4][2];
        System.out.println("Length of oneDim: " + oneDim.length);
        System.out.println("Length of twoDim: " + twoDim.length);
    }
    public void printArray() {
        int [][] twoDim = {{1,2,3},{4,5,6}};
        System.out.println("Length of twoDim: " + twoDim.length);
        System.out.println("Length of twoDim[0]: " + twoDim[0].length);
        int twoDimLength = twoDim.length;
        for(int oneLoop = 0;oneLoop < twoDimLength; oneLoop++) {
            int twoDimOneLength = twoDim[oneLoop].length;
            for(int twoLoop = 0;twoLoop < twoDimOneLength; twoLoop++) {
                System.out.print(twoDim[oneLoop][twoLoop] + " ");
            }
            System.out.println();
        }
    }
}
