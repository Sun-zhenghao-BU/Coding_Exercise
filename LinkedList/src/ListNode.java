public class ListNode {
    public int value;
    public ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    public static void printLinkedList(ListNode head){
        while (head != null) {
            System.out.print(head.value + " --> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
