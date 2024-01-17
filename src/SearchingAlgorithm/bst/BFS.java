package SearchingAlgorithm.bst;

import Trees.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.add(19);
        tree.add(20);
        tree.add(21);
        tree.add(2);
        tree.add(1);
        tree.add(5);

        List<Integer> values = new ArrayList<>();

        tree.bfs(tree.root,values);
        System.out.println(values);
    }



}
