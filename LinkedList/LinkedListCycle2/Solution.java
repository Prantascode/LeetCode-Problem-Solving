package LinkedList.LinkedListCycle2;
class ListNode {
    int data;
    ListNode next;
    public ListNode(int data){
        this.data = data;
        this.next = null;
    }
    
}
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next.next;
        Solution s = new Solution();
        ListNode cycle = s.detectCycle(head);
        if (cycle != null) {
            System.out.println("Cycle found at "+cycle.data);
        }
        else{
            System.out.println("Cycle not found!");
        }
    }
}
