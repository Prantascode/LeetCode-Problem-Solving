package LinkedList.Merge2List;

 class ListNode {
    int val;
    ListNode next;
    ListNode() {

    }
    ListNode(int val) {
         this.val = val;
         }
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
}
class Solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            }
            else{
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }else{
            if (list1 == null) {
                return list2;
            }else{
                return list1;
            }
        }
    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);
        list2.next.next = new ListNode(4);
        ListNode merListNode = mergeTwoLists(list1, list2);
        while (merListNode != null) {
            System.out.print(merListNode.val + " ");
            merListNode = merListNode.next;
        }
        System.out.println("null");
    }
}