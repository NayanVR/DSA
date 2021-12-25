import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        // subseq("", "abc");
        System.out.println(subseqList("", "abc").toString());
    }

    static void subseq(String processed, String unProcessed) {

        if (unProcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unProcessed.charAt(0);

        subseq(processed + ch, unProcessed.substring(1));
        subseq(processed, unProcessed.substring(1));
    }

    static ArrayList<String> subseqList(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        char ch = unProcessed.charAt(0);

        ArrayList<String> left = subseqList(processed + ch, unProcessed.substring(1));
        ArrayList<String> right = subseqList(processed, unProcessed.substring(1));

        left.addAll(right);
        return left;
    }
}
