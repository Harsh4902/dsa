
public class L4 {
    
    public static void main(String[] args) {
        Node head = new Node(1);
        LinkedList l1 = new LinkedList(head);

        l1.insertNode(new Node(2));
        l1.insertNode(new Node(3));
        l1.insertNode(new Node(4));
        l1.insertNode(new Node(5));
        l1.insertNode(new Node(6));
        l1.insertNode(new Node(7));

        System.out.println(detectCycle(head));
    }

    public static boolean detectCycle(Node head){

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow)
                return true;
        }


        return false;
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
