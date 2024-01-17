package miscellaneous;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthElement {

    public static void main(String[] args) {

        int [][] matrix = {{1,5,9},{10,11,13},{12,13,15}};

        System.out.println(largest(matrix,4));

    }

    public static int smallest(int [][] mat, int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(pq.size()>k)
                {
                    pq.poll();
                }
                pq.add(mat[i][j]);
            }
        }
        if(pq.size()>k)
        {
            pq.poll();
        }
        return pq.peek();
    }

    public static int largest(int [][] mat, int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(pq.size()>k)
                {
                    pq.poll();
                }
                pq.add(mat[i][j]);
            }
        }
        if(pq.size()>k)
        {
            pq.poll();
        }
        return pq.peek();
    }
}
