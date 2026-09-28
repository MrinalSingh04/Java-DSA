package OOPs;

public class ConstructorPractice {
    static void main(String[] args) {

        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNo);
        System.out.println(s1.college);

        Student s2 = new Student("Jammy");
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.rollNo);
        System.out.println(s2.college);

        Student s3 = new Student("Hakuna", 26);
        System.out.println(s3.name);
        System.out.println(s3.age);
        System.out.println(s3.rollNo);
        System.out.println(s3.college);

        Student s4 = new Student("Chingchong", 27, 99);
        System.out.println(s4.name);
        System.out.println(s4.age);
        System.out.println(s4.rollNo);
        System.out.println(s4.college);

        Student s5 = new Student("Dingdong", 28, 123, "IIM");
        System.out.println(s5.name);
        System.out.println(s5.age);
        System.out.println(s5.rollNo);
        System.out.println(s5.college);

    }
}

class Student {
    String name;
    int age;
    int rollNo;
    String college;

    //Constructor chaining

    // default constructor
    Student() {
        this("Unknown", 0, 0, "Unknown");
    }

    // parameterised constructor
//    Student(String n, int a, int rn, String c) {
//        name = n;
//        age = a;
//        rollNo = rn;
//        college = c;
//    }

    Student(String name) {
        // this.name = name;
        this("Jammy", 0, 0, "Unknown");
    }

    Student(String name, int age) {
//        this.name = name;
//        this.age = age;
        this("Hakuna", 26, 0, "Unknown");
    }

    Student(String name, int age, int rollNo) {
//        this.name = name;
//        this.age = age;
//        this.rollNo = rollNo;
        this("Dingdong", 27, 99, "Unknown");
    }

    Student(String name, int age, int rollNo, String college) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.college = college;

    }


    void markAttendance() {
        System.out.println("Attendance marked for student " + name);
    }
}