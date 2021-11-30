import java.util.Arrays;

public class ValidWord {
    public static void main(String[] args) {

        String sentence = "q-,";

        System.out.println(countValidWords(sentence));
    }
    // ASCII codes
    // ! -> 33
    // , -> 44
    // - -> 45
    // . -> 46
    // 0 - 9 -> 48 - 57
    // a - z -> 97 - 122

    static int countValidWords(String sentence) {

        int count = 0;
        boolean isValid = true;

        String[] words = sentence.trim().split("\\s+");

        for (String word : words) {

            char[] charArr = word.toCharArray();
            boolean isLastHyphen = false;
            boolean isThereAlreadyHyphen = false;

            for (int i = 0; i < charArr.length; i++) {
                // char should not be capital
                if (charArr[i] >= 65 && charArr[i] <= 90) {
                    isValid = false;
                    break;
                }
                // is prev char is hyphen
                if (isLastHyphen) {
                    if (charArr[i] < 97 || charArr[i] > 122) {
                        isValid = false;
                        break;
                    }
                    isLastHyphen = false;
                }
                // check there should be no number
                if (charArr[i] >= 48 && charArr[i] <= 57) {
                    isValid = false;
                    break;
                }
                // check for punctuation mark
                if (charArr[i] == 33 || charArr[i] == 44 || charArr[i] == 46) {
                    if (i != charArr.length - 1) {
                        isValid = false;
                        break;
                    }
                }
                // check for hyphen
                if (charArr[i] == 45) {
                    if (isThereAlreadyHyphen || (i == 0 || i == charArr.length - 1)) {
                        isValid = false;
                        break;
                    }
                    isThereAlreadyHyphen = true;
                    isLastHyphen = true;
                }
            }
            if (isValid) {
                count++;
                System.out.println(word);
            }
            isValid = true;
        }
        return count;
    }
}