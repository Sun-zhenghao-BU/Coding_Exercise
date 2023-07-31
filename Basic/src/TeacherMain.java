class Teacher {
//    member variable
    String name;
    String homeAddress;
//    (Static) Class variable
    static String officeAddress;
    static String officePhone;
    static String title;

    public Teacher(String name) {
        this.name = name;
    }

    public static void moveOffice(String newOfficeAddress) {
        officeAddress = newOfficeAddress;
        System.out.println(officeAddress);
    }
}

public class TeacherMain {
    public static void main(String[] args) {
        Teacher Sun = new Teacher("Sun");
        System.out.println(Sun.name);

        Teacher Anthony = new Teacher("Anthony");
        System.out.println(Anthony.name);

        Teacher.officeAddress = "Boston, MA";
        System.out.println(Teacher.officeAddress);
        Teacher.moveOffice("Seattle WA");

    }
}
