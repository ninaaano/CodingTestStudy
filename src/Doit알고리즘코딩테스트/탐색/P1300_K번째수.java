package Doit알고리즘코딩테스트.탐색;// @ author ninaaano

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 이분탐색
 * lower-bound
 */
public class P1300_K번째수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        // x의 범위는 lo<=x<=hi
        long lo = 1;
        long hi = k;

        while(lo<hi){
            long mid = (lo+hi)/2;
            long count = 0;

            /**
             *  임의의 x에 대해 i번 째 행을 나눔으로써 x보다 작거나 같은 원소의 개수
             *  누적 합을 구한다.
             *  이 때 각 행의 원소의 개수가 N(열 개수)를 초과하지 않는 선에서 합해주어야 한다.
             */
            for(int i = 1; i<=n; i++){
                count += Math.min(mid/i,n);
            }
            
            // count가 많다는 것은 임의의 x(mid)보다 작은 수가 B[K]보다 많다는 뜻
            if(k <= count){
                hi=mid;
            }else
                lo=mid+1;
        }
        System.out.println(lo);
    }
}

