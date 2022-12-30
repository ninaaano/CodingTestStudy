package 실습문제;

/*
임의의 숫자를 입력받아 아래와 같은 실행 결과가 나타나는 프로그램을 작성
정수 n의 팩토리얼은 1부터 n까지의 모든 정수를 곱한 것으로 n! 표시
단, 2보다 작거나 9보다 큰 정수가 입력될 경우에는 "잘못된 숫자가 입력되었습니다." 라는 경고메세지를 출력하고
프로그램을 종료

1보다 크고 10보다 작은 정수를 입력하세요 : 5
1! = 1
2! = 2
3! = 6
4! = 24
5! = 120
 */

import java.util.Scanner;

public class prob03 {
    public static void main(String[] args) {
        Scanner keyborad = new Scanner(System.in);
        System.out.println("1보다 크고 10보다 작은 정수를 입력하세요. : ");

        int inputInt = keyborad.nextInt();


        // 아래에 구현
        // n! = n*(n-1)!

        if(inputInt<2 || inputInt >9) {
            System.out.println("잘못된 숫자가 입력되었습니다.");
            return;
        }
        int a = 1;
        for(int i = inputInt; i>=1; i--){
            a = a*i;
        }
        System.out.println(inputInt + "!=" + a);
    }
}
// 코드가 아래로 더 없으면 return을 써도 괜찮지만
// 그 아래 코드가 있으면 쓰면 안된다! 메소드가 종료되어버림
/*
if(inputInt<2 || inputInt >9){
            System.out.println("잘못된 숫자가 입력되었습니다.");
        }else {
        int a = 1;
        for(int i = inputInt; i>=1; i—){
            a = a*i;
        }
        System.out.println(inputInt + "!=" + a);
}
 */