package chapter6;

public class ControlSwitch {
    public static void main(String[] args) {
        ControlSwitch control = new ControlSwitch();
        control.switchStatement(1);
        control.switchStatement(2);
        control.switchStatement(3);
        control.switchStatement(4);
        control.switchStatement(6);

        control.switchStatement2(1);
    }

    public void switchStatement(int number) {
        switch (number) {
            case 1:
                System.out.println("It's 1");
                break;
            case 2:
                System.out.println("It's 2");
                break;
            case 3:
                System.out.println("It's 3");
                break;
            case 4:
                System.out.println("It's 4");
                break;
            default:
                System.out.println("It's not 1, 2, or 3");
                break;
        }
    }
    public void switchStatement2(int number) {
        switch (number) {
            case 1:
                System.out.println("It's 1");
            case 2:
                System.out.println("It's 2");
            case 3:
                System.out.println("It's 3");
                break;
            case 4:
                System.out.println("It's 4");
                break;
            default:
                System.out.println("It's not 1, 2, or 3");
        }
    }
}
