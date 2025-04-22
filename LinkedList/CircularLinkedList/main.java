package LinkedList.CircularLinkedList;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class main {
    static Node atInsertionPosition(Node last,int data, int pos){
        // Insertion if list is emoty
        if (last == null) {
            if (pos != 1) {
                System.out.println("Invalid Position");
                return last;
            }
            Node newNode = new Node(data);
            last = newNode;
            last.next = last; //last means head node points its self
            return last;
        }
        //Insert begainning at the list
        Node newNode = new Node(data);
        //Initialize curr as a head pointer
        Node curr = last.next;

        if (pos == 1) {
        newNode.next = curr; // new Node point to Head
        //Update
        last.next = newNode; // now last node point to the new Node
        return last;
        }
        //Initialize at any position
        for (int i = 1; i < pos - 1; ++i) {
            curr = curr.next;
            if (curr == last.next) {
                System.out.println("Insertion Invalid");
                return last;
            }
        }
        
        newNode.next = curr.next;
        curr.next = newNode;
        if (curr == last) {
            last = newNode;
        }
        return last;
    }
    static void printList(Node last){
        if (last == null) {
            return;
        }
        Node head = last.next;
        while (true) {
            System.out.print(head.data+" -> ");
            head = head.next;
            if (head == last.next) 
                break;
           
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        Node first = new Node(2);
        first.next = new Node(3);
        first.next.next = new Node(4);
        first.next.next.next = new Node(6);

        Node last = first.next.next.next ;
        last.next = first;
        printList(last);
        atInsertionPosition(last, 5, 4);
        printList(last);
    }
}
