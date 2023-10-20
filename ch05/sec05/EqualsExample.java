package ch05.sec05;

public class EqualsExample {
    public static void main (String[] args) {
        String strVar1 = "Hong";
        String strVar2 = "Hong";

        if (strVar1 == strVar2) System.out.println(strVar1 + " and " + strVar2 + " has same reference");
        else System.out.println(strVar1 + " and " + strVar2 + " has different reference");
        
        String strVar3 = new String("Hong");
        String strVar4 = new String("Hong");

        if (strVar3 == strVar4) System.out.println(strVar3 + " and " + strVar4 + "has same reference");
        else System.out.println(strVar3 + " and " + strVar4 + "has different reference");
        
        if (strVar3.equals(strVar4)) System.out.println(strVar3 + " and " + strVar4 + " has same String");


    }
}
