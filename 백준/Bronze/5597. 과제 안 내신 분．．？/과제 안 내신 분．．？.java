import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] st = new int[28];

        for(int i = 0; i<28; i++){
            int a = sc.nextInt();
            st[i] = a;
        }

        for(int i = 1; i<=30; i++){
            int b = i;
            if(IntStream.of(st).noneMatch(x->x==b))
                System.out.println(b);
        }


    }

}