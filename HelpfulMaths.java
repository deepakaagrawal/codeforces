import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        a = a.replace("+", " ");
        String[] sp = a.split(" ");
        Arrays.sort(sp);
        for (int i = 0; i < sp.length; i++) {
            System.out.print(sp[i]);
            if (i < sp.length - 1)
                System.out.print("+");
        }
    }
}