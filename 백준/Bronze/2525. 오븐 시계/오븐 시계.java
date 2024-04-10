import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();
        int th = 0, tm = 0;
        // time division
        if(t<60){
            m += t;
        } else{
            th = t/60;
            tm = t%60;
            h += th;
            m += tm;
        }

        if(m>=60){
            h += 1;
            m -= 60;
        }

        if(h>23){
            h -= 24;
        }


        System.out.println(h+" "+m);
        sc.close();
    }
}