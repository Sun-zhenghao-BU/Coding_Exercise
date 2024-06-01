class Simple {
    public int value;

    public Simple(int v) {
        value = v;
    }
}

public class PassValue {
    public static void main(String[] args) {
        //Q1
        Simple originalSimple = new Simple(5);
        changeSimpleValue1(originalSimple);
        System.out.println(originalSimple.value); //
    }

    private static void changeSimpleValue1(Simple simple) {
        simple = new Simple(10);
    }
}

