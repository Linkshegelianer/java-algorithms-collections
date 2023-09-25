/*
One of the grapth traversal techniques that visits every vertex once and only once.
To strart, we need to provide a starting vertex of the algorithm (root node of the graph).
When a vertex is discovered, it should be added to a queue. 
When this queue is empty, the graph is considered traversed.
 */
import java.util.*;

public class BreadthFirstSearch<T> {

    private static class Vertex<T> {
        private T data;
        private boolean visited;
        private List<Vertex<T>> neighbors = new LinkedList<>();

        public Vertex(T data) {
            this.data = data;
        }

        public List<Vertex<T>> getNeighbors() {
            return neighbors;
        }

        public T getData() {
            return data;
        }

        public void addNeighbor(Vertex<T> neighbor) {
            neighbors.add(neighbor);
        }
    }

    // level is the number of levels traversed in BFS
    public static <T> int breadthFirstSearch(Vertex<T> start, T target) {
        Queue<Vertex<T>> queue = new LinkedList<>();
        Set<Vertex<T>> visited = new HashSet<>();
        int level = 0;

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            Vertex<T> current = queue.poll();
            if (current.getData().equals(target)) {
                return level;
            }

            for (Vertex<T> neighbor : current.getNeighbors()) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }

            level++;
        }

        return -1;
    }

    public static void main(String[] args) {
        Vertex<Integer> v0 = new Vertex<>(0);
        Vertex<Integer> v1 = new Vertex<>(1);
        Vertex<Integer> v2 = new Vertex<>(2);
        Vertex<Integer> v3 = new Vertex<>(3);
        Vertex<Integer> v4 = new Vertex<>(4);
        Vertex<Integer> v5 = new Vertex<>(5);
        Vertex<Integer> v6 = new Vertex<>(6);

        v0.addNeighbor(v1);
        v0.addNeighbor(v5);
        v0.addNeighbor(v6);
        v1.addNeighbor(v3);
        v1.addNeighbor(v4);
        v1.addNeighbor(v5);
        v4.addNeighbor(v2);
        v4.addNeighbor(v6);
        v6.addNeighbor(v0);

        int target1 = 4;
        int target2 = 5;
        int target3 = 6;
        int level1 = breadthFirstSearch(v1, target1);
        int level2 = breadthFirstSearch(v1, target2);
        int level3 = breadthFirstSearch(v1, target3);
        System.out.println(level1); // 2
        System.out.println(level2); // 3
        System.out.println(level3); // 5
    }
}