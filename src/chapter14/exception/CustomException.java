package chapter14.exception;

public class CustomException {
    public static void main(String[] args) {
        CustomException sample = new CustomException();
        try {
            sample.throwMyException(13);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    public void throwMyException(int number) throws MyException {
        try {
            if (number > 12) {
                throw new MyException("Number is over than 12");
            }
            System.out.println("Number is " + number);
        } catch (MyException e) {
            System.out.println("An error occurred.");
            System.out.println("Error message: " + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }
}
