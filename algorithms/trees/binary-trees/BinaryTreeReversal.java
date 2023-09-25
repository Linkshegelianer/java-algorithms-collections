public class BinaryTreeReversal {
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

    public static void main(String[] args) {

    }
}