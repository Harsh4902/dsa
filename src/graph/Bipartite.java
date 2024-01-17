package graph;

import java.util.LinkedList;

public class Bipartite {

    public static void main(String[] args) {

        int [][] graph = {
                {0,1,0,0,0,0,0,0,0,0},
                {1,0,1,0,0,0,0,0,0,0},
                {0,1,0,1,0,0,0,0,0,1},
                {0,0,1,0,1,0,0,0,0,0},
                {0,0,0,1,0,1,0,0,0,0},
                {0,0,0,0,1,0,1,0,1,0},
                {0,0,0,0,0,1,0,1,0,0},
                {0,0,0,0,0,0,1,0,0,0},
                {0,0,0,0,0,1,0,0,0,1},
                {0,0,1,0,0,0,0,0,1,0}
        };

        System.out.println(isBipartite(graph,0, graph.length));

    }

    static boolean isBipartite(int G[][],int src,int V)
    {
        int colorArr[] = new int[V];
        for (int i=0; i<V; ++i)
            colorArr[i] = -1;

        colorArr[src] = 1;
        LinkedList<Integer> q = new LinkedList<>();
        q.add(src);

        while (q.size() != 0)
        {
            int u = q.poll();
            if (G[u][u] == 1)
                return false;
            for (int v=0; v<V; v++)
            {
                if (G[u][v]==1 && colorArr[v]==-1)
                {
                    colorArr[v] = 1-colorArr[u];
                    q.add(v);
                }
                else if (G[u][v]==1 && colorArr[v]==colorArr[u])
                    return false;
            }
        }
        return true;
    }

}
