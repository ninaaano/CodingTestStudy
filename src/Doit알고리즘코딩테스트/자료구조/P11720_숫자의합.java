package Doit알고리즘코딩테스트.자료구조;// @ author ninaaano

import java.util.Scanner;

public class P11720_숫자의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // n의 범위가 100까지 이므로 int,long 사용 불가
        String s = sc.next();
        char[] c = s.toCharArray();
        int sum = 0;
        for(int i=0; i<c.length; i++){
            sum+=c[i] - '0';
        }
        System.out.print(sum);
    }
}
