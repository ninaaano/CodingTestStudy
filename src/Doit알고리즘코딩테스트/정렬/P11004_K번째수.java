package Doit알고리즘코딩테스트.정렬;// @ author ninaaano

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 왼쪽 기준으로 퀵 정렬을 하니까 시간 초과가 났다. 이게 머선129..
 */
public class P11004_K번째수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        pivot_sort(arr,0,arr.length-1);

        System.out.println(arr[k-1]);
    }


    private static void pivot_sort(int[] arr, int lo, int hi) {
        // 정렬할 원소가 1개 이하기 때문에 정렬하지 않고 함수 종료한다
        if(lo>=hi) return;
        int pivot = partition(arr,lo,hi);
        // 재귀(리커시브)
        pivot_sort(arr,lo,pivot);
        pivot_sort(arr,pivot+1,hi);
    }

    private static int partition(int[] arr, int left, int right) {
        // lo와 hi는 각각 배열의 끝에서 1 벗어난 위치에서 시작한다
        int lo = left-1;
        int hi = right+1;
        int pivot = arr[(left+right)/2]; // 부분 리스트의 중앙 요소

        while(true){
            /**
             * 1 증가 시키고 난 뒤의 lo 위치의 요소가 pivot보다 큰 요소를 찾을때 까지반복
             */
            do{
                lo++;
            }while(arr[lo] < pivot) ;

            /**
             * 1 감소 시키고 난 뒤의 hi 위치가 lo보다 크거나 같은 위치면서
             * hi 위치의 요소가 pivot보다 작은 요소를 찾을 때 까지 반복
             */
            do{
                hi--;
            }while(arr[hi] > pivot && lo <= hi);

            /**
             * 만약 hi가 lo보다 크지 않다면 (엇갈린다면) swap 하지않고 hi리턴
             */
            if(lo>=hi){
                return hi;
            }

            // 교환될 두 요소를 찾았으면 두 요소를 바꾼다
            swap(arr,lo,hi);
        }
    }

    private static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j] ;
        a[j] = temp;
    }
}
