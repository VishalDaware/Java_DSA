import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        // int[] marks = new int[3];
        // marks[0] = 20;
        // marks[1] = 21;
        // marks[2] = 22;
        // System.out.println(marks[0]);

        // int marks[] = { 20, 21, 22 };

        // for (int i = 0; i < 3; i++) {
        // System.out.println(marks[i]);
        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the size of array");
        // int size = sc.nextInt();
        // int numbers[] = new int[size];

        // for (int i = 0; i < size; i++) {
        // System.out.println("enter " + i + "th item of array");
        // numbers[i] = sc.nextInt();
        // }

        // for (int i = 0; i < size; i++) {
        // System.out.print(numbers[i] + " ");
        // }

        // // array with search element index (linear search)
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the size of array");
        // int size = sc.nextInt();
        // int numbers[] = new int[size];

        // for (int i = 0; i < size; i++) {
        // System.out.println("enter " + i + "th item of array");
        // numbers[i] = sc.nextInt();
        // }

        // for (int i = 0; i < size; i++) {
        // System.out.println(numbers[i] + " ");
        // }

        // System.out.println("enter x that you want to search :");
        // int x = sc.nextInt();
        // for (int i = 0; i < numbers.length; i++) {
        // if (numbers[i] == x) {
        // System.out.println("x found at index : " + i);

        // }
        // }

        // 2D arrays
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of rows :");
        int rows = sc.nextInt();
        System.out.println("enter no of columns : ");
        int col = sc.nextInt();

        int numbers[][] = new int[rows][col];

        System.out.println("enter the elements of array");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // System.out.println("output array is : ");
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < col; j++) {
        // System.out.print(numbers[i][j] + " ");
        // }
        // System.out.println();
        // }
        System.out.println("enter no. x that you want to search ");
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("x found at " + i + "th row and " + j + "th col");
                }
            }
        }

    }

}
