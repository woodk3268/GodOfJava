package chapter6;

public class ControlIfAndOr {
    public static void main(String[] args) {
        ControlIfAndOr control = new ControlIfAndOr();
        control.tripleOrAnd();
    }
    public void ifAndOr() {
        int age = 25;
        boolean isMarried = true;

        if(age > 25 && isMarried) {
            System.out.println("Age is over 25 and married");
        }
        if(age > 25 || isMarried) {
            System.out.println("Age is over 25 or married");
        }
    }
    public void tripleOrAnd() {
        int age = 25;
        boolean isMarried = true;
        double height = 180;

        if((age > 25 || isMarried) && height >= 180) {
            System.out.println("Age is over 25, married, and height is over 180");
        }

    }
}
