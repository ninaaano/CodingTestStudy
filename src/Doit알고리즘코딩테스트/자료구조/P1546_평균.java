package Doit알고리즘코딩테스트.자료구조;// @ author ninaaano

import java.util.Scanner;

public class P1546_평균 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        long sum = 0;
        long max = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] > max) max =  arr[i];
            sum += arr[i];
        }
        System.out.println(sum * 100.0 / max / n);
    }
}
