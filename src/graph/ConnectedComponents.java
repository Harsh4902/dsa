package graph;

import java.util.*;

public class ConnectedComponents {

    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();
        graph.add(Arrays.asList(1,2,4));
        graph.add(Arrays.asList(0,3));
        graph.add(Arrays.asList(0,3));
        graph.add(Arrays.asList(2));
        graph.add(Arrays.asList(0));
        graph.add(Arrays.asList(6));
        graph.add(Arrays.asList(5,7));
        graph.add(Arrays.asList(6));
        graph.add(Arrays.asList());

        boolean [] visited = new boolean[graph.size()];
        List<List<Integer>> components = new ArrayList<>();
        for(int i=0;i<graph.size();i++){

            if(visited[i])
                continue;
            components.add(travers(graph,i,visited));
            visited[i] = true;
        }

        System.out.println(components);
    }

    public static List<Integer> travers(List<List<Integer>> graph, int s, boolean [] visited){

        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        List<Integer> set = new ArrayList<>();
        while(!stack.empty()){
            int cur = stack.pop();
            List<Integer> neighbours = graph.get(cur);
            for(int a : neighbours){
                if(!visited[a])
                    stack.push(a);
            }
            set.add(cur);
            visited[cur] = true;
        }

        return set;
    }

}
