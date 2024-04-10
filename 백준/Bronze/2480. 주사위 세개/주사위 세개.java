import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int m = 0;

        if(a==b & b==c){
            m = 10000+a*1000;
        } else if(a==b){
            m = 1000+a*100;
        } else if(b==c){
            m = 1000+b*100;
        } else if(c==a){
            m = 1000+c*100;
        } else {
            int max = Math.max(Math.max(a,b),c);
            m = max*100;
        }

        System.out.println(m);
        sc.close();
    }
}