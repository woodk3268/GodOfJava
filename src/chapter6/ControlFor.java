package chapter6;

public class ControlFor {
    public static void main(String[] args) {
        ControlFor control = new ControlFor();
        control.forLoop(10);
    }
    public void forLoop(int until) {
        int sum = 0;
        for (int loop=1; loop <= until; loop++) {
            sum += loop;
        }
        System.out.println("Sum of 1 to " + until + " is " + sum);
    }
}
