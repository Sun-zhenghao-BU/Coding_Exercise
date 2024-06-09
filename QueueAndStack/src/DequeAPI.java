import java.util.ArrayDeque;
import java.util.Deque;

public class DequeAPI {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
//        Head Operation: Throw Exceptions APIs
        deque.addFirst(1);
        int getFirstValue = deque.getFirst();
        int removeFirstValue = deque.removeFirst();
        System.out.println("********** Head Operations **********");
        System.out.println("----- Throw Exceptions APIs -----");
        System.out.println("getFirstValue is: " + getFirstValue);
        System.out.println("removeFirstValue is: " + removeFirstValue);

//        Head Operation: Return Special Value APIs
        deque.offerFirst(2);
        int peekFirstValue = deque.peekFirst();
        int pollFirstValue = deque.pollFirst();
        System.out.println("********** Head Operations **********");
        System.out.println("----- Return Special Value APIs -----");
        System.out.println("peekFirstValue is: " + peekFirstValue);
        System.out.println("pollFirstValue is: " + pollFirstValue);

//        Tail Operation: Throw Exceptions APIs
        deque.addLast(3);
        int getLastValue = deque.getLast();
        int removeLastValue = deque.removeLast();
        System.out.println("********** Tail Operations **********");
        System.out.println("----- Throw Exceptions APIs -----");
        System.out.println("getLastValue is: " + getLastValue);
        System.out.println("removeLastValue is: " + removeLastValue);

//        Tail Operation: Return Special Value APIs
        deque.offerFirst(4);
        int peekLastValue = deque.peekLast();
        int pollLastValue = deque.pollLast();
        System.out.println("********** Tail Operations **********");
        System.out.println("----- Return Special Value APIs -----");
        System.out.println("peekLastValue is: " + peekLastValue);
        System.out.println("pollLastValue is: " + pollLastValue);
    }
}
