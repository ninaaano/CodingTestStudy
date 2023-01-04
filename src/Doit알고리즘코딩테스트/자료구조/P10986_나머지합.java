package Doit알고리즘코딩테스트.자료구조;// @ author ninaaano

import java.util.Scanner;

public class P10986_나머지합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 수열의 개수
        int N = sc.nextInt();
        // 나누어 떨어져야 하는 수
        int M = sc.nextInt();
        // 합 배열
        long[] S = new long[N];
        // 같은 나머지의 인덱스를 카운트 하는 배열
        long[] C = new long[M];
        long answer = 0;
        S[0] = sc.nextInt();
        // 수열 합 배열 만들기
        for(int i = 1; i < N; i++){
            S[i] = S[i-1] + sc.nextInt(); // 합 배열 저장
        }
        for(int i = 0; i < N; i++){ // 합 배열의모든 값에 % 연산 수행하기
            int remainder = (int)(S[i]%M); // 합 배열을 M으로 나눈 값
            // 0 부터 i까지의 구갑 합 자체가 0일때 정답에 더하기
            if(remainder == 0) answer++;
            // 나머지가 같은 인덱스의 개수 카운팅 하기
            C[remainder]++;
        }
        for(int i=0; i<M; i++){
            if(C[i]>1){
                // 나머지가 같은 인덱스 중 2개를 뽑는 경우의 수 더하기
                answer += (C[i] * (C[i]-1))/2;
            }
        }
        System.out.println(answer);
    }
}
