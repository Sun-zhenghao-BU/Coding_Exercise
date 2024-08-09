import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SortWithThreeStacks {
    public static void main(String[] args) {
        SortWithThreeStacks solution = new SortWithThreeStacks();
        LinkedList<Integer> s1 = new LinkedList<Integer>();
        s1.offerFirst(3);
        s1.offerFirst(1);
        s1.offerFirst(2);
        s1.offerFirst(4);
        System.out.println(s1);
        solution.sort(s1);
        System.out.println(s1);
    }

    public void sort(LinkedList<Integer> s1) {
        // Assumption: s1 is not null
        LinkedList<Integer> s2 = new LinkedList<Integer>();
        LinkedList<Integer> s3 = new LinkedList<Integer>();
        sort(s1, s2, s3, s1.size());
    }

    private void sort(LinkedList<Integer> s1, LinkedList<Integer> s2, LinkedList<Integer> s3, int length) {
        if (length <= 1) {
            return;
        }
        int mid1 = length / 2;
        int mid2 = length - length / 2;
        for (int i = 0; i < mid1; i++) {
            s2.offerFirst(s1.pollFirst());
        }
        // use the other stack to sort s2 / s1
        // after sorting, the numbers in s2 / s1 are in ascending order from top to bottom in the two stacks
        sort(s2, s3, s1, mid1);
        sort(s1, s3, s2, mid2);
        int i = 0;
        int j = 0;
        while (i < mid1 && j < mid2) {
            if (s2.peekFirst() < s1.peekFirst()) {
                s3.offerFirst(s2.pollFirst());
                i++;
            } else {
                s3.offerFirst(s1.pollFirst());
                j++;
            }
        }
        while (i < mid1) {
            s3.offerFirst(s2.pollFirst());
            i++;
        }
        while (j < mid2) {
            s3.offerFirst(s1.pollFirst());
            j++;
        }
        // after merging, the numbers are in descending order from top to bottom in s3, we need to push them back to s1
        // so that they are in ascending order
        for (int index = 0; index < length; index++) {
            s1.offerFirst(s3.pollFirst());
        }
    }
}
