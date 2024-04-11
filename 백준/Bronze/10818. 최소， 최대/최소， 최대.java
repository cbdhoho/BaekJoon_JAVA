import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            int a = sc.nextInt();
            arr[i] = a;
        }

        Arrays.sort(arr);

        System.out.print(arr[0]+" ");
        System.out.print(arr[n-1]);
    }
}