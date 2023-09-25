import java.util.*;

public class NaryTreeReversal {

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

    public static void main(String[] args) {
        Queue<Vertex<T>> queue = new LinkedList<>();
    }
}