public class Pangram {

    public static void main(String[] args) {
        // https://leetcode.com/problems/check-if-the-sentence-is-pangram/

        String sentence = "thequickbrownfojumpsoverthelazydog";

        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {

        int[] arr = new int[26];

        for (char ch : sentence.toCharArray()) {
            arr[ch - 97] += 1;
        }

        for (int i : arr) {
            if (i == 0) {
                return false;
            }
        }

        return true;
    }
}