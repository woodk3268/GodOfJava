package chapter7;

public class ArrayTwoDimension {
    public static void main(String[] args) {
        ArrayTwoDimension array = new ArrayTwoDimension();
        array.twoDimensionArray();
    }

    public void twoDimensionArray() {
        int[][] twoDim = new int[2][3];
        twoDim[0][0] = 1;
        twoDim[0][1] = 2;
        twoDim[0][2] = 3;
        twoDim[1][0] = 4;
        twoDim[1][1] = 5;
        twoDim[1][2] = 6;

        for (int i=0; i<twoDim.length; i++) {
            for (int j=0; j<twoDim[i].length; j++) {
                System.out.print(twoDim[i][j] + " ");
            }
            System.out.println();
        }
    }
}
