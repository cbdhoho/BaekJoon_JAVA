import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a+b);
        }

    }
}

//EOF (End Of File)을 알려주기 위해 만든 문제. hasNext()를 써서 다음에 입력되는 데이터가 있는지 확인하고 없으면 종료한다. 
//이때, 난 scanner를 사용했는데, scanner에서는 입력되는 데이터가 없으면 NoSuchElementException이 출력된다.
