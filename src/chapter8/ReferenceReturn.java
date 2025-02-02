package chapter8;

import java.sql.Ref;

public class ReferenceReturn {
    public static void main(String[] args) {
        ReferenceReturn reference = new ReferenceReturn();
        System.out.println(reference.intReturn());
        System.out.println(reference.stringReturn());
        System.out.println(reference.intArrayReturn());
    }
    public int intReturn() {
        return 1;
    }
    public String stringReturn() {
        return "Hello";
    }
    public int[] intArrayReturn() {
        return new int[] {1, 2, 3};
    }
    public int calculateAfterIntReturn(){
        int returnInt = 0;
        return returnInt + 1;}

    public int ifConditionIntReturn(){
        int returnInt = 0;
        if(returnInt == 0){
            return ++returnInt;
        }
        return --returnInt;
    }

    public void wantToStopInTheMiddle(boolean flag){
        if (flag){
            return;
        }
    }
}
