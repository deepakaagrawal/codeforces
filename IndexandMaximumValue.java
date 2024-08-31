import java.util.Arrays;
import java.util.Scanner;

public class IndexandMaximumValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int noOfTestCases = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= noOfTestCases; i++) {
            int size = scan.nextInt();
            int noOfOperations = scan.nextInt();
            int max = 0;
            int[] arr = new int[size];
            for (int j = 0; j < size; j++) {
                arr[j] = scan.nextInt();
            }
            for (int k = 0; k < arr.length; k++) {
                if (max < arr[k])
                    max = arr[k];
            }
            // Arrays.sort(arr);
            for (int j = 0; j < noOfOperations; j++) {
                // max = 0;
                String op = scan.next();
                int start = scan.nextInt();
                int end = scan.nextInt();
                if (max >= start && max <= end) {
                    if (op.equals("+")) {
                        max += 1;
                    } else {
                        max -= 1;
                    }
                }

                System.out.print(max + " ");
                // System.out.println();

            }
            System.out.println();
        }
    }
}