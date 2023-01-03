package Doit알고리즘코딩테스트.자료구조;// @ author ninaaano

import java.util.Scanner;

public class P2018_연속된자연수의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 1;
        int end = 1;
        int sum = 1;
        int count = 1;
        while (end != n){
            if(sum == n){
                count++;
                end++;
                sum = sum+end;
            }else if(sum > n) {
                sum = sum - start;
                start++;
            }else{
                end++;
                sum = sum+end;
            }
        }
        System.out.println(count);
    }
}
