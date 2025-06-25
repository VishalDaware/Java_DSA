public class Recursion1 {

    // print 5 to 1
    // public static void printNum(int n) {
    // if (n == 0) {
    // return;
    // }
    // System.out.println(n);
    // printNum(n - 1);
    // }

    // print 1 to 5
    // public static void printNo(int n) {
    // if (n == 6) {
    // return;
    // }

    // System.out.println(n);
    // printNo(n + 1);
    // }

    // print sum of n natural no.
    // public static void printSum(int i, int n, int sum) {
    // if (i == n) {
    // sum += i;
    // System.out.println(sum);
    // return;
    // }
    // sum += i;
    // printSum(i + 1, n, sum);
    // }

    // calculate factorial of n
    // public static int calcFact(int n) {
    // if (n == 1 || n == 0) {
    // return 1;

    // }
    // int fact_nm1 = calcFact(n - 1);
    // int fact_n = n * fact_nm1;
    // return fact_n;
    // }

    // fibonacchi series
    // public static void printFab(int a, int b, int n) {
    // if (n == 0) {
    // return;
    // }
    // int c = a + b;
    // System.out.println(c);
    // printFab(b, c, n - 1);
    // }

    // calculate x^n (stack height is n)
    // public static int calcPow(int x, int n) {
    // if (n == 0) {
    // return 1;
    // }
    // if (x == 0) {
    // return 0;
    // }
    // int xPownm1 = calcPow(x, n - 1);
    // int xPow = x * xPownm1;
    // return xPow;
    // }

    // calculate x^n (stack height is log n)
    public static int calcPow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        if (n % 2 == 0) {
            return calcPow(x, n / 2) * calcPow(x, n / 2);
        } else 
        {
            return calcPow(x, n / 2) * calcPow(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {

        // print 5 to 1
        // int n = 5;
        // printNum(n);

        // print 1 to 5
        // int n = 1;
        // printNo(n);

        // print sum of n natural no.
        // printSum(1, 5, 0);

        // calculate factorial of n
        // int n = 5;
        // int ans = calcFact(n);
        // System.out.println(ans);

        // fibonacchi series
        // int a = 0, b = 1;
        // System.out.println(a);
        // System.out.println(b);
        // int n = 7;
        // printFab(a, b, n - 2);// n-2 because we already print first 2 nubmers

        // calculate x^n (stack height n)
        // int x = 2, n = 5;
        // int ans = calcPow(x, n);
        // System.out.println(ans);

        // calculate x^n(stack height logn)
        int x = 2, n = 5;
        int ans = calcPow(x, n);
        System.out.println(ans);

    }

}
