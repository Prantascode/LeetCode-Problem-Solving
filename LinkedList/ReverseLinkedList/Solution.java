package LinkedList.ReverseLinkedList;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newhead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;
    }
    public static void printList(ListNode head){
        while (head != null) {
            System.out.print(head.val+" -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Solution LL = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        System.out.println("Original Linked List:");
        printList(head);

        // Reversing the linked list
        head = LL.reverseList(head);

        System.out.println("Reversed Linked List:");
        printList(head);
    }
}
