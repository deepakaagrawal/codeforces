import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = -1;
        int count = 0;
        for (int i = 0; i < 25; i++) {
            a = scan.nextInt();
            if (a == 1) {
                count = count + Math.abs(2 - i / 5);
                count = count + Math.abs(2 - i % 5);
                break;
            }
        }
        System.out.println(count);
    }

}