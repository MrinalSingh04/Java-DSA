package OOPs;

public class ConstructorPractice {
    static void main(String[] args) {

        Student s1 = new Student("Shinchan", 26, 101, "IIT");

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNo);
        System.out.println(s1.college);

        Student s2 = new Student();

    }
}

class Student {
    String name;
    int age;
    int rollNo;
    String college;

    // default constructor
    Student() {
    }

    // parameterised constructor
    Student(String n, int a, int rn, String c) {
        name = n;
        age = a;
        rollNo = rn;
        college = c;
    }

    void markAttendance() {
        System.out.println("Attendance marked for student " + name);
    }
}