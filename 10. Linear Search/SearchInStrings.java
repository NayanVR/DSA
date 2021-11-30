public class SearchInStrings {

    public static void main(String[] args) {

        String name = "Nayan";
        char target = 'n';
        int ans = searchInString(name, target);

        System.out.println("Char fount at position " + (ans + 1));
    }

    static int searchInString(String name, char target) {

        // Returning index at which character found
        if (name.isEmpty()) {
            return -1;
        }

        for (int index = 0; index < name.length(); index++) {
            if (name.charAt(index) == target)
                return index;
        }

        // If we only want wether it exists or not
        // for (char ch : name.toCharArray()) {
        // if (ch == target) return "Char Found";
        // }

        return -1;
    }
}