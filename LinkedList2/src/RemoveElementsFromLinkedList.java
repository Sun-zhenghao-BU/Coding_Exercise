import java.util.List;

public class RemoveElementsFromLinkedList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        ListNode resNode = removeElementsFromLinkedList(node1, 6);
        ListNode.printLinkedList(resNode);
    }

    private static ListNode removeElementsFromLinkedList(ListNode node1, int val) {
        if (node1 == null) {
            return null;
        }
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = node1;
        ListNode cur = dummyNode.next;
        ListNode prev = dummyNode;

        while (cur != null) {
            if (cur.value == val) {
                cur = cur.next;
                prev.next = cur;
            } else {
               prev = prev.next;
               cur = cur.next;
            }
        }
        return dummyNode.next;
    }
}

// TC: O(n)
// SC: O(1)
