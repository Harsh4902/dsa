package GraphAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TopologicalSort {

    public static void dfs(List<Integer> [] graph, List<Integer> visited, Stack<Integer> stack,int s){
        visited.add(s);
        for(int a : graph[s]){
            if(!visited.contains(a))
                dfs(graph,visited,stack,a);

        }
    }

    public static void main(String[] args) {
        List<Integer> [] graph = new List[]{
                Arrays.asList(),
                Arrays.asList(),
                Arrays.asList(3),
                Arrays.asList(1),
                Arrays.asList(0,1),
                Arrays.asList(0,2)
        };

        List<Integer> visited = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        for(int i=0;i<graph.length;i++) {
            if(!visited.contains(i))
                dfs(graph, visited, s, i);
            s.push(i);
        }
        System.out.println(visited);
    }

}
