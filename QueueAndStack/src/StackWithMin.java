import java.util.Deque;
import java.util.LinkedList;

public class StackWithMin {
    private final Deque<Integer> stack;
    private final Deque<Integer> minStack;

    public StackWithMin() {
        stack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
    }

    public static void main(String[] args) {
        StackWithMin myStack = new StackWithMin();
        myStack.push(136);
        System.out.println(myStack.min());
        myStack.push(135);
        myStack.push(139);
        System.out.println(myStack.top());
        System.out.println(myStack.min());
        System.out.println(myStack.pop());
        System.out.println(myStack.min());
        System.out.println(myStack.top());
        System.out.println(myStack.min());
        System.out.println(myStack.pop());
        System.out.println(myStack.min());
    }

    public int pop() {
        if (stack.isEmpty()) {
            return -1;
        } else if (stack.peekFirst().equals(minStack.peekFirst())) {
            minStack.pollFirst();
        }
        return stack.pollFirst();
    }

    public void push(int element) {
        stack.offerFirst(element);
        if (minStack.isEmpty() || element <= minStack.peekFirst()) {
            minStack.offerFirst(element);
        }
    }

    public int top() {
        if (stack.isEmpty()) {
            return -1;
        } else {
            return stack.peekFirst();
        }
    }

    public int min() {
        if (minStack.isEmpty()) {
            return -1;
        }
        return minStack.peekFirst();
    }
}

// TC: O(1)
// SC: Worst case O(n)