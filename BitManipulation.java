import java.util.Scanner;

public class BitManipulation {
    public static void main(String[] args) {

        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;

        // // to get no.
        // if ((bitMask & n) == 0) {
        // System.out.println("bit was 0");
        // } else {
        // System.out.println("bit was 1");
        // }

        // // ṣet no.
        // int newNo = bitMask | n;
        // System.out.println(newNo);

        // // clear no.
        // int notBitmask = ~(bitMask);
        // int newNo = notBitmask & n;
        // System.out.println(newNo);

        // update
        Scanner sc = new Scanner(System.in);
        int opr = sc.nextInt();

        if (opr == 1) {
            int newNo = bitMask | n;
            System.out.println(newNo);
        } else {
            int newbitmask = ~(bitMask);
            int newNo = newbitmask & n;
            System.out.println(newNo);

        }
    }

}
