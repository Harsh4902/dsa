class Node{

    public int val;
    public Node next;

    public Node(int val){
        this.val = val;
    }

}

public class LinkedList{

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
