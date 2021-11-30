import java.util.Arrays;

public class flipAndInvertImage {
    public static void main(String[] args) {
        // https://leetcode.com/problems/flipping-an-image/

        int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };

        printImage(image);
        System.out.println();
        printImage(flipAndInvertImg(image));
    }

    static int[][] flipAndInvertImg(int[][] image) {

        for (int row = 0; row < image.length; row++) {

            int rowLength = image[row].length;

            for (int col = 0; col < (rowLength + 1) / 2; col++) {
                int temp = swap(image[row][col]);
                image[row][col] = swap(image[row][rowLength - col - 1]);
                image[row][rowLength - col - 1] = temp;
            }
        }

        return image;
    }

    static int swap(int number) {
        if (number == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    static void printImage(int[][] image) {
        for (int row = 0; row < image.length; row++) {
            for (int col : image[row]) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}
