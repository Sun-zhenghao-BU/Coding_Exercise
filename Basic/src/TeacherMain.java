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
    int[][] array = new int[][] {
      new int[]{0, 0, 0},
      new int[]{0, 0, 0},
    };
    public static void main(String[] args) {
        Teacher[] teachers = new Teacher[]{new Teacher("Sun"), new Teacher("Zhenghao"), new Teacher("Anthony")};
        for (int i = 0; i < teachers.length; i++) {
            teachers[i] = new Teacher("Anna");
        }

        for (Teacher teacher : teachers) {
            System.out.println(teacher.name);
        }

        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = 5;
            System.out.println(array[i]);
        }
//        Teacher Sun = new Teacher("Sun");
//        System.out.println(Sun.name);
//
//        Teacher Anthony = new Teacher("Anthony");
//        System.out.println(Anthony.name);
//
//        Teacher.officeAddress = "Boston, MA";
//        System.out.println(Teacher.officeAddress);
//        Teacher.moveOffice("Seattle WA");

    }
}
