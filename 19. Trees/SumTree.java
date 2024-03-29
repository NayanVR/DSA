public class SumTree {
    class Pair {
        boolean isSumTree;
        int sum;

        Pair(boolean isSumTree, int sum) {
            this.isSumTree = isSumTree;
            this.sum = sum;
        }
    }

    public static void main(String[] args) {
        BT bt = new BT();
        bt.root = new BT.Node(3);
        bt.root.left = new BT.Node(1);
        bt.root.right = new BT.Node(2);

        SumTree st = new SumTree();
        System.out.println(st.SumTreeOrNot(bt.root).isSumTree);
    }

    public Pair SumTreeOrNot(BT.Node root) {
        if (root == null)
            return new Pair(true, 0);
        if (root.left == null && root.right == null)
            return new Pair(true, root.data);

        Pair leftPair = SumTreeOrNot(root.left);
        if (!leftPair.isSumTree)
            return leftPair;

        Pair rightPair = SumTreeOrNot(root.right);
        if (!rightPair.isSumTree)
            return rightPair;

        int mySum = leftPair.sum + rightPair.sum;

        return new Pair(mySum == root.data, mySum + root.data);
    }
}

class BT {
    Node root;

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    BT() {
        root = null;
    }
}