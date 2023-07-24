class Student {
    private String name;
    int age;
    double gpa;
    boolean enrolled;

    public Student(String name, int age, double gpa, boolean enrolled) {
        this.age = age;
        this.name = name;
        this.gpa = gpa;
        this.enrolled = enrolled;
    }

    public Student(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sayHello() {
        System.out.println("Hello, this is " + this.name);
    }

    public void sayHello (Student anotherStudent) {
        System.out.println("Hello " + anotherStudent.getName() + ", this is " + this.name);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student Tom = new Student("Tom", 11,  3.9, true);
        Student Frank = new Student("Frank", 12, 3.3, false);
        Tom.sayHello();

        Student Jerry = new Student("Jerry");
        Tom.sayHello(Frank);
        Tom.sayHello(Jerry);
        Frank.setName("Bob");
        System.out.println(Frank.getName());
    }
}
