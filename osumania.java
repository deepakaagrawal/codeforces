import java.util.ArrayList;
import java.util.Scanner;

public class osumania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList al = new ArrayList();
        int noOfTestCases = Integer.valueOf(scan.nextLine());

        for (int i = 1; i <= noOfTestCases; i++) {
            al.clear();
            System.out.println("");
            int rows = Integer.valueOf(scan.nextLine());
            for (int j = 1; j <= rows; j++) {

                String a = scan.nextLine();
                int place = a.indexOf("#");
                al.add(place + 1);
            }
            for (int j = al.size() - 1; j >= 0; j--) {
                System.out.print(al.get(j) + " ");
            }
        }
    }
}
