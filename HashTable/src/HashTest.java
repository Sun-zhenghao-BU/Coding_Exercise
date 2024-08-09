import java.util.*;

public class HashTest {
    public static void main(String[] args) {
        List<Integer> l1 = new LinkedList<>(Arrays.asList(1, 2, 3));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(1, 2, 3));

        // 计算 hashCode
        int hashCode1 = l1.hashCode();
        int hashCode2 = l2.hashCode();

        // 比较 equals
        boolean equals = l1.equals(l2);

        System.out.println("hashCode1: " + hashCode1); // 计算并打印 l1 的 hashCode
        System.out.println("hashCode2: " + hashCode2); // 计算并打印 l2 的 hashCode
        System.out.println("equals: " + equals);       // 打印 l1.equals(l2) 的结果
    }
}
