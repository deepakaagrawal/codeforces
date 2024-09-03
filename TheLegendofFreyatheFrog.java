import java.util.Scanner;

public class TheLegendofFreyatheFrog {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int noOfTestCases = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= noOfTestCases; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int d = scan.nextInt();
            int count = 0;
            boolean xdone = false;
            boolean ydone = false;
            int xroute = x%d==0?x/d:x/d+1;
            int yroute = y%d==0?y/d:y/d+1;
            count = xroute>yroute?xroute*2-1:yroute*2;
        
            System.out.println(count);
        }
    }
}