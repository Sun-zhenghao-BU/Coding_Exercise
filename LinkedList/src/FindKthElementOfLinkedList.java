public class FindKthElementOfLinkedList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;

        ListNode resNode = findKthElementOfLinkedList(node1, 2);
        System.out.println(resNode.value);
    }

    private static ListNode findKthElementOfLinkedList(ListNode head, int K) {
        if (head == null || K < 0) {
            return null;
        }
        ListNode cur = head;
        int index = 0;
        while (cur != null && index != K) {
            cur = cur.next;
            index++;
        }
        return null;
    }
}

// TC:O(n)
// SC:O(1)
