package chapter8;

public class StaticBlockCheck {
    public static void main(String[] args) {
        StaticBlockCheck check = new StaticBlockCheck();
        check.makeStaticBlockObjectWithData();
    }
    public void makeStaticBlockObject() {
        System.out.println("creating block1");
        StaticBlock block1 = new StaticBlock();
        System.out.println("created block1");
        System.out.println("========================");
        System.out.println("creating block2");
        StaticBlock block2 = new StaticBlock();
        System.out.println("created block2");

    }
    public void makeStaticBlockObjectWithData() {
        System.out.println("data ="+ StaticBlock.getData());
        StaticBlock block1 = new StaticBlock();
        block1.data=1;
        System.out.println("================");
        StaticBlock block2 = new StaticBlock();
        block2.data = 2;
        System.out.println("data ="+ StaticBlock.getData());
    }
}
