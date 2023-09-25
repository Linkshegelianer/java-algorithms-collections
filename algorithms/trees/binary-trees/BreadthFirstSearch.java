/*
One of the grapth traversal techniques that visits every vertex once and only once.
To strart, we need to provide a starting vertex of the algorithm (root node of the graph).
When a vertex is discovered, it should be added to a queue.
When this queue is empty, the graph is considered traversed.
 */
import java.util.*;

public class BreadthFirstSearch {

    private class BinaryVertex<T> {
        private T data;
        private boolean visited;
        private BinaryVertex<T> right;
        private BinaryVertex<T> left;

        public BinaryVertex(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public BinaryVertex(T data, BinaryVertex<T> right, BinaryVertex<T> left) {
            super(data);
            this.right = right;
            this.left = left;
        }
    }

    public static <T> int breadthFirstSearch(BinaryVertex<T> start, T target) {
        Queue<BinaryVertex<T>> queue = new LinkedList<>();
        Set<BinaryVertex<T>> visited = new HashSet<>();
        int level = 0;

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // track the number of nodes at the current level

            // Process all nodes at the current level
            for (int i = 0; i < levelSize; i++) {
                BinaryVertex<T> current = queue.poll();

                if (current.getData().equals(target)) {
                    return level; // return the level where the target was found
                }

                // add unvisited child nodes to the queue
                if (current.left != null && !visited.contains(current.left)) {
                    queue.add(current.left);
                    visited.add(current.left);
                }

                if (current.right != null && !visited.contains(current.right)) {
                    queue.add(current.right);
                    visited.add(current.right);
                }
            }

            level++; // move to the next level
        }

        return -1; // return -1 if the target was not found
    }

    public static void main(String[] args) {
        BinaryVertex<Integer> v1 = new BinaryVertex<>(4);
        BinaryVertex<Integer> v2 = new BinaryVertex<>(2);
        BinaryVertex<Integer> v3 = new BinaryVertex<>(7);
        BinaryVertex<Integer> v4 = new BinaryVertex<>(1);
        BinaryVertex<Integer> v5 = new BinaryVertex<>(3);
        BinaryVertex<Integer> v6 = new BinaryVertex<>(6);
        BinaryVertex<Integer> v7 = new BinaryVertex<>(9);

        v1.left = v2;
        v1.right = v3;
        v2.left = v4;
        v2.right = v5;
        v3.left = v6;
        v3.right = v7;

        int target1 = 4;
        int target2 = 5;
        int target3 = 6;
        int level1 = breadthFirstSearch(v1, target1);
        int level2 = breadthFirstSearch(v1, target2);
        int level3 = breadthFirstSearch(v1, target3);
        System.out.printf(level1); // 2
        System.out.printf(level2); // 3
        System.out.printf(level3); // 5
    }
}