import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int noOfTestCases = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= noOfTestCases; i++) {
            String word = scan.nextLine();
            if(word.length()<11)
                System.out.println(word);
            else{
                 System.out.println(""+word.charAt(0)+String.valueOf(word.length()-2)+word.charAt(word.length()-1));
            }
        }
    }
    
}