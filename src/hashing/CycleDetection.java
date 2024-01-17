package hashing;

import java.util.*;

class Graph {
    private int vertices;
    private Map<Integer, List<Integer>> adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new HashMap<>();
        for (int i = 0; i < vertices; i++) {
            adjacencyList.put(i, new LinkedList<>());
        }
    }

    public void addEdge(int u, int v) {
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u);
    }

    public boolean isCyclic() {
        Set<Integer> visited = new HashSet<>();

        for (int vertex : adjacencyList.keySet()) {
            if (!visited.contains(vertex)) {
                if (isCyclicUtil(vertex, -1, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean isCyclicUtil(int current, int parent, Set<Integer> visited) {
        visited.add(current);

        for (int neighbor : adjacencyList.get(current)) {
            if (!visited.contains(neighbor)) {
                if (isCyclicUtil(neighbor, current, visited)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true;
            }
        }

        return false;
    }
}

public class CycleDetection {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);

        if (graph.isCyclic()) {
            System.out.println("The graph contains a cycle.");
        } else {
            System.out.println("The graph does not contain a cycle.");
        }
    }
}

