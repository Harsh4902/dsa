public class L3 {
    
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList(new Node(1));

        l1.insertNode(new Node(2));
        l1.insertNode(new Node(3));
        l1.insertNode(new Node(4));
        l1.insertNode(new Node(5));
        l1.insertNode(new Node(6));
        l1.insertNode(new Node(7));

        l1.head = reverseLinkedList(l1.head);
        l1.traverse();
    }

    public static Node reverseLinkedList(Node head){

        Node prev = null;
        Node curr = head;
        Node next = curr.next;

        while (next != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;
        return curr;
    }

}

class Node{

    public int val;
    public Node next;

    public Node(int val){
        this.val = val;
    }

}

class LinkedList{

    public Node head;

    public LinkedList(Node head){
        this.head = head;
    }

    public void insertNode(Node node){
        Node temp = this.head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }

    public void deleteNode(int val){

        Node curr = head;
        Node prev = null;

        while(curr.next != null && curr.val != val){
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
        curr.next = null;
        curr = prev.next;
    }

    public void traverse(){

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
    }
}