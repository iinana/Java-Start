package ch06.sec08.arbitrary_argument;

public class ComputerExample {
    public static void main (String[] args) {
        Computer myCom = new Computer();

        int res1 = myCom.sum(1, 2, 3);
        System.out.println("result1 : " + res1);

        int res2 = myCom.sum(1, 2, 3, 4, 5);
        System.out.println("result2 : " + res2);

        int[] values = { 1, 2, 3, 4, 5 };
        int res3 = myCom.sum(values);
        System.out.println("result3 : " + res3);
        
        int res4 = myCom.sum(new int[] {1, 2, 3});
        System.out.println("result4 : " + res4);
    }
}
