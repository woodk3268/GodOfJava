package chapter15.string;

public class StringSample {
    public static void main(String[] args) {
        StringSample sample = new StringSample();
        sample.convert();
    }

    public void convert() {
        try{
         String korean = "자바의 신 최고 !!!";
         byte [] array1 = korean.getBytes("UTF-16");


         printByteArray(array1);
            String korean2 = new String(array1, "UTF-16");
            System.out.println(korean2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void printByteArray(byte[] array1) {
        for (byte data : array1) {
            System.out.print(data + " ");
        }
        System.out.println();
    }
}
