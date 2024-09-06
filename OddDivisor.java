import java.util.Scanner;

public class OddDivisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int noOfTestCases = Integer.parseInt(scan.nextLine());
        int flag = 0;
        for (int i = 1; i <= noOfTestCases; i++) {
            flag = 0;
            long x = scan.nextLong();
            if (x % 2 == 1) {
                System.out.println("YES");
                continue;
            }
            while (x > 1) {
                x = x / 2;
                if (x % 2 == 1 && x!=1) {
                    System.out.println("YES");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.println("NO");
        }
    }
}