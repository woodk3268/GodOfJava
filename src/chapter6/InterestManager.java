package chapter6;

public class InterestManager {
    public static void main(String[] args) {
        InterestManager manager = new InterestManager();
        for(int day=1; day<=365; day+=10) {
            System.out.println("day " + day + " : " + manager.calculateAmount(day, 1000000));
        }

    }
    public double getInterestRate(int day) {
        if(day <= 90) {
            return 0.05;
        } else if(day <= 180) {
            return 0.1;
        } else if(day <= 364) {
            return 0.2;
        } else {
            return 0.56;
        }
    }
    public double calculateAmount(int day, long amount) {
        double interestRate = getInterestRate(day);
        return amount + (amount * interestRate);
    }

}
