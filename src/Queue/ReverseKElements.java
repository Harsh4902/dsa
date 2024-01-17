package Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseKElements {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i<=10;i++)
            queue.add(i);

        reverseKElements(queue,5);
        while (!queue.isEmpty())
            System.out.print(queue.poll() + "<--");

    }

    public static Queue<Integer> reverseKElements(Queue<Integer> q, int k){
        solve(q, k);
        int s = q.size() - k;
        while( s-- > 0){
            int x = q.poll();
            q.add(x);
        }
        return q;
    }

    public static void solve(Queue<Integer> q, int k){
        if(k == 0) return;
        int e = q.poll();
        solve(q, k - 1);
        q.add(e);
    }


}
