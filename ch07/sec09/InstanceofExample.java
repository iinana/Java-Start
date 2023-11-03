package ch07.sec09;

public class InstanceofExample {
    public static void  personInfo(Person person) {
        System.out.println("name: " + person.name);
        person.walk();

        // if (person instanceof Student) {
        //     Student student = (Student) person;
        //     System.out.println("Student No: " + student.studentNo);
        //     student.study();
        // }

        if (person instanceof Student student) {  // automatic substitution
            System.out.println("Student No: " + student.studentNo);
            student.study();
        }
    }

    public static void main (String[] args) {
        Person hong = new Person("Hong Gil Dong");
        InstanceofExample.personInfo(hong);

        Student kim = new Student("Kim Gil Dong", 10);
        InstanceofExample.personInfo(kim);
    }
}
