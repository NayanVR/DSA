public class Count {
    public static void main(String[] args) {

        // I have to find how many times "3" is occurring in num. In this case is 2
        int num = 13739;
        int occur = 3;

        int count = 0;

        while (num > 0) {

            // if I use modulo operator with any number it will give me last digit of that
            // number
            int remainder = num % 10;

            if (remainder == occur) {
                count++;
            }

            num = num / 10; // This will remove lasy digit from number -> (int) 13739 / 10 = 1373
        }

        System.out.println(occur + " is occurring " + count + " times in number.");
    }
}