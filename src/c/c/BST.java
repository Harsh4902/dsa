package c.c;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BST {

    static class Node {

        public  int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int val){
            this.val = val;
        }
    }

    public Node root;

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.val) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.val) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public void add(int val){
        root = addRecursive(root,val);

    }

    Node deleteNode(Node root, int val) {
        // Base case
        if (root == null)
            return root;
 
        // Recursive calls for ancestors of
        // node to be deleted
        if (root.val > val) {
            root.left = deleteNode(root.left, val);
            return root;
        } else if (root.val < val) {
            root.right = deleteNode(root.right, val);
            return root;
        }
 
        if (root.left == null) {
            Node temp = root.right;
            return temp;
        } else if (root.right == null) {
            Node temp = root.left;
            return temp;
        }
 
        // If both children exist
        else {
 
            Node succParent = root;
 
            // Find successor
            Node succ = root.right;
            while (succ.left != null) {
                succParent = succ;
                succ = succ.left;
            }
            if (succParent != root)
                succParent.left = succ.right;
            else
                succParent.right = succ.right;

            root.val = succ.val;

            return root;
        }
    }

    public void dfs(Node root, List<Integer> list){

        if(root == null)
            return;
        dfs(root.left,list);
        list.add(root.val);
        dfs(root.right,list);
    }

    public void bfs(Node root, List<Integer> list){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            list.add(temp.val);
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
    }

    public int height(Node root){
        if (root == null)
            return 0;
        else {

            // Compute the height of each subtree
            int lheight = height(root.left);
            int rheight = height(root.right);

            // Use the larger one
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }

}


