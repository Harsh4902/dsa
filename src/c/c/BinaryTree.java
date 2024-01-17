

public class BinaryTree {
    
    public static void inorder(Node root){

        if(root == null)
            return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    
    public static void preorder(Node root){
        if(root == null)
            return;

        System.out.print(root.val + " ");
        inorder(root.left);
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root == null)
            return;

        inorder(root.left);
        inorder(root.right);
        System.out.print(root.val + " ");
    }

}
class Node {

    public  int val;
    public Node left;
    public Node right;

    public Node() {
    }

    public Node(int val){
        this.val = val;
    }
}
