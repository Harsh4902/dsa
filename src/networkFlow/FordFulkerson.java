package networkFlow;

import java.util.*;

public class FordFulkerson {
    private int[][] graph;
    private int[] parent;
    private int source;
    private int sink;

    public FordFulkerson(int[][] graph) {
        this.graph = graph;
        this.source = 0;
        this.sink = graph.length - 1;
        this.parent = new int[graph.length];
    }

    private boolean bfs() {
        boolean[] visited = new boolean[graph.length];
        Arrays.fill(visited, false);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;
        parent[source] = -1;

        while (!queue.isEmpty()) {
            int u = queue.poll();

            for (int v = 0; v < graph.length; v++) {
                if (!visited[v] && graph[u][v] > 0) {
                    queue.add(v);
                    parent[v] = u;
                    visited[v] = true;
                }
            }
        }

        return visited[sink];
    }

    private void dfs(int u, boolean[] visited) {
        visited[u] = true;

        for (int v = 0; v < graph.length; v++) {
            if (!visited[v] && graph[u][v] > 0) {
                dfs(v, visited);
            }
        }
    }

    public int fordFulkerson() {
        int maxFlow = 0;

        while (bfs()) {
            int pathFlow = Integer.MAX_VALUE;

            for (int v = sink; v != source; v = parent[v]) {
                int u = parent[v];
                pathFlow = Math.min(pathFlow, graph[u][v]);
            }

            for (int v = sink; v != source; v = parent[v]) {
                int u = parent[v];
                graph[u][v] -= pathFlow;
                graph[v][u] += pathFlow;
            }

            maxFlow += pathFlow;
        }

        boolean[] minCutSet = new boolean[graph.length];
        dfs(source, minCutSet);

        System.out.println("Min Cut edges:");
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                if (minCutSet[i] && !minCutSet[j] && graph[i][j] == 0 && graph[j][i] > 0) {
                    System.out.println(i + " - " + j);
                }
            }
        }

        return maxFlow;
    }

    public static void main(String[] args) {
        int[][] graph = {
                {0, 16, 13, 0, 0, 0},
                {0, 0, 10, 12, 0, 0},
                {0, 4, 0, 0, 14, 0},
                {0, 0, 9, 0, 0, 20},
                {0, 0, 0, 7, 0, 4},
                {0, 0, 0, 0, 0, 0}
        };

        FordFulkerson fordFulkerson = new FordFulkerson(graph);
        int maxFlow = fordFulkerson.fordFulkerson();
        System.out.println("Maximum Flow: " + maxFlow);
    }
}

