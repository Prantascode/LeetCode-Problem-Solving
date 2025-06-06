package LinkedList.LinkedListCycle;

class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;                
            next = null;
        }
    }
    public class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            while (fast != null && fast.next != null) {
                    fast = fast.next.next;
                    slow = slow.next;
                    if (slow == fast) {
                        return true;
                    }
            }
            return false;
        }
        public static void main(String[] args) {
            ListNode head = new ListNode(3);
            head.next = new ListNode(2);
            head.next.next = new ListNode(0);
            head.next.next.next = new ListNode(-4);
            head.next.next.next.next = head.next;
            Solution s = new Solution();
            System.out.println(s.hasCycle(head));
            
        }
   }
