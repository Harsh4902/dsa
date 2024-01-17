package avl;

public class BSTFromSortedArray {

    public static void main(String[] args) {
        AVL tree = new AVL();

        int [] arr = {2,4,8,16,32,64};

        for(int a : arr)
            tree.insert(a);

        tree.display();
    }

}
