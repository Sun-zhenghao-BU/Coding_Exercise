public class ReverseSinglyLinkedListRecursive {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode head = reverseSinglyLinkedList(node1);
        ListNode.printLinkedList(head);
    }

    private static ListNode reverseSinglyLinkedList(ListNode head) {
//        base case
        if (head == null || head.next == null) {
            return head;
        }
//        subProblem
        ListNode newHead = reverseSinglyLinkedList(head.next);
//        recursive rule
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}

// TC: O(n)
// SC: O(n)
