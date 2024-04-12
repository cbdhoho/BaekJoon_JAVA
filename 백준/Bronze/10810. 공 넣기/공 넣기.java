import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ball = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0;i<ball;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            for(int j = a-1; j<b; j++){
                    arr[j] = c;
            }
        }

        for (int j = 0; j<n; j++) {
            if(j==n-1){
                System.out.print(arr[j]);
            } else
                System.out.print(arr[j]+" ");
        }
    }
}