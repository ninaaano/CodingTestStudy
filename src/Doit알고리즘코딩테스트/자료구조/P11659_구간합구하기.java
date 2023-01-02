package Doit알고리즘코딩테스트.자료구조;// @ author ninaaano

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659_구간합구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int suNo = Integer.parseInt(st.nextToken());
        int quizNo = Integer.parseInt(st.nextToken());
        long[] S = new long[suNo+1];
        st = new StringTokenizer(br.readLine());
        // 숫자 개수만큼 반복하기
        for(int i=1; i<= suNo; i++){
            // 합 배열 생성
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }
        // 질의 개수만큼 반복하기
        for(int q = 0; q < quizNo; q++){
            // 질의 범위 받기
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            // 구간 합 출력
            System.out.println(S[j] - S[i-1]);
        }
    }
}
