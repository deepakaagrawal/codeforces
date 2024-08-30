import java.util.Scanner;
public class Bit{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int noOfTestCases = Integer.parseInt(scan.nextLine());
int x = 0;
for (int i = 1; i <= noOfTestCases; i++) {
    String op = scan.nextLine();
    if(op.contains("++"))
        x++;
    else   
        x--;

}
    System.out.println(x);
}
}