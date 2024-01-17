package graph;

import java.util.*;

public class BFS2 {

    public static void main(String[] args) {
        Map<Character, List<Character>> graph = new HashMap<>(){{
            put('a', Arrays.asList('b','c'));
            put('b', Arrays.asList('d'));
            put('c', Arrays.asList('e'));
            put('d', Arrays.asList('f'));
            put('e', Arrays.asList());
            put('f', Arrays.asList());
        }};

        travers(graph,'a');
    }

    public static void travers(Map<Character,List<Character>> graph,Character source){

        Queue<Character> queue = new LinkedList<>();
        queue.add(source);
        List<Character> visited = new ArrayList<>();

        while (!queue.isEmpty()){
            Character curr = queue.poll();
            for(Character c: graph.get(curr)){
                if(!visited.contains(c))
                    queue.add(c);
            }
            visited.add(curr);
        }

        System.out.println(visited);
    }

}
