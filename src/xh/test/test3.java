package test;

/**
 * author  Xiao Hong
 * date  2020/8/11 21:05
 * description
 */

public class test3 {

    public static void main(String[] args) {
        System.out.println(Math.log(lnn(5)));
        System.out.println(lnn2(5));
        System.out.println(Math.log(1 * 2 * 3 * 4 * 5));

        System.out.println(ClassLoader.getSystemClassLoader());
    }

    private static double lnn(int n) {
        if (n < 1) {
            return -1;
        }
        if (n == 1) {
            return 1;
        }
        return n * lnn(n - 1);
    }

    private static double lnn2(int n) {
        if (n < 1) {
            return -1;
        }
        if (n == 1) {
            return 0;
        }
        return lnn2(n - 1) + Math.log(n);
    }


}
