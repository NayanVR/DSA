public class firstUppercase {
    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/

        String str = "geeksforGeeKS";

        System.out.println(first(str, 0));
    }

    static char first(String str, int i) {
        if (i == str.length()) {
            return 0;
        }

        if (Character.isUpperCase(str.charAt(i))) {
            return str.charAt(i);
        }

        return first(str, i + 1);
    }
}
