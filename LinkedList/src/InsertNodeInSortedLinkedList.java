public class InsertNodeInSortedLinkedList {
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

        ListNode resNode = insertNodeInSortedLinkedList(node1, 6);
        ListNode.printLinkedList(resNode);
    }

    private static ListNode insertNodeInSortedLinkedList(ListNode head, int target) {
//        create a newNode based on input target value
        ListNode newNode = new ListNode(target);
//        case 0: input LinkedList is null
        if (head == null) {
            return new ListNode(target);
        }
//        case 1: insert into the head
        if (target <= head.value) {
            newNode.next = head;
            return newNode;
        }
//        case 2&3: insert into middle or tail
        ListNode cur = head;
//        method 1: separate case2 and case3
//        while (cur.next != null) {
//            if (cur.value <= newNode.value && cur.next.value >= newNode.value) {
//                newNode.next = cur.next;
//                cur.next = newNode;
//                return head;
//            }
//            cur = cur.next;
//        }
//
//        cur.next = newNode;
//        return head;

//        method 2: combine them to make the code shorter
//        Find the right insert position
        while (cur.next != null && cur.next.value < target) {
            cur = cur.next;
        }
//        insert operation
        newNode.next = cur.next;
        cur.next = newNode;
        return head;
    }
}

// TC:O(n)
// SC:O(1)