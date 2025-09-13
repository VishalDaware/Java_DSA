public class PringSubArrays {
    public static void subArrays(int numbers[]) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k]);
                }
                total++;
                System.out.println();
            }
        }
        System.out.println("there are total :" + total + " subarrays");
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 4, 5, 6, 7 };
        subArrays(numbers);
    }

}
