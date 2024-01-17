package spatialDS;

public class QuadTree2 {

    public static class Node{
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;


        public Node() {
            this.val = false;
            this.isLeaf = false;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }

        @Override
        public String toString() {
            return "["+isLeaf+","+val+"]";
        }
    }

    public static Node createNode(int[][] grid,int[] tl, int[] tr,int[] bl){
        int cells = 0, sum = 0, i = 0, j =0;

        for(i=tl[0];i<=bl[0];i++){
            for(j=tl[1];j<=tr[1];j++){
                cells++;
                sum+=grid[i][j];
            }
        }
        int n = bl[0]-tl[0]+1, m = tr[1]-tl[1]+1;
        int[] br= { bl[0] ,tr[1]};

        Node node ;
        if( (cells == sum ) || sum == 0 ){
            node = new Node((sum>0)?true:false,true);
            return node;
        }
        int mid = n/2;

        int[] upperHorizontalMid = {tl[0], (tl[1]+tr[1]) / 2 };
        int[] leftVerticalMid = { (tl[0]+bl[0]) /2, tl[1] };
        int[] center = { ((tl[0]+bl[0]) /2 ) ,((tl[1]+tr[1]) / 2)   +1};
        int[] rightVerticalMid = {((tr[0]+br[0])/2)+1,tr[1]};
        int[] lowerHorizontalMid = { bl[0], ((bl[1]+br[1]) /2 )+1 };
        Node topLeftNode = createNode(grid, tl, upperHorizontalMid, leftVerticalMid );
        upperHorizontalMid[1]++;
        Node topRightNode = createNode(grid,upperHorizontalMid,tr, center );
        leftVerticalMid[0]++;
        center[0]++;
        center[1]--;
        Node bottomLeftNode = createNode(grid,leftVerticalMid, center,bl );
        center[1]++;

        Node bottomRightNode = createNode(grid, center, rightVerticalMid,lowerHorizontalMid);

        node = new Node(true,false, topLeftNode, topRightNode, bottomLeftNode, bottomRightNode);

        return node;


    }

    public static Node construct(int[][] grid) {
        int n = grid.length, m = grid[0].length;

        int mid = n/2;
        int[] tl = {0,0}, tr = {0,n-1}, bl = {n-1,0}, br = {bl[0],tr[1]};

        return createNode(grid,tl,tr,bl);

    }

    public static void display(Node root){
        if(root.isLeaf==true) {
            System.out.println(root);
            return;
        }
        display(root.topLeft);
        display(root.topRight);
        display(root.bottomRight);
        display(root.bottomLeft);
        System.out.println(root);
    }

    public static void main(String[] args) {
        int [][] grid = {{0,1},{1,0}};
        Node node = construct(grid);
        display(node);
    }

}