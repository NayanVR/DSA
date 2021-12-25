import java.util.ArrayList;
import java.util.Arrays;

public class PhonePad {
    public static void main(String[] args) {
        // pad("", "12");
        System.out.println(pad("", "19").toString());
    }

    static ArrayList<String> pad(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0'; // this will convert '2' -> 2
        ArrayList<String> ans = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(pad(p + ch, up.substring(1)));
        }

        return ans;
    }
}
