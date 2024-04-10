import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int n = num/4;
        String result = "";

        for(int i=0;i<n;i++){
            result += "long ";
        }
        result += "int";
        System.out.println(result);

        sc.close();
    }
}