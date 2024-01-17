package SearchingAlgorithm.bst;

import java.util.List;

public class BST {

    public Trees.Node root;

    private Trees.Node addRecursive(Trees.Node current, int value) {
        if (current == null) {
            return new Trees.Node(value);
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

    public void dfs(Trees.Node root, List<Integer> list){

        if(root == null)
            return;
        dfs(root.left,list);
        list.add(root.val);
        dfs(root.right,list);
    }

}

class Node{
    public int val;
    public Node left;
    public Node right;

    public Node(){

    }
    public Node(int val){
        this.val = val;
    }
}