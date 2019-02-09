package pl.sda.programmingI.day1;

import java.util.Arrays;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        System.out.println(stars("1234"));
//        starsRectangle(3, 3);
//        starsTriangle(5);
//        lineThroughRect(5);
 /*       long[] tab = fibonacci(10);
        System.out.println(Arrays.toString(tab));
        System.out.println(tab.toString());
        for (long l : fibonacci(10)) {
            System.out.println(l);
        }
        System.out.println(Arrays.toString(randomTab(10)));*/
//        System.out.println(fibonacci(10).toString());

        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{3, 2, 1, 3};

//        System.out.println(Arrays.toString(sumOfTabIndexes(a, b)));

//        MyStack stos = new MyStack();
//        stos.push(11);
//        stos.peek();
//        stos.push(12);
//        stos.peek();
//        stos.pop();
//        stos.peek();
//        starsTriangle(8);
        xmasTree(5);
    }

    private static void starsTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void xmasTree(int n) {
        starsTriangle(n);
        starsTriangle(n);

        for (int i = 0; i < n - 2; i++) {
            for (int j = n; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }

    private static boolean primeNumb(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            } else {
                continue;
            }
        }
        return true;
    }

    private static String stars(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            result = result + "*";
        }
        return result;
    }

    private static void starsRectangle(int h, int l) {
        for (int i = 0; i < h; i++) {
//            System.out.print("*");
            for (int j = 0; j < l; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    private static void lineThroughRect(int a) {
        for (int i = -a; i <= a; i++) {
//            System.out.print("*");
            for (int j = -a; j <= a; j++) {
                if (i == -j || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    /* todo
    zrobić choinkę
     *
    * *
   * * *
     *
    * *
   * * *
     *


     */

    private static long[] fibonacci(int n) {
        long[] tab = new long[n];
        long a = 0;
        long b = 1;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                tab[i] = 0;
            } else if (i == 1) {
                tab[i] = 1;
            } else {
                long sum = a + b;
                tab[i] = sum;
                a = b;
                b = sum;
            }
        }
        return tab;
    }

    private static int[] randomTab(int n) {
        int[] tab = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            tab[i] = random.ints(10, 20).findFirst().getAsInt();
        }
        return tab;
    }

    private static int[] sumOfTabIndexes(int[] a, int[] b) { //todo make it work
        int[] result;
        boolean isGreater = a.length > b.length ? true : false;
        result = new int[isGreater ? a.length : b.length];

        for (int i = 0; i < result.length; i++) {
            if (isGreater) {
                if (i < b.length) {
                    result[i] = a[i] + b[i];
                } else {
                    result[i] = a[i];
                }
            } else {
                if (i < a.length) {
                    result[i] = a[i] + b[i];
                } else {
                    result[i] = b[i];
                }
            }
        }
        return result;
    }

//        int maxLength = Math.max(a.length, b.length);
//        int minLength = Math.min(a.length,b.length);
//        int[] result = new int[maxLength];
//        for (int i = 0; i < maxLength; i++) {
//            if(i<=minLength) {
//                result[i] = a[i] + b[i];
//            }
//            else{

//
//            }
//        }
//        return result;
}






