package ch08.sec07;

public interface Service {
    /* default method */
    default void defaultMethod1() {
        System.out.println("defaultMethod1 code");
        defaultCommon();
    }

    default void defaultMethod2() {
        System.out.println("defaultMethod2 code");
        defaultCommon();
    }

    private void defaultCommon() {
        System.out.println("defaultMethod duplicated code A");
        System.out.println("defaultMethod duplicated code B");
    }


    /* static method */
    static void staticMethod1() {
        System.out.println("staticMethod1 code");
        staticCommon();
    }

    static void staticMethod2() {
        System.out.println("staticMethod2 code");
        staticCommon();
    }

    private static void staticCommon() {
        System.out.println("staticMethod duplicated code C");
        System.out.println("staticMethod duplicated code B");
    }
}
