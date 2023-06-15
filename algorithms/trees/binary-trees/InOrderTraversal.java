/*
    In-order traversal goes from bottom to the top, from left to right.
 */
import java.util.*;

public class InOrderTraversal<T> {

    private static class Vertex<T> {
        private T data;
        private Vertex<T> left;
        private Vertex<T> right;

        public Vertex() {
        }

        public Vertex(T data) {
            this.data = data;
        }

        public Vertex(T data, Vertex<T> left, Vertex<T> right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static <T> List<T> inorderTraversal(Vertex<T> root) {
        Deque<Vertex<T>> stack = new LinkedList<>();
        List<T> output_arr = new ArrayList<>();

        if (root == null) {
            return output_arr;
        }

        Vertex<T> current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            output_arr.add(current.data);
            current = current.right;
        }

        return output_arr;
    }

    public static void main(String[] args) {
        Vertex<Integer> v1 = new Vertex<>(1);
        Vertex<Integer> v2 = new Vertex<>(2);
        Vertex<Integer> v3 = new Vertex<>(3);
        Vertex<Integer> v4 = new Vertex<>(4);
        Vertex<Integer> v5 = new Vertex<>(5);
        Vertex<Integer> v6 = new Vertex<>(6);

        // Create the tree structure
        v1.left = v2;
        v1.right = v3;
        v2.left = v4;
        v2.right = v5;
        v3.left = v6;

        List<Integer> result = inorderTraversal(v1);
        System.out.println(result); // must be [4, 2, 5, 1, 6, 3]
    }
}