import java.util.ArrayList;

public class Recursion3 {

    // permutation of string
    // public static void printPer(String str, String permutation) {
    // if (str.length() == 0) {
    // System.out.println(permutation);
    // return;

    // }
    // for (int i = 0; i < str.length(); i++) {
    // char currChar = str.charAt(i);
    // String newStr = str.substring(0, i) + str.substring(i + 1);
    // printPer(newStr, permutation + currChar);
    // }
    // }

    // print total no. of paths in matrix for (n,m)
    // public static int countPaths(int i, int j, int n, int m) {
    // if (i == n || j == m) {
    // return 0;
    // }
    // if (i == n - 1 && j == m - 1) {
    // return 1;
    // }
    // int downPaths = countPaths(i + 1, j, n, m);
    // int rightPaths = countPaths(i, j + 1, n, m);
    // return downPaths + rightPaths;
    // }

    // place tiles of size 1*m in a floor of size n*m
    // public static int placeTiles(int n, int m) {
    // if (n == m) {
    // return 2;
    // }
    // if (n < m) {
    // return 1;
    // }
    // int vertical = placeTiles(n - m, m);
    // int horizontal = placeTiles(n - 1, m);
    // return vertical + horizontal;

    // }

    // // no. of ways to call guest in party (n guest)
    // public static int callGuest(int n) {
    // if (n <= 1) {
    // return 1;
    // }
    // int ways1 = callGuest(n - 1);
    // int ways2 = (n - 1) * callGuest(n - 2);
    // return ways1 + ways2;
    // }

    // subsets of first n natural no
    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubset(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubset(subset);
            return;
        }
        subset.add(n);
        findSubset(n - 1, subset);
        subset.remove(subset.size() - 1);
        findSubset(n - 1, subset);
    }

    public static void main(String[] args) {

        // permutation of String
        // String str = "abc";
        // printPer(str, "");

        // print total no. of paths in matrix for (n,m)
        // int n = 3, m = 3;
        // int totalPaths = countPaths(0, 0, n, m);
        // System.out.println(totalPaths);

        // place tiles of size 1*m in a floor of size n*m
        // int n = 4, m = 2;
        // System.out.println(placeTiles(n, m));

        // // no. of ways to call guest in party (n guest)
        // int n = 4;
        // System.out.println(callGuest(n));

        // subsets of first n natural no
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);

    }

}
