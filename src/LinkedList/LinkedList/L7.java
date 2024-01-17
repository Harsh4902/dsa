public class L7 {
    
    public static void main(String[] args) {
        
        LinkedList l1 = new LinkedList(new Node(1));

        l1.insertNode(new Node(2));
        

        LinkedList l2 = new LinkedList(new Node(1));

        l1.insertNode(new Node(2));

        l1.head = reverseLinkedList(l1.head);
        l2.head = reverseLinkedList(l2.head);

        Node head3 = addTwoNumbers(l1.head, l2.head);
        LinkedList result = new LinkedList(head3);
        result.head = reverseLinkedList(result.head);
        result.traverse();

    }

    public static Node addTwoNumbers(Node head1, Node head2){
        
        Node temp1 = head1;
        Node temp2 = head2;
        Node result = new Node(0);
        Node ptr = result;

        int carry = 0; 

        while (temp1 != null || temp2 != null) {

            int sum = 0 + carry; 

        if (head1 != null) {   
            sum += temp1.val;
            temp1 = temp1.next;
        }

        if (temp2 != null) {   
            sum += temp2.val;
            temp2 = temp2.next;
        }

            carry = sum / 10; 
            sum = sum % 10;
            ptr.next = new Node(sum);
            ptr = ptr.next;
        }

        if (carry == 1) ptr.next = new Node(1);

        return result.next;
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

    public LinkedList(){}

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

