package Doit알고리즘코딩테스트.정수론_소수구하기;// @ author ninaaano

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 팰린드롬
 * 에라토스테네스의 체
 */
public class P1747_소수팰린드롬 {
    static int limit = 1003001; // 소수면서 n보다 크거나 같은 수중 소수 중 가장 작은수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=n; i<= limit; i++){
            if(isPalindrome(i) && isPrime(i)){
                System.out.println(i);
                break;
            }
        }
    }

    public static boolean isPalindrome(int n){
        StringBuilder sb = new StringBuilder(n+"");
        if(!sb.toString().equals(sb.reverse().toString())){
            return false;
        }
        return true;
    }

    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2; i*i<=n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
