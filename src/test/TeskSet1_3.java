package test;

import java.util.Scanner;

// 사용자로부터 n개의 정수를 받아 그 중 짝수를 더한 값에서 모든 홀수를 뺀 값 계산해 출력하는 프로그램
// ex) n = 5, 1 6 8 9 12 = 21-10=16
public class TeskSet1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 배열 갯수
        int[] data = new int[n]; // 배열 길이
        int a = 0; // 짝수
        int b = 0; // 홀수
        int sum = 0; // 합

        // 배열에 값이 짝수인지 홀수인지
        for(int i = 0; i<n; i++) {
            data[i] = sc.nextInt();
            if (data[i] % 2 == 0) {
                a+=data[i]; // 짝수면 a에 배열의 값 더하기
            }else
                b+=data[i]; // 홀수면 b에 배열의 값 더하기
        }
        System.out.println(a);
        System.out.println(b);

        sum = a-b;
        System.out.println("결과 : "+sum);
    }
}
