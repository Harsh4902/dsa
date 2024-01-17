package graph;

import java.util.*;

public class PrimsAlgorithm {

    public static void main(String[] args) {

        Map<Character, List<Map<Character,Integer>>> graph = new HashMap<>(){{
            put('a', Arrays.asList( new HashMap<>(){{put('b',2);}},new HashMap<>(){{put('d',7);}},new HashMap<>(){{put('e',6);}}));
            put('b', Arrays.asList(new HashMap<>(){{put('a',2);}},new HashMap<>(){{put('c',1);}},new HashMap<>(){{put('e',4);}}));
            put('c', Arrays.asList(new HashMap<>(){{put('b',1);}},new HashMap<>(){{put('d',3);}},new HashMap<>(){{put('e',2);}}));
            put('d', Arrays.asList(new HashMap<>(){{put('c',3);}},new HashMap<>(){{put('e',5);}},new HashMap<>(){{put('a',7);}}));
            put('e', Arrays.asList(new HashMap<>(){{put('d',5);}},new HashMap<>(){{put('c',2);}},new HashMap<>(){{put('b',4);}},new HashMap<>(){{put('a',6);}}));
        }};

        System.out.println(findPath(graph,'a'));
    }

    public static int findPath(Map<Character,List<Map<Character,Integer>>> graph,Character source){
        ArrayList<Character> visited = new ArrayList<>();
        PriorityQueue<Pair> q = new PriorityQueue<Pair>();
        q.add(new Pair(source,0));
        int ans = 0;

        while(!q.isEmpty()){

            Pair curr = q.remove();
            Character u = curr.v;
            if(visited.contains(u))
                continue;
            ans += curr.wt;
            visited.add(u);

            List<Map<Character,Integer>> neighbours = graph.get(u);
            for(Map<Character,Integer> map : neighbours){
                for(Map.Entry<Character,Integer> a :map.entrySet()){
                    Character vertex = a.getKey();
                    int weight = a.getValue();
                    if(!visited.contains(vertex)){
                        q.add(new Pair(vertex,weight));
                    }
                }
            }

        }
        return ans;
    }

}

class Pair implements Comparable{
    Character v;
    int wt;
    Pair(Character v,int wt){
        this.v = v;
        this.wt = wt;
    }

    @Override
    public int compareTo(Object o) {
        Pair pair =(Pair) o;
        return  this.wt-pair.wt;
    }
}
