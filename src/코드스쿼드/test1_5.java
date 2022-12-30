package 코드스쿼드;// @ author ninaaano

import java.io.IOException;
import java.util.Scanner;

public class test1_5 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("연산 >> " );

        double a = sc.nextDouble();
        String str = sc.next();
        double b = sc.nextDouble();

        sc.close();

        //if - else 문 사용
        if(str.equals("+")){
            System.out.print(a + "와 " + b + "의 계산 결과는 " + (a+b));
        } else if (str.equals("-")) {
            System.out.print(a + "와 " + b + "의 계산 결과는 " + (a-b));
        } else if (str.equals("*")) {
            System.out.print(a + "와 " + b + "의 계산 결과는 " + (a * b));
        } else if (str.equals("/")) {
            if(b == 0) {
                System.out.println("0으로 나눌 수 없습니다");
                return;
            }
            System.out.print(a + "와 " + b + "의 계산 결과는 " + (a / b));
        } else
            System.out.println("잘못된 입력값입니다.");

        // switch문 사용
        switch (str) {
            case "+" : System.out.print(a + "+" + b + "의 계산 결과는 " + (a+b));
            break;
            case "-" : System.out.print(a + "-" + b + "의 계산 결과는 " + (a-b));
            break;
            case "*" : System.out.print(a + "*" + b + "의 계산 결과는 " + (a*b));
            break;
            case "/" :
                if (b == 0) {
                    System.out.println("0으로 나눌 수 없습니다");
                    break;
                }
                System.out.print(a + "/" + b + "의 계산 결과는 " + (a/b));
            break;
        }
    }
}
