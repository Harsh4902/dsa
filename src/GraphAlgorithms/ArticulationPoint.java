package GraphAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArticulationPoint {

    public static void main(String[] args) {

        List<Integer> [] graph = new List[]{
          Arrays.asList(1,2),
          Arrays.asList(0,2),
          Arrays.asList(0,1,3),
          Arrays.asList(2,4),
          Arrays.asList(3)
        };
        findAP(graph,graph.length);
    }

    static void dfs(List<Integer>[] adj, int V, List<Integer> vis, int i, int curr) {
        vis.set(curr, 1);
        for (int x : adj[curr]) {
            if (x != i) {
                if (vis.get(x) == 0) {
                    dfs(adj, V, vis, i, x);
                }
            }
        }
    }
    static void findAP(List<Integer>[] adj, int V) {
        for (int i = 0; i <=V; i++) {
            int components = 0;
            List<Integer> vis = new ArrayList<>();
            for (int j = 0; j <= V; j++) {
                vis.add(0);
            }

            for (int j = 0; j < V; j++) {
                if (j != i) {
                    if (vis.get(j) == 0) {
                        components++;
                        dfs(adj, V, vis, i, j);
                    }
                }
            }
            if (components > 1) {
                System.out.println(i);
            }
        }
    }

}
