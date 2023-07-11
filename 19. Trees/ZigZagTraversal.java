import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTraversal {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new BinaryTree.Node(3);
        tree.root.left = new BinaryTree.Node(4);
        tree.root.right = new BinaryTree.Node(5);
        tree.root.right.left = new BinaryTree.Node(6);
        tree.root.right.right = new BinaryTree.Node(7);

        System.out.println(zigZag(tree.root));
    }

    public static List<List<Integer>> zigZag(BinaryTree.Node root) {
        List<List<Integer>> result = new LinkedList<>();
        Queue<BinaryTree.Node> q = new LinkedList<>();
        q.offer(root);
        boolean isLToR = true;

        if (root == null)
            return result;

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> temp = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                BinaryTree.Node node = q.poll();

                if (node == null)
                    break;

                if (isLToR)
                    temp.add(node.data);
                else
                    temp.add(0, node.data);

                if (node.left != null)
                    q.offer(node.left);
                if (node.right != null)
                    q.offer(node.right);
            }
            result.add(temp);
            isLToR = !isLToR;
        }
        return result;
    }
}