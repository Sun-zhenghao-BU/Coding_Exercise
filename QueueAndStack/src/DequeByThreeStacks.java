import java.util.Deque;
import java.util.LinkedList;

public class DequeByThreeStacks {
    private final Deque<Integer> stack1;
    private final Deque<Integer> stack2;
    private final Deque<Integer> buffer;

    public DequeByThreeStacks() {
        stack1 = new LinkedList<Integer>();
        stack2 = new LinkedList<Integer>();
        buffer = new LinkedList<Integer>();
    }

    public static void main(String[] args) {

    }

    public void offerFirst(int element) {
        stack1.offerFirst(element);
    }

    public void offerLast(int element) {
        stack2.offerFirst(element);
    }

    public Integer pollFirst() {
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                move();
            }
            return stack1.pollFirst();
        }
        return null;
    }

    public Integer pollLast() {
        if (!stack1.isEmpty() || !stack2.isEmpty()) {
            if (stack2.isEmpty()) {
                move();
            }
            return stack2.pollFirst();
        }
        return null;
    }

    public Integer peekFirst() {
        if (!stack1.isEmpty() || !stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                move();
            }
            return stack1.peekFirst();
        }
        return null;
    }

    public Integer peekLast() {
        if (!stack1.isEmpty() || !stack2.isEmpty()) {
            if (stack2.isEmpty()) {
                move();
            }
            return stack2.peekFirst();
        }
        return null;
    }

    public int size() {
        return stack1.size() + stack2.size();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    private void move() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return;
        }
        while (stack1.isEmpty() || stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                for (int count = stack2.size() / 2; count > 0; count--) {
                    buffer.offerFirst(stack2.pollFirst());
                }
                while (!stack2.isEmpty()) {
                    stack1.offerFirst(stack2.pollFirst());
                }
                while (!buffer.isEmpty()) {
                    stack2.offerFirst(buffer.pollFirst());
                }
            } else if (stack2.isEmpty()) {
                for (int count = stack1.size() / 2; count > 0; count--) {
                    buffer.offerFirst(stack1.pollFirst());
                }
                while (!stack1.isEmpty()) {
                    stack2.offerFirst(stack1.pollFirst());
                }
                while (!buffer.isEmpty()) {
                    stack1.offerFirst(buffer.pollFirst());
                }
            }
        }
    }
}
