package chapter7;

public class ManageHeight {
    public static void main(String[] args) {
        ManageHeight manageHeight = new ManageHeight();
        manageHeight.setData();
//        for(int i=1; i<6; i++) {
//            System.out.println("Class No.:"+i);
//            manageHeight.printHeight(i);
//        }
        int i=1;
        while(i<6) {
            System.out.println("Class No.:"+i);
            manageHeight.printAverage(i);
            i++;
        }
    }

    int[][] gradeHeights;

    public void setData() {
        gradeHeights = new int[5][];
        gradeHeights[0] = new int[] {170, 180, 173, 175, 177};
        gradeHeights[1] = new int[] {160, 165, 167, 186};
        gradeHeights[2] = new int[] {158, 177, 187, 176};
        gradeHeights[3] = new int[] {173, 182, 181};
        gradeHeights[4] = new int[] {170, 180, 165, 177, 172};
    }

    public void printHeight(int classNo) {
        int classLength = gradeHeights[classNo-1].length;
        for(int i=0; i<classLength; i++) {
            System.out.println(gradeHeights[classNo-1][i]);
        }
    }
    public void printAverage(int classNo) {
        int classLength = gradeHeights[classNo-1].length;
        double sum = 0;
        for(int i=0; i<classLength; i++) {
            sum += gradeHeights[classNo-1][i];
        }
        System.out.println(sum/classLength);
    }
}
