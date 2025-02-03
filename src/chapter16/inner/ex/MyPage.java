package chapter16.inner.ex;

public class MyPage {
    InputBox input;

    public static void main(String[] args) {
        MyPage page = new MyPage();
        page.setUI();
        page.pressKey();
    }

    public void setUI() {
        input = new InputBox();
        input.setKeyListener(new KeyEventListener() {
            @Override
            public void onKeyDown() {
                System.out.println("Key Down");
            }

            @Override
            public void onKeyUp() {
                System.out.println("Key Up");
            }
        });
    }

    public void pressKey() {
        input.listenerCalled(InputBox.KEY_DOWN);
        input.listenerCalled(InputBox.KEY_UP);
    }
}
