/*
    In-order traversal goes from top to the bottom, from left to right.
    The tree structure in this example:
         1
       / | \
      3  2  4
     / \
    5  6
 */
import java.util.*;

public class InOrderTraversal {

    private static class Vertex<T> {
        private T data;
        private List<Vertex<T>> children;

        public Vertex() {
        }

        public Vertex(T data) {
            this.data = data;
        }

        public Vertex(T data, List<Vertex<T>> children) {
            this.data = data;
            this.children = children;
        }
    }

    public static <T> List<T> inorderTraversal(Vertex<T> root) {
        Deque<Vertex<T>> stack = new LinkedList<>();
        List<T> output_arr = new ArrayList<>();

        if (root == null) {
            return output_arr;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            Vertex<T> vertex = stack.pop();
            output_arr.add(vertex.data);

            if (vertex.children != null) {
                for (Vertex<T> child : vertex.children) {
                    stack.push(child);
                }
            }
        }
        return output_arr;
    }

    public static void main(String[] args) {
        Vertex<Integer> v0 = new Vertex<>(0);
        Vertex<Integer> v1 = new Vertex<>(1);
        Vertex<Integer> v2 = new Vertex<>(2);
        Vertex<Integer> v3 = new Vertex<>(3);
        Vertex<Integer> v4 = new Vertex<>(4);
        Vertex<Integer> v5 = new Vertex<>(5);
        Vertex<Integer> v6 = new Vertex<>(6);

        // Create the tree structure
        v1.children = Arrays.asList(v3, v2, v4);
        v3.children = Arrays.asList(v5, v6);

        List<Integer> result = inorderTraversal(v1);
        System.out.println(result); // must be [5, 3, 6, 1, 2, 4]
    }
}