import java.util.Deque;
import java.util.LinkedList;

public class SortWithTwoStacks {

    public static void main(String[] args) {
        SortWithTwoStacks solution = new SortWithTwoStacks();
        LinkedList<Integer> s1 = new LinkedList<Integer>();
        s1.offerFirst(1);
        s1.offerFirst(2);
        s1.offerFirst(3);
        s1.offerFirst(4);
        System.out.println(s1);
        LinkedList<Integer> s2 = new LinkedList<Integer>();
        solution.sort(s1, s2);
        System.out.println(s1);
    }

    private void sort(Deque<Integer> input, Deque<Integer> buffer) {
        int prevMax = Integer.MAX_VALUE;
        while (input.peekFirst() < prevMax) {
            int curMax = Integer.MIN_VALUE;
            int count = 0;
            while (!input.isEmpty() && input.peekFirst() < prevMax) {
                if (input.peekFirst() > curMax) {
                    curMax = input.peekFirst();
                    count = 1;
                } else if (input.peekFirst() == curMax) {
                    count++;
                }
                buffer.offerFirst(input.pollFirst());
            }
            while (count != 0) {
                count--;
                input.offerFirst(curMax);
            }
            while (!buffer.isEmpty()) {
                if (buffer.peekFirst() == curMax) {
                    buffer.pollFirst();
                } else {
                    input.offerFirst(buffer.pollFirst());
                }
            }
            prevMax = curMax;
        }
    }

//    private void sort(Deque<Integer> input, Deque<Integer> buffer) {
//        int prevMax = Integer.MAX_VALUE;
//        while (input.peekFirst() < prevMax) {
//            int curMax = Integer.MIN_VALUE;
//            int count = 0;
//            while (!input.isEmpty() && input.peekFirst() < prevMax) {
//                int cur = input.pollFirst();
//                if (cur > curMax) {
//                    curMax = cur;
//                    count = 1;
//                } else if (cur == curMax) {
//                    count++;
//                }
//                buffer.offerFirst(cur);
//            }
//            while (count-- > 0) {
//                input.offerFirst(curMax);
//            }
//            while (!buffer.isEmpty()) {
//                int temp = buffer.pollFirst();
//                if (temp != curMax) {
//                    input.offerFirst(temp);
//                }
//            }
//            prevMax = curMax;
//        }
//    }
}
