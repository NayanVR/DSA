import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BST {

    public static void main(String[] args) {
        BST bst = new BST();
        int[] nums = { 7, 3, 9, 1, 4, 8, 10 };

        for (int num : nums)
            bst.insert(num);

        System.out.println(bst.levelOrderTraversal());
    }

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    BST() {
        root = null;
    }

    void insert(int data) {
        root = insertNode(root, data);
    }

    Node find(int value) {
        return findNode(root, value);
    }

    int depth(int value) {
        return depthOfNode(root, value, 0);
    }

    int getHeight() {
        return height(root);
    }

    Node insertNode(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data > root.data) {
            root.right = insertNode(root.right, data);
        } else {
            root.left = insertNode(root.left, data);
        }
        return root;
    }

    Node findNode(Node root, int value) {
        if (root == null)
            return null;

        if (root.data == value)
            return root;

        if (value > root.data) {
            return findNode(root.right, value);
        } else {
            return findNode(root.left, value);
        }
    }

    int depthOfNode(Node root, int value, int depth) {
        if (root == null)
            return -1;

        if (root.data == value)
            return depth;

        if (value > root.data) {
            return depthOfNode(root.right, value, ++depth);
        } else {
            return depthOfNode(root.left, value, ++depth);
        }
    }

    int height(Node root) {
        if (root == null)
            return -1;

        if (root.left == null && root.right == null)
            return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }

    List<List<Integer>> levelOrderTraversal() {
        List<List<Integer>> list = new LinkedList<>();
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> temp = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                temp.add(node.data);

                if (node.left != null)
                    q.offer(node.left);
                if (node.right != null)
                    q.offer(node.right);
            }
            list.add(temp);
        }
        return list;
    }
}