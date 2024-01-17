package Trees;

import java.util.Stack;

public class InOrder {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.add(19);
        tree.add(20);
        tree.add(21);
        tree.add(2);
        tree.add(1);
        tree.add(43);
        tree.add(25);
        tree.add(34);

        traverse(tree.root);
    }

    public static void traverse(Node root){

        if (root == null)
            return;

        Stack<Node> s = new Stack<Node>();
        Node temp = root;

        while (temp != null || s.size() > 0)
        {
            while (temp !=  null)
            {
                s.push(temp);
                temp = temp.left;
            }

            temp = s.pop();
            System.out.print(temp.val + " ");
            temp = temp.right;
        }
    }

}
