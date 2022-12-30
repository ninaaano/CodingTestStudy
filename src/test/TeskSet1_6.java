package test;

import java.util.Scanner;

// 사용자로부터 n개의 정수를 입력받아 n보다 크거나 같으면서 가장 작은 2의 거듭제곱수를 찾아 출력
// ex) n=12 2^4 = 16
public class TeskSet1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int n = 0;
        int result = 1;
        while (true) {
            for (int i = 0; i < n + 1; i++) {
                result = result * 2;
                if (result <= input) {
                    n++;
                } else
                    System.out.println(result);
            }
            break;
        }
    }
}
