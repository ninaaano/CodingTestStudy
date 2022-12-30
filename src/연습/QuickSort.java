package 연습;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] a){
        pivot_sort(a,0,a.length-1);
    }

    private static void pivot_sort(int[] a, int lo, int hi) {
        // lo가 hi보다 크거나 같다면 정렬할 원소가 1개 이하이므로 정렬하지 않고 리턴한다
        if(lo>=hi){
            return;
        }
        int pivot = partition(a,lo,hi);
        // Recursion
        pivot_sort(a,lo,pivot-1); // left
        pivot_sort(a,pivot+1,hi); // right
    }

    private static int partition(int[] a, int left, int right) {
        int lo = left;
        int hi = right;
        int pivot = a[left]; // 부분리스트의 왼쪽 요소를 피벗으로 설정

        while(lo<hi) {
            // hi가 lo보다 크면서 hi의 요소가 pivot보다 작거나 같은 찾을 때까지 hi 감소
            while (hi > lo && a[hi] > pivot) {
                hi--;
            }
            // hi가 lo보다 크면서 lo의 요소가 pivot보다 큰 원소를 찾을 때 까지 lo증가
            while (hi > lo && a[lo] <= pivot) {
                lo++;
            }
            swap(a,lo,hi); // 교환 될 두 원소를 찾았으면 두 요소를 바꾼다
        }
        // 마지막으로 맨 처음 pivot으로 설정했던 위치(a[left])의 요소와 lo가 가리키는 원소를 바꾼다
        swap(a,left,lo);
        // 두 요소가 교환되었다면 피벗이였던 요소는 lo에 위치하므로 lo 반환
        return lo;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void printArray(int[] arr) {
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 9, 4, 7, 5, 0, 1, 6, 8, 2};
        printArray(arr);
        sort(arr);
        printArray(arr);
    }
}
