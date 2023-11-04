package ch08.sec13;

public class ImplClass implements InterfaceC {
    @Override
    public void methodA() {
        System.out.println("Run methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Run methodB");
    }

    @Override
    public void methodC() {
        System.out.println("Run methodC");
    }
}
