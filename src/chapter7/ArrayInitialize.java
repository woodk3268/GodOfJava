package chapter7;

public class ArrayInitialize {
   static String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
            "November", "December"};

    public static void main(String[] args) {
        ArrayInitialize array = new ArrayInitialize();
        System.out.println(array.getMonth(1));
    }

    public void otherInit() {
        int[] lottoNumbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("lottoNumbers[0] = " + lottoNumbers[0]);
        System.out.println("lottoNumbers[1] = " + lottoNumbers[1]);
        System.out.println("lottoNumbers[2] = " + lottoNumbers[2]);
        System.out.println("lottoNumbers[3] = " + lottoNumbers[3]);
        System.out.println("lottoNumbers[4] = " + lottoNumbers[4]);
        System.out.println("lottoNumbers[5] = " + lottoNumbers[5]);
        System.out.println("lottoNumbers[6] = " + lottoNumbers[6]);
    }

    public String getMonth(int monthInt) {

        return month[monthInt - 1];
    }
}
