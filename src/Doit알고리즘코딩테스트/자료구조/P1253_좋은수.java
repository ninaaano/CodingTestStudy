package Doit알고리즘코딩테스트.자료구조;// @ author ninaaano

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1253_좋은수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 배열의 데이터 개수
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        long[] arr = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            // arr 배열에 데이터 저장하기
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);
        for (int k = 0; k < n; k++) {
            long find = arr[k];
            int i = 0;
            int j = n - 1;
            // 투 포인터 알고리즘
            while (i < j) {
                // 만약 찾고자하는 값이면
                if (arr[i] + arr[j] == find) {
                    // find는 서로 다른 두 수의 합이어야 합을 체크
                    if (i != k && j != k) {
                        result++;
                        break;
                    } else if (i == k) {
                        i++;
                    } else if (j == k) {
                        j--;
                    }
                } else if (arr[i] + arr[j] < find) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        System.out.println(result);
        br.close();
    }
}
