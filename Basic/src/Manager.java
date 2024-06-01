public class Manager {
    String name;
    String homeAddress;
    static String officeAddress;

    Manager(String name) {
        this.name = name;
    }

    public static void moveOffice() {
        officeAddress = "Allston, MA";
//        officeAddress = homeAddress; // Wrong!!! (Compile Error)
    }

    public void moveHome() {
        homeAddress = officeAddress;
    }

    public static void main(String[] args) {
        Manager Anthony = new Manager("Anthony");
        Anthony.homeAddress = "123 st...";
        Anthony.moveHome();
        System.out.println(officeAddress);

        Manager.officeAddress = "Boston, MA";
        System.out.println(officeAddress);
        Manager.moveOffice();
//        System.out.println(Manager.name);
        Manager.moveOffice();
        System.out.println(officeAddress);

        Manager Stephen = new Manager("Stephen");
        Stephen.homeAddress = "456 st...";
        System.out.println(Stephen.homeAddress);
    }
}


