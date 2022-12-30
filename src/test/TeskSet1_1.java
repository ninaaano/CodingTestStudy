package test;

public class TeskSet1_1 {
    // 1-100000 사이의 정수들 중 소수의 개수를 세어 출력하는 프로그램
    public static void main(String[] args) {
        int count = 0;
        for(int n=2; n<100000; n++){ // 소수는 2부터 판별.
            boolean isPrime = true; // 소수임을 참으로 선언
            for(int i=2; i*i<=n&&isPrime; i++)  // 루트 n을 기억
                if(n%i==0)  // 나머지가 0이란 것은 소수가 아니기 때문에
                    isPrime = false;

            if(isPrime)
                count++;
        }
        System.out.println(count);

    }
}
