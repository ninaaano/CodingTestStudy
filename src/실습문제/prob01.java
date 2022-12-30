package 실습문제;

/*
1보다 크고 10보다 작은 정수를 입력 받아서 아래와 같은 실행 결과가 나타나도록 prob 클래스의 main 메서드 완성
입력 받은 숫자에 해당하는 구구단을 완성시키는 프로그램이다.
2보다 작거나 9보다 큰 정수가 입력될 경우에는 "잘못된 숫자가 입력되었습니다" 라는 경고메세지 출력
프로그램 종료

1보다 크고 10보다 작은 정수를 입력하세요 :3
3 * 1 = 3
3 * 2 = 6
...
3 * 9 = 27
 */

import java.util.Scanner;

public class prob01 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("1보다 크고 10보다 작은 정수를 입력하세요 : ");
        int inputInt = keyboard.nextInt();

        if (inputInt < 2 || inputInt > 9) {
            System.out.println("잘못된 숫자가 입력되었습니다.");
            return;
        }

        for (int i = 0; i < 9; i++) {
            System.out.println(inputInt + "*" + (i + 1) + "=" + (inputInt * (i + 1)));
        }
    }
}

