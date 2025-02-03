package chapter16.inner;

public class ReferenceAtNested {
    static class StaticNested {
        private int staticNestedInt = 99;
    }
    class Inner {
        private int innerInt = 100;
    }
    public void setValue(int value){
        StaticNested staticNested = new StaticNested();
        Inner inner = new Inner();
        staticNested.staticNestedInt = value;
        inner.innerInt = value;
    }

}
