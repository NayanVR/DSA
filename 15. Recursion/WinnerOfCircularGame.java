import java.util.ArrayList;
import java.util.List;

public class WinnerOfCircularGame {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-the-winner-of-the-circular-game/

        System.out.println(findTheWinner(6, 5));
    }

    static int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }

        return winner(list, k, 0);
    }

    static int winner(List<Integer> list, int k, int index) {

        if (list.size() == 1) {
            return list.get(0);
        }

        index = index + k - 1;
        
        while (index >= list.size()) {
            index = index - list.size();
        }

        list.remove(index);

        return winner(list, k, index);
    }

}
