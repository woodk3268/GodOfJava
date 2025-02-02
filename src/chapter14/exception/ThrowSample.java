package chapter14.exception;

public class ThrowSample {
    public static void main(String[] args) {
        ThrowSample sample = new ThrowSample();
        sample.throwException(13);
        try {
            sample.throwsException(13);
        } catch (Exception e) {
            System.out.println("An error occurred.");
            System.out.println("Error message: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void throwException(int number) {
        try {
            if (number > 12) {
                throw new Exception("Number is over than 12");
            }
            System.out.println("Number is " + number);
        } catch (Exception e) {
            System.out.println("An error occurred.");
            System.out.println("Error message: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void throwsException(int number) throws Exception {
        if (number > 12) {
            throw new Exception("Number is over than 12");
        }
        System.out.println("Number is " + number);
    }
}
