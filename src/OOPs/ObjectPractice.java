package OOPs;

public class ObjectPractice {

    public static class Student {
        String name;
        int rollNo;
        double percentage;
    }

    public static void main(String[] args) {

        Student x = new Student();
        x.name = "John";
        x.rollNo = 17;
        x.percentage = 90.5;

        Student y = new Student();
        y.name = "Oggy";
        y.rollNo = 22;
        y.percentage = 64.5;

        System.out.println(x.name);
        System.out.println(x.rollNo);
        System.out.println(x.percentage);  //x (reference)  ───────────→ Student object (actual object)

//        Student       → class/type
//        x, y          → reference variables
//        new Student() → object

        System.out.println(y.name);
        System.out.println(y.rollNo);
        System.out.println(y.percentage);


    }
}
