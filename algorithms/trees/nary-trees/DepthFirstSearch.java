/*
One of the grapth traversal techniques that visits every vertex once and only once.
To strart, we need to provide a starting vertex of the algorithm (root node of the graph).
DFS goes as far as it can down a given path, then backtracks until it finds another unexplored path, and visits it.
When a vertex is discovered it should be added to a stack. The vertex is added to stack when it will be visited.
 */
import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.Deque;
public class DepthFirstSearch<T> {

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

    public static <T> int depthFirstSearch(Vertex<T> start, T target) {
        Deque<Vertex<T>> stack = new LinkedList<>();
        Set<Vertex<T>> visited = new HashSet<>();
        int level = 0;

        stack.push(start);
        visited.add(start);

        while (!stack.isEmpty()) {
            Vertex<T> current = stack.pop();
            if (current.getData().equals(target)) {
                return level;
            }

            for (Vertex<T> neighbor : current.getNeighbors()) {
                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                    visited.add(neighbor);
                }
            }

            level++;
        }

        return - 1;
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
        int level1 = depthFirstSearch(v1, target1);
        int level2 = depthFirstSearch(v1, target2);
        int level3 = depthFirstSearch(v1, target3);
        System.out.println(level1); // 2
        System.out.println(level2); // 1
        System.out.println(level3); // 3
    }
}