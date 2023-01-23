package Doit알고리즘코딩테스트.탐색;// @ author ninaaano

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 바이너리 서치
 * 메소드를 이용해서 풀거나
 * API 사용
 */

public class P1920_수찾기 {
    static StringTokenizer st;
    static StringBuilder sb;
    static int[] arr;

    private static int binarySearch(int key) {
        int lo = 0; // 탐색 범위의 왼쪽 끝 인덱스
        int hi = arr.length-1; // 탐색 범위의 오른쪽 끝 인덱스

        // lo가 ho보다 커지기 전까지 반복한다
        while (lo <= hi) {
            int mid = (lo+hi)/2; // 중간위치

            // key값이 중간 위치의 값보다 작을 경우
            if(key < arr[mid]){
                hi = mid-1;
            }

            // key값이 중간 위치의 값보다 클 경우
            else if(key > arr[mid]){
                lo = mid + 1;
            }

            // key값과 중간 위치의 값이 같을 경우
            else{
                return mid;
            }
        }

        // 찾고자 하는 값이 존재하지 않을 경우
        return -1;
    }

    /**
     * 자바에서는 음수 값을 -(low+1)로 반환하는데,
     * 이는 해당 값이 어디 위치에 가까운지 알 수 있기 때문이다
     */


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        for(int i = 0; i<m; i++){
            if(binarySearch(Integer.parseInt(st.nextToken())) >= 0){
                sb.append(1).append('\n');
            }else{
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);

        // api 를 이용해서 푼 방법
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        arr = new int[n];
//        st = new StringTokenizer(br.readLine());
//
//        for(int i=0; i<n; i++){
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//        int m = Integer.parseInt(br.readLine());
//
//        Arrays.sort(arr);
//        sb = new StringBuilder();
//        st = new StringTokenizer(br.readLine());
//
//        for(int i=0; i<m; i++){
//            if(Arrays.binarySearch(arr, Integer.parseInt(st.nextToken())) >= 0){
//                sb.append(1).append('\n');
//            }else{
//                sb.append(0).append('\n');
//            }
//        }
//        System.out.println(sb);
    }
}
