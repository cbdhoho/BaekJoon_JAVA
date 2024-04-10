import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int num = sc.nextInt();

        for(int i=0;i<num;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            total -= a*b;
        }

        if(total==0){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }

        sc.close();
    }
}