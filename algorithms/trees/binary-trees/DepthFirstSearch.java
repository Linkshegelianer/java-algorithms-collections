/*
One of the grapth traversal techniques that visits every vertex once and only once.
To strart, we need to provide a starting vertex of the algorithm (root node of the graph).
DFS goes as far as it can down a given path, then backtracks until it finds another unexplored path, and visits it.
When a vertex is discovered it should be added to a stack. The vertex is added to stack when it will be visited.
 */
import java.util.*;

public class DepthFirstSearch {

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

    public static <T> boolean depthFirstSearch(BinaryVertex<T> current, T target) {
        if (current == null) {
            return false; // target not found in the subtree rooted at 'current'
        }

        if (current.getData().equals(target)) {
            return true; // target found in the current node
        }

        current.visited = true; // mark the current node as visited

        // recursively search in the left and right subtrees
        boolean foundInLeft = false;
        boolean foundInRight = false;

        if (current.left != null && !current.left.visited) {
            foundInLeft = depthFirstSearch(current.left, target);
        }

        if (current.right != null && !current.right.visited) {
            foundInRight = depthFirstSearch(current.right, target);
        }

        return foundInLeft || foundInRight; // return true if found in either subtree
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
        System.out.printf(level2); // 1
        System.out.printf(level3); // 3
    }
}