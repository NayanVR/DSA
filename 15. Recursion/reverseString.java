public class reverseString {
    public static void main(String[] args) {
        // https://leetcode.com/problems/reverse-string/

        char[] s = { 'h', 'e', 'l', 'l', 'o' };

        System.out.println(toString(reverse(s, 0)));
    }

    static char[] reverse(char[] s, int i) {

        if (i > (s.length - 1) / 2) {
            return s;
        }
        swap(s, i, s.length - i - 1);

        return reverse(s, i + 1);
    }

    public static String toString(char[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0;; i++) {
            b.append("\"");
            b.append(a[i]);
            b.append("\"");
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }

    static void swap(char[] s, int m, int n) {
        char temp = s[m];
        s[m] = s[n];
        s[n] = temp;
    }
}
