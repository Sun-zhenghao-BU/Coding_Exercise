import java.awt.*;

public class MergeTwoSortedLinkedList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node3;
        node3.next = node5;

        node2.next = node4;

        ListNode resNode = mergeTwoSortedLinkedList(node1,node2);
        ListNode.printLinkedList(resNode);
    }

    private static ListNode mergeTwoSortedLinkedList(ListNode node1, ListNode node2) {
//        This part of corner case can be deleted, That's because in the end part post-processing,
//        it can also operate the node1 == null, node 2 == null situation, and our iteration conditions
//        didn't allow above two situations to operate the iterations. It's safe and better to solve it in the post-processing

//        if (node1 == null && node2 == null) {
//            return null;
//        } else if (node1 == null) {
//            return node2;
//        } else if (node2 == null) {
//            return node1;
//        }

        ListNode dummyNode = new ListNode(-1);
        ListNode cur1 = node1;
        ListNode cur2 = node2;
        ListNode curr = dummyNode;

        while (cur1 != null && cur2 != null) {
            if (cur1.value <= cur2.value) {
                curr.next = cur1;
                cur1 = cur1.next;
            } else {
                curr.next = cur2;
                cur2 = cur2.next;
            }
            curr = curr.next;
        }

        if (cur1 == null) {
            curr.next = cur2;
        } else {
            curr.next = cur1;
        }

        return dummyNode.next;
    }
}

// TC: O(LinkedList 1 length + LinkedList 2 length)
// SC: O(1)