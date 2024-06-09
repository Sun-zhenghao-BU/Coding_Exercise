import java.util.ArrayDeque;
import java.util.Deque;

public class QueueAPI {
    public static void main(String[] args) {
//        Deque<> is an interface，we used class ArrayDeque to implement this interface
        Deque<Integer> queue = new ArrayDeque<>();
//        Throw exceptions
        queue.add(1);
        int elementValue = queue.element();
        int removeValue = queue.remove();
        System.out.println("----- Throw Exceptions APIs -----");
        System.out.println("elementValue is: " + elementValue);
        System.out.println("removeValue is: " + removeValue);

//        Return Special Value APIs
        queue.offer(2);
        int peekValue = queue.peek();
        int pollValue = queue.poll();
        System.out.println("----- Return Special Value APIs -----");
        System.out.println("peekValue is: " + peekValue);
        System.out.println("pollValue is: " + pollValue);

//        Equivalent Deque Methods APIs
//        Throw exceptions
        queue.addLast(3);
        int getFirstValue = queue.getFirst();
        int removeLastValue = queue.removeLast();
        System.out.println("----- Return Special Value APIs -----");
        System.out.println("getFirstValue is: " + getFirstValue);
        System.out.println("removeLastValue is: " + removeLastValue);

//       Return Special Value APIs
        queue.offerLast(4);
        int peekFirstValue = queue.peekFirst();
        int pollFirstValue = queue.pollFirst();
        System.out.println("----- Return Special Value APIs -----");
        System.out.println("peekFirstValue is: " + peekFirstValue);
        System.out.println("pollFirstValue is: " + pollFirstValue);
    }
}
