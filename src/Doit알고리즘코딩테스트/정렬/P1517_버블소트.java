package Doit알고리즘코딩테스트.정렬;// @ author ninaaano

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제 이름은 버블 소트인데 버블 소트로 풀면 시간초과가 나는 이상한 문제
 * 찾아보니 머지소트로 풀어야 한다고 한다
 */

public class P1517_버블소트 {

    static long swapped;
    static long[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        merge_sort(0,n-1);
        System.out.println(swapped);
    }

    private static long merge_sort(int start, int end) {
        if(start == end){
            return 0;
        }
        int mid = (start+end)/2;
        long[] sorted = new long[end - start + 1];
        swapped = merge_sort(start,mid) + merge_sort(mid+1,end);
        {
            int left = start; // 앞 부분 인덱스
            int right = mid+1; // 뒷 부분 인덱스
            int k = 0;

            while(left <= mid || right <= end){
                // right > end || 로 앞부분에 남아있을 경우 처리
                if(left <= mid && (right > end || arr[left] <= arr[right])){
                    sorted[k++] = arr[left++];
                }else{
                    swapped += mid-left+1; // 왼쪽의 남은 크기만큼 더한다
                    sorted[k++] = arr[right++];
                }
            }
        }
        for(int i = start; i<= end; i++){
            arr[i] = sorted[i-start];
        }
        return swapped;
    }
}
