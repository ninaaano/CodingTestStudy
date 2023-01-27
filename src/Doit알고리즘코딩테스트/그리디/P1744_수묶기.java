package Doit알고리즘코딩테스트.그리디;// @ author ninaaano

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 그리디 알고리즘
 * 변수가 많은 문제이다
 * 1. 음수 * 음수
 * 2. 음수 * 0
 * 3. 입력값이 1개일 때
 * 4. 입력값에 1만 두개일때
 */

public class P1744_수묶기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            // 0 포함 음수들의 갯수
            if (arr[i] <= 0) {
                count++;
            }
        }

        Arrays.sort(arr);

        int answer = 0;


        // 음수(0포함), 두개씩 계산
        for (int i = 1; i < count; i += 2) {
            answer +=  (arr[i - 1] * arr[i]);
        }

        // 음수(0포함)가 홀수일 경우.
        if (count % 2 == 1) {
            answer += arr[count - 1];
        }

        // 얌수가 홀수 개일 때
        if ((n - count) % 2 == 1) {
            answer += arr[count];
        }

        // 정렬했으니까 마지막 값이 제일 큰 값이다. 역순으로 계산한다
        for (int i = n - 1; i > count; i -= 2) {
            int mul = arr[i] * arr[i - 1];
            int sum = arr[i] + arr[i - 1];
            if (mul > sum) {
                answer += mul;
            } else
                answer += sum;
        }

        System.out.println(answer);


    }
}
