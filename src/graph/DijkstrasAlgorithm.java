package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstrasAlgorithm {

    public static void main(String[] args) {
        List<List<List<Integer>>> graph = new ArrayList<>();
        graph.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(2,4)),new ArrayList<>(Arrays.asList(3,2)))));
        graph.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(2,9)),new ArrayList<>(Arrays.asList(4,1)))));
        graph.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(0,4)),new ArrayList<>(Arrays.asList(3,3)),new ArrayList<>(Arrays.asList(1,9)),new ArrayList<>(Arrays.asList(5,1)))));
        graph.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(0,2)),new ArrayList<>(Arrays.asList(2,3)),new ArrayList<>(Arrays.asList(5,1)))));
        graph.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(1,1)),new ArrayList<>(Arrays.asList(5,2)))));
        graph.add(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(2,1)),new ArrayList<>(Arrays.asList(3,1)),new ArrayList<>(Arrays.asList(4,2)))));

        findShortestPaths(6,graph,3);

    }

    public static void findShortestPaths(int v,List<List<List<Integer>>> graph,int S){

        boolean [] visited= new boolean[v];
        PriorityQueue<Pair> q = new PriorityQueue<>();
        q.add(new Pair(S,0));
        int ans[] = new int[v];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[S] = 0;

        while (!q.isEmpty()){

            Pair curr = q.remove();
            int u = curr.v;
            if(visited[u])
                continue;
            visited[u] = true;
            List<List<Integer>> neighbours = graph.get(u);
            for(List<Integer> list : neighbours){

                int vertex = list.get(0);
                int wt = list.get(1);
                if(ans[vertex] > ans[u] + wt){
                    ans[vertex] = ans[u] + wt;
                    q.add(new Pair(vertex,ans[vertex]));
                }

            }
        }

        System.out.println(Arrays.toString(ans));
    }

    static class Pair implements Comparable{
        int v;
        int wt;
        Pair(int v,int wt){
            this.v = v;
            this.wt = wt;
        }

        @Override
        public int compareTo(Object o) {
            Pair p = (Pair) o;
            return this.wt-p.wt;
        }
    }

}
