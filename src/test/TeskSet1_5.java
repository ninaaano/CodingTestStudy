package test;

import java.util.Scanner;

// 사용자로부터 n개의 정수를 받아서 최댓값에서 최솟값을 뺀 값을 계산해 출력하는 프로그램
public class TeskSet1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];

        for(int i=0;i<n;i++){
            data[i]= sc.nextInt();
        }

        int max = data[0];
        int min = data[0];

        for(int i=0; i<n; i++){
                if (data[i] > max) { // 최댓값
                    max = data[i];
                }
                if (data[i] < min) { // 왜 계속 min이 0일까
                    min = data[i];
                }

        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(max-min);

    }
}
