package chapter8;

public class ManageStudent {
    public static void main(String[] args) {
        ManageStudent manageStudent = new ManageStudent();
        Student[] student = null;
        student = manageStudent.addStudent();
        manageStudent.printStudents(student);
    }
    public Student[] addStudent(){
        Student[] students = new Student[3];
        students[0] = new Student("Min");
        students[1] = new Student("Kim");
        students[2] = new Student("Lee","Seoul","010-1234-5678","abc@naver.com");
        return students;
    }
    public void printStudents(Student[] students){
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
