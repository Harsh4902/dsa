package Trees;

import java.util.ArrayList;
import java.util.List;

public class IdenticalTree {

    public static void main(String[] args) {

        BinaryTree tree1 = new BinaryTree();

        tree1.add(19);
        tree1.add(20);
        tree1.add(21);
        tree1.add(2);
        tree1.add(1);
        tree1.add(43);
        tree1.add(25);
        tree1.add(34);
        List<Integer> list1 = new ArrayList<>();
        dfs(tree1.root,list1);
        BinaryTree tree2 = new BinaryTree();

        tree2.add(19);
        tree2.add(20);
        tree2.add(21);
        tree2.add(2);
        tree2.add(1);
        tree2.add(43);
        List<Integer> list2 = new ArrayList<>();
        dfs(tree2.root,list2);

        System.out.println(isIdentical(list1,list2));
    }

    public static void dfs(Node root, List<Integer> list){

        if(root == null) {
            list.add(null);
            return;
        }

        dfs(root.left, list);
        list.add(root.val);
        dfs(root.right, list);

    }

    public static boolean isIdentical(List<Integer> tree1, List<Integer> tree2){
        return tree1.equals(tree2);
    }

}
