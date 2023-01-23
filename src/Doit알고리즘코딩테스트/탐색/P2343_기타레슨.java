package Doit알고리즘코딩테스트.탐색;// @ author ninaaano

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 이분 탐색. 최솟값 찾기
 */
public class P2343_기타레슨 {
    static int n;
    static int m;
    static int min;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            max += arr[i];
            // 강의 중 크기가 가장 오른쪽 값이 lo의 끝값
            // 굳이 이걸 써야하는 이유? 안쓰면 틀림. length-1로 하면 안되는걸까?
            min = Math.max(min, arr[i]);
        }
        System.out.println(BinarySearch(arr));
    }

    private static int BinarySearch(int[] arr) {
        int lo = min;
        int hi = max; // 배열 값을 모두 더한 값

        while(lo<=hi){
            int mid = (lo+hi)/2;
            int sum = 0;
            int count = 1;

            for(int i = 0; i<n; i++){
                // 강의를 담으면서 mid보다 커지면 필요한 블루레이 수 증가
                if(sum+arr[i] > mid){
                    count++;
                    sum =arr[i];
                }else{
                    // 담은 레슨 말고 다시 담아보면서 합을 구한다
                    sum+=arr[i];
                }
            }
            /**
             * 블루레이 갯수가 m보다 적다면 블루레이 1개당 크기를 줄이고
             * 블루레이 갯수가 m보다 많다면 블루레이 1개당 크기를 늘린다
              */
            if(count <= m){
                hi = mid -1;
            }else
                lo = mid+1;
        }
        return lo;
    }
}
