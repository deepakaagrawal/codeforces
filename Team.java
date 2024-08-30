import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int noOfTestCases = Integer.parseInt(scan.nextLine());
        int count = 0;
        for (int i = 1; i <= noOfTestCases; i++) {
            String surity = scan.nextLine();
            String[] sp = surity.split(" ");
            if (Integer.parseInt(sp[0]) + Integer.parseInt(sp[1]) + Integer.parseInt(sp[2]) >= 2)
                count++;
        }
        System.out.println(count);
    }
}