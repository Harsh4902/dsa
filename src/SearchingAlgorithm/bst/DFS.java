package SearchingAlgorithm.bst;

import Trees.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class DFS {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.add(19);
        tree.add(20);
        tree.add(21);
        tree.add(2);
        tree.add(1);
        tree.add(5);

        List<Integer> values = new ArrayList<>();
        tree.dfs(tree.root,values);

        System.out.println(values);
    }
}
