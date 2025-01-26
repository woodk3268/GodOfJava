package chapter5;

public class OperatorConditionalTriple {
    public static void main(String[] args) {
        OperatorConditionalTriple sample = new OperatorConditionalTriple();
        sample.doBlindDate(30);
        sample.doBlindDate(80);
    }

    public boolean doBlindDate(int point) {
        boolean doBlindDateFlag = false;
        doBlindDateFlag = (point >= 80) ? true : false;
        System.out.println("Do blind date? " + doBlindDateFlag);
        return doBlindDateFlag;

    }
}
