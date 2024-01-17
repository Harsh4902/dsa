package Trees;

public class LeastCommonAncestor {

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

        Node node = lcs(tree.root,25,43);
        System.out.println(node.val);
    }

    public static Node lcs(Node root, int p, int q){
        if(root == null || root.val == p || root.val == q)
            return root;

        Node left = lcs(root.left,p,q);
        Node right = lcs(root.right,p,q);

        if(left == null)
            return right;
        else if(right == null)
            return left;
        else
            return root;
    }

}
