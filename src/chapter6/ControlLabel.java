package chapter6;

public class ControlLabel {
    public static void main(String[] args) {
        ControlLabel control = new ControlLabel();
        control.printTimesTableSkipAfter4Case2();
    }
    public void printTimesTable() {
        for(int level=2; level<10; level++){
            if(level ==4){continue;}
            for(int unit=1; unit<10; unit++){
                if(unit == 4){break;}
                System.out.print(level + " * " + unit + " = " + (level * unit) + "\t");
            }
            System.out.println();
        }
    }
    public void printTimesTableSkipAfter4Case2() {
        startLabel:
        for(int level=2; level<10; level++){
            for(int unit=1; unit<10; unit++){
                if(unit == 4) continue startLabel;
                System.out.print(level + " * " + unit + " = " + (level * unit) + "\t");
            }
            System.out.println();
        }
    }
}
