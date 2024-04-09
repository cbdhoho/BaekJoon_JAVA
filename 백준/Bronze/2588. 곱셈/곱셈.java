import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();

        char num1 = b.charAt(2);
        char num2 = b.charAt(1);
        char num3 = b.charAt(0);

        int cal3 = a*(int)(num1-'0');
        int cal4 = a*(int)(num2-'0');
        int cal5 = a*(int)(num3-'0');
        int cal6 = a*Integer.parseInt(b);

        System.out.println(cal3);
        System.out.println(cal4);
        System.out.println(cal5);
        System.out.println(cal6);
    }
}