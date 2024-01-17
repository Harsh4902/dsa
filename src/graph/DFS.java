package graph;

import java.util.*;

public class DFS {

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
        System.out.println(isCycle(graph,'a'));
    }

    public static void travers(Map<Character,List<Character>> graph,Character source){

        Stack<Character> stack = new Stack<>();
        stack.push(source);
        List<Character> visited = new ArrayList<>();

        while (!stack.empty()){
            Character curr = stack.pop();
            for(Character c: graph.get(curr)){
                if(!visited.contains(c))
                    stack.push(c);
            }
            visited.add(curr);
        }

        System.out.println(visited);
    }

    public static boolean isCycle(Map<Character,List<Character>> graph,Character source){

        Stack<Character> stack = new Stack<>();
        stack.push(source);
        List<Character> visited = new ArrayList<>();

        while (!stack.empty()){
            Character curr = stack.pop();
            for(Character c: graph.get(curr)){
                if(!visited.contains(c))
                    stack.push(c);
                else
                    return true;
            }
            visited.add(curr);
        }

        System.out.println(visited);
        return false;
    }

}
