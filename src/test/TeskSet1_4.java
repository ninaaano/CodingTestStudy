package test;

import java.util.Scanner;

// 사용자로부터 하나의 정수 n을 입력받는다. 그런 다음 n줄을 출력
// 1 / 1 2 / 1 2 3 / 1 2 3 4
public class TeskSet1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++)  {
            for(int j=1; j<=i+1; j++)
            System.out.print(j + " ");
            System.out.println();
        }
    }
}
