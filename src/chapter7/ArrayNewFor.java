package chapter7;

public class ArrayNewFor {
    public static void main(String[] args) {
     if(args.length>0){
         for(String arg:args){
             System.out.println(arg);
         }
     }
    }

    public void newFor() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }
    }
    public void newFor2() {
        int[][] twoDim = {{1,2,3},{4,5,6}};
        for (int[] oneDim : twoDim) {
            for (int number : oneDim) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public void twoDimForWithCounter() {
        int[][] twoDim = {{1,2,3},{4,5,6}};
        int oneCounter = 0;
        for(int[] dimarray:twoDim){
            int twoCounter = 0;
            for(int number:dimarray){
                System.out.println("twoDim["+oneCounter+"]["+twoCounter+"] = "+number);
                twoCounter++;
            }
            oneCounter++;
        }
    }
}
