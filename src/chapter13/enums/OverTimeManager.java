package chapter13.enums;

public class OverTimeManager {
    public static void main(String[] args) {
        OverTimeManager overTimeManager = new OverTimeManager();
        overTimeManager.getOverTimeAmount(OverTimeValues.THREE_HOUR);
        overTimeManager.getOverTimeAmount(OverTimeValues.FIVE_HOUR);
        overTimeManager.getOverTimeAmount(OverTimeValues.WEEKEND_FOUR_HOUR);
        int myAmount = overTimeManager.getOverTimeAmount(OverTimeValues.WEEKEND_EIGHT_HOUR);
        System.out.println(myAmount);
    }
    public int getOverTimeAmount(OverTimeValues value) {
        int amount = 0;
        switch (value) {
            case THREE_HOUR:
                amount = 18000;
                break;
            case FIVE_HOUR:
                amount = 30000;
                break;
            case WEEKEND_FOUR_HOUR:
                amount = 40000;
                break;
            case WEEKEND_EIGHT_HOUR:
                amount = 60000;
                break;
        }
        return amount;
    }
}
