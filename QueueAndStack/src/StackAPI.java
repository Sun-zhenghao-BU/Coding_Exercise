import java.util.ArrayDeque;
import java.util.Deque;

public class StackAPI {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
//        Stack APIs
        stack.push(1);
        int peekValue = stack.peek();
        int popValue = stack.pop();
        System.out.println("----- Stack APIs -----");
        System.out.println("peekValue is: " + peekValue);
        System.out.println("popValue is: " + popValue);

//        Equivalent Deque Method APIs
        stack.offerFirst(2);
        int peekFirstValue = stack.peekFirst();
        int pollFirstValue = stack.pollFirst();
        System.out.println("----- Equivalent Deque Method APIs -----");
        System.out.println("peekFirstValue is: " + peekFirstValue);
        System.out.println("pollFirstValue is: " + pollFirstValue);
    }
}
