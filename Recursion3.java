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
    public static int countPaths(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        int downPaths = countPaths(i + 1, j, n, m);
        int rightPaths = countPaths(i, j + 1, n, m);
        return downPaths + rightPaths;
    }

    public static void main(String[] args) {

        // permutation of String
        // String str = "abc";
        // printPer(str, "");

        // print total no. of paths in matrix for (n,m)
        int n = 3, m = 3;
        int totalPaths = countPaths(0, 0, n, m);
        System.out.println(totalPaths);

    }

}
