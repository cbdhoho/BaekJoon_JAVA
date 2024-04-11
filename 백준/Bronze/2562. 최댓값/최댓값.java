import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        for(int i=0; i<arr.length;i++){
            int a = sc.nextInt();
            arr[i] = a;
        }
        int max=arr[0], index=0;
        for(int i=1; i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index+1);
    }
}