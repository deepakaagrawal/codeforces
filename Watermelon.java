import java.util.Scanner;

public class Watermelon {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		num = scan.nextInt();
		if (num < 4) {
			System.out.println("NO");
			return;
		}
		if (num % 2 == 0)
			System.out.println("YES");
		else
			System.out.println("NO");

	}
}
