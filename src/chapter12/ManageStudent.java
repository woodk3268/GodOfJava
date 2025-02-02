package chapter12;

import chapter12.Student;

public class ManageStudent {
    public static void main(String[] args) {
        ManageStudent manageStudent = new ManageStudent();
        manageStudent.checkEquals();
    }

    public void checkEquals() {
        Student a = new Student("Min", "Seoul", "010-1234-5678", "abc@naver.com");
        Student b = new Student("Min", "Seoul", "010-1234-5678", "abc@naver.com");

        if (a.equals(b)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }

}
