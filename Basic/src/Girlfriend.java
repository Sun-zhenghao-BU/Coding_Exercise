public class Girlfriend {
    public static class Girl {
        String name;
        public Girl(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Boy {
        final Girl girlFriend;
        public Boy(Girl gf) {
            girlFriend = gf;
        }
    }

    public static void main(String[] args) {
//        Boy b = new Boy(new Girl("Akira"));
//        b.girlFriend = new Girl("Tako");

        Boy b = new Boy(new Girl("Akira"));
        System.out.println(b.girlFriend.name);

        b.girlFriend.setName("Tako");
        System.out.println(b.girlFriend.name);
    }
}
