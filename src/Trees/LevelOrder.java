package Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {

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

        traversal(tree.root);
    }

    public static void traversal(Node root){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            System.out.print(temp.val + " ");
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
    }

}
