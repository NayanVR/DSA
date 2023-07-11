import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.Map.Entry;

public class VerticalTraversal {
    class Pair {
        BinaryTree.Node node;
        int x;

        public Pair(BinaryTree.Node node, int x) {
            this.node = node;
            this.x = x;
        }
    }

    public static void main(String[] args) {

    }

    public List<List<Integer>> verticalTraversal(BinaryTree.Node root) {
        List<List<Integer>> list = new LinkedList<>();

        // TreeMap - it stores keys in sorted manner
        Map<Integer, List<Integer>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();

        q.offer(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair p = q.poll();

            if (!map.containsKey(p.x))
                map.put(p.x, new ArrayList<>());

            map.get(p.x).add(p.node.data);

            if (p.node.left != null)
                q.offer(new Pair(p.node.left, p.x - 1));
            if (p.node.right != null)
                q.offer(new Pair(p.node.right, p.x + 1));
        }

        for (Entry<Integer, List<Integer>> entry : map.entrySet()) {
            list.add(entry.getValue());
        }

        return list;
    }
}