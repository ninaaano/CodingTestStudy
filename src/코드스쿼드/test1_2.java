package 코드스쿼드;// @ author ninaaano

import java.util.Scanner;

public class test1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1~99 사이의 정수를 입력하시오 >> ");
        int number = sc.nextInt();
        if (number < 1 && number > 99) {
            System.out.println("범위 밖 입니다.");
            return;
        }
        while (true) {
            for (int i = 1; i < 100; i++) {
                int ten = (i / 10) % 10; // 십의 자릿수
                int one = i % 10; // 일의 자릿수
                if (one == 3 || one == 6 || one == 9 || ten == 3 || ten == 6 || ten == 9) { // 1개만 해당되는 경우
                    System.out.println("박수짝");
                    continue;
                } else if (one == 3 || one == 6 || one == 9 && ten == 3 || ten == 6 || ten == 9) {// 2개 해당
                    System.out.println("박수짝짝");
                    continue;
                }
                if (sc.equals("Quit")) {
                    System.out.println("게임이 종료됩니다");
                    break;
                }
            }
        }
    }
    }

