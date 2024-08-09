import java.util.LinkedList;

public class QueueByTwoStacks {
    private final LinkedList<Integer> in;
    private final LinkedList<Integer> out;

    public QueueByTwoStacks() {
        // we always insert into the "in" stack
        in = new LinkedList<Integer>();
        // we always remove from the "out" stack
        out = new LinkedList<Integer>();
    }

    public static void main(String[] args) {
        QueueByTwoStacks myQueue = new QueueByTwoStacks();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);
        System.out.println(myQueue.poll());
        myQueue.offer(5);
        myQueue.offer(6);
        myQueue.offer(7);
        myQueue.offer(8);
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
    }

    public Integer poll() {
        move();
        if (out.isEmpty()) {
            return null;
        } else {
            return out.pollFirst();
        }
    }

    public void offer(int element) {
        // always push into the "in" stack
        in.offerFirst(element);
    }

    public Integer peek() {
        move();
        if (out.isEmpty()) {
            return null;
        } else {
            return out.peekFirst();
        }
    }

    public int size() {
        return in.size() + out.size();
    }

    public boolean isEmpty() {
        return in.isEmpty() && out.isEmpty();
    }

    // helper function
    private void move() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.offerFirst(in.pollFirst());
            }
        }
    }
}
