import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> newList = new ArrayList<>();
        newList.add(1);
        newList.add(0, 2);
        System.out.println(newList.get(0));
        System.out.println(newList.size());
    }
}
