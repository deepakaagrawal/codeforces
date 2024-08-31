import java.util.Arrays;
import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= scan.nextInt();
        }
        int cutoff = arr[k-1];
        Arrays.sort(arr);
        int count = 0;
        
        for (int i = arr.length-1; i >=0; i--) {
            if(arr[i]>=cutoff && arr[i]>0)
                count++;
            else
                break;
        }
        System.out.println(count);
    }
}