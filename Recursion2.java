import java.util.HashSet;

public class Recursion2 {

    // tower of henoi
    // public static void towerOfHenoi(int n, String src, String helper, String
    // dest) {
    // if (n == 1) {
    // System.out.println("transfer disk " + n + " from " + src + " to " + dest);
    // return;
    // }
    // towerOfHenoi(n - 1, src, dest, helper);
    // System.out.println("transfer disk " + n + " from " + src + " to " + dest);
    // towerOfHenoi(n - 1, helper, src, dest);
    // }

    // reverse string
    // public static void revStr(String str, int idx) {
    // if (idx == 0) {
    // System.out.println(str.charAt(idx));
    // return;
    // }
    // System.out.println(str.charAt(idx));
    // revStr(str, idx - 1);
    // }

    // find 1st and last occurance of an element in string
    // public static int first = -1;
    // public static int last = -1;
    // public static void findOcc(String str, int idx, char element) {
    // if (idx == str.length()) {
    // System.out.println(first);
    // System.out.println(last);
    // return;
    // }
    // char currChar = str.charAt(idx);
    // if (currChar == element) {
    // if (first == -1) {
    // first = idx;
    // } else {
    // last = idx;
    // }
    // }
    // findOcc(str, idx + 1, element);
    // }

    // Check arr is strictly sorted of not
    // public static boolean isSorted(int arr[], int idx) {
    // if (idx == arr.length - 1) {
    // return true;
    // }
    // if (arr[idx] < arr[idx + 1]) {
    // return isSorted(arr, idx + 1);
    // } else {
    // return false;
    // }
    // }

    // move all x of string to the last of string
    // public static void moveAllx(String str, int idx, int count, String newString)
    // {
    // if (idx == str.length()) {
    // for (int i = 0; i < count; i++) {
    // newString += 'x';
    // }
    // System.err.println(newString);
    // return;

    // }
    // char currChar = str.charAt(idx);
    // if (currChar == 'x') {
    // count++;
    // moveAllx(str, idx + 1, count, newString);
    // } else {
    // newString += currChar;
    // moveAllx(str, idx + 1, count, newString);
    // }
    // }

    // remove duplicates from string
    // public static boolean map[] = new boolean[26];

    // public static void removeDuplicates(String str, int idx, String newString) {
    // if (idx == str.length()) {
    // System.out.println(newString);
    // return;
    // }
    // char currChar = str.charAt(idx);
    // if (map[currChar - 'a'] == true) {
    // removeDuplicates(str, idx + 1, newString);
    // } else {
    // newString += currChar;
    // map[currChar - 'a'] = true;
    // removeDuplicates(str, idx + 1, newString);
    // }
    // }

    // Subsequences of String (O(2^n))
    // public static void subsequences(String str, int idx, String newString) {
    // if (idx == str.length()) {
    // System.out.println(newString);
    // return;
    // }
    // char currChar = str.charAt(idx);
    // subsequences(str, idx + 1, newString + currChar);
    // subsequences(str, idx + 1, newString);
    // }

    // unique Subsequences of substring
    // public static void subsequences(String str, int idx, String newString,
    // HashSet<String> set) {
    // if (idx == str.length()) {
    // if (set.contains(newString)) {
    // return;
    // } else {
    // System.out.println(newString);
    // set.add(newString);
    // return;
    // }

    // }
    // char currChar = str.charAt(idx);
    // subsequences(str, idx + 1, newString + currChar, set);
    // subsequences(str, idx + 1, newString, set);
    // }

    // keypad subsequences
    public static String keypad[] = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printCom(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printCom(str, idx + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {

        // tower of henoi
        // int n = 4;
        // towerOfHenoi(n, "S", "H", "D");

        // reverse string
        // String str = "abcd";
        // revStr(str, str.length() - 1);

        // find 1st and last occurance of an element in string
        // String str = "aaba";
        // findOcc(str, 0, 'a');

        // Check arr is strictly sorted of not
        // int arr[] = { 1, 2, 3, 4 };
        // System.out.println(isSorted(arr, 0));

        // move all x of string to the last of string
        // String str = "axdhfdxxhd";
        // moveAllx(str, 0, 0, "");

        // remove duplicates from string
        // String str = "aabbccdd";
        // removeDuplicates(str, 0, "");

        // Subsequences of String
        // String str = "abc";
        // subsequences(str, 0, "");

        // unique Subsequences of substring
        // String str = "aaa";
        // HashSet<String> set = new HashSet<>();
        // subsequences(str, 0, "", set);

        // keypad subsequences
        String str = "23";
        printCom(str, 0, "");

    }

}
