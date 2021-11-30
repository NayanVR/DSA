public class first {
    public static void main(String[] args) {
        int a[] = { 10, 15, 20 };
        int b[] = a;
        int[] c = new int[5]; // auto fill with 0s
        a[0] = 5;
        System.out.println(a[0]);
        System.out.println(b[0]);
        System.out.println(c[2]);
    }
}
