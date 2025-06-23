import java.util.*;

public class Basics {
    public static void main(String[] args) {
        // to print
        // System.out.println("Hello world\n hello world nextline");
        // variables
        // String name = "Vishal";
        // int age = 21;
        // double num = 43;

        // int a = 3;
        // int b = 4;
        // int diff = b - a;
        // System.out.println(diff);

        // to take input
        // using scanner class
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter your name");
        // String name = sc.nextLine(); // nextInt(), nextFloat() and etc
        // System.out.println(name);
        // System.out.println("enter your first no. i.e a");
        // int a = sc.nextInt();
        // System.out.println("enter your second no. i.e b");
        // int b = sc.nextInt();
        // System.out.println("result:");
        // int sum = a + b;
        // System.out.print(sum);

        // if (a == b) {
        // System.out.println("both numbers are same");
        // } else {
        // if (a > b) {
        // System.out.println("a is greater than b");
        // } else {
        // System.out.println("a is smaller than b");
        // }
        // }

        // int button = sc.nextInt();
        // switch (button) {
        // case 1:
        // System.out.println("namaste");
        // break;
        // case 2:
        // System.out.println("hello");
        // break;
        // case 3:
        // System.out.println("bonjure");
        // break;
        // default:
        // System.out.println("invalid option");
        // }

        // for (int i = 0; i < 3; i++) {
        // System.out.println("Hello world");
        // }

        // for (int i = 0; i <= 10; i++) {
        // System.out.println(i);
        // }
        // int i=0;
        // while (i<=10) {
        // System.out.println(i);
        // i +=1;

        // }
        // int i = 0;
        // do {
        // System.out.println(i);
        // i += 1;
        // } while (i <= 10);

        // sum of n numbers
        // int n = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        // sum += i;
        // }
        // System.out.println(sum);

        // table
        // System.out.println("enter the no. that's table you want");
        // int n = sc.nextInt();
        // for (int i = 1; i <= 10; i++) {
        // System.out.println(i * n);
        // }

        // patterns
        // int m = 4;
        // int n = 5;
        // for (int i = 1; i <= m; i++) {
        // for (int j = 1; j <= n; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // hollow rectangle
        // int n = 4;
        // int m = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // if (i == 1 || j == 1 || i == n || j == m) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // half pyramid
        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // int n = 4;
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }

        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // int n = 5;
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // floyd's triangle

        // int n = 5;
        // int num = 1;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(num + " ");
        // num++;
        // }
        // System.out.println();
        // }

        // 0-1 triangle
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // int sum = i + j;
        // if (sum % 2 == 0) {
        // System.out.print("1 ");

        // } else {
        // System.out.print("0 ");
        // }
        // }
        // System.out.println();
        // }

        // // butterfly
        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // for (int j = 1; j <= 2 * (n - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // for (int j = 1; j <= 2 * (n - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }.

        // // rombus
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= (n - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= n; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // // palindrome
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j + " ");
        // }
        // for (int j = 2; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // diamond
        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= 2 * i - 1; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // for (int i = n - 1; i >= 1; i--) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= 2 * i - 1; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // fuctions
        // print my name
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter your name");
        // String name = sc.nextLine();
        // printMyName(name);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a, b);
        // System.out.println(sum);

        // System.out.println("enter the no.");
        // int n = sc.nextInt();
        // printFactorial(n);

    }

    // public static void printMyName(String name) {
    // System.out.println(name);
    // return;
    // }

    // public static int calculateSum(int a, int b) {
    // int sum = a + b;
    // return sum;
    // }

    // public static int printFactorial(int n) {
    //     if (n < 0) {
    //         System.out.println("Invalid number");
    //         return 0;

    //     }
    //     int factorial = 1;
    //     for (int i = n; i >= 1; i--) {
    //         factorial = factorial * i;
    //     }
    //     System.out.println(factorial);
    //     return factorial;
    // }


}
