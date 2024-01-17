

public class L2 {

    static class Node{

        public int val;
        public Node next;

        public Node(int val){
            this.val = val;
        }

    }

    static class LinkedList{

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
    
    public static void main(String[] args) {
        Node head = new Node(1);
        LinkedList l1 = new LinkedList(head);

        l1.insertNode(new Node(2));
        l1.insertNode(new Node(3));
        l1.insertNode(new Node(4));
        l1.insertNode(new Node(5));
        l1.insertNode(new Node(6));
        l1.insertNode(new Node(7));

        System.out.println(findMiddle(head));
    }

    public static int findMiddle(Node head){

        Node s = head;
        Node f = head;

        while(s != null && (f != null &&  f.next != null)){
            s = s.next;
            f = f.next.next;
        }

        return s.val;

    }

}


