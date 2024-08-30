import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] sp = scan.nextLine().split(" ");
        long row = Integer.valueOf(sp[0])%Integer.valueOf(sp[2])==0?Integer.valueOf(sp[0])/Integer.valueOf(sp[2]):Integer.valueOf(sp[0])/Integer.valueOf(sp[2])+1;
        long col = Integer.valueOf(sp[1])%Integer.valueOf(sp[2])==0?Integer.valueOf(sp[1])/Integer.valueOf(sp[2]):Integer.valueOf(sp[1])/Integer.valueOf(sp[2])+1;
        System.out.println(row*col);
    }
}