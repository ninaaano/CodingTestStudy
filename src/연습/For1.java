package 연습;

import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N,K를 공백을 기준으로 구분하여 입력 받기
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 0;
        while(true){
            // N이 K로 나누어 떨어지는 수가 될 때까지 빼기
            int target = (n/k) * k;
            result += (n-target);
            n=target;
            // N이 K보다 작을 떄(더 이상 나눌 수 없을 때)반복문 탈출
            if(n<k) break;
            // K로 나누기
            result += 1;
            n /= k;
        }
        result += (n-1);
        System.out.println(result);
    }
}
