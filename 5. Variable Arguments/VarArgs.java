import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {

        chill(1, 2, 5, 25, 456);
    }

    // ...v will store all args in array
    static void chill(int... v) {
        System.out.println(Arrays.toString(v));
    }
}