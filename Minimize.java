import java.util.Scanner;

public class Minimize {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int noOfTestCases = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= noOfTestCases; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(b-a);
        }
    }
}