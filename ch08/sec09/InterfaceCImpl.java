package ch08.sec09;

public class InterfaceCImpl implements InterfaceC {
    @Override
    public void methodA() {
        System.out.println("InterfaceCImpl | methodA | from InterfaceA");
    }

    @Override
    public void methodB() {
        System.out.println("InterfaceCImpl | methodB | from InterfaceB");
    }
    
    @Override
    public void methodC() {
        System.out.println("InterfaceCImpl | methodC | from InterfaceC");
    }
}
