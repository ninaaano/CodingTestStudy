package test;

public class TeskSet1_2 {
    public static void main(String[] args) {
        // 1-100000 사이 정수들 중 가장 작은 50개의 소수를 찾아 그 합을 구하여 출력하는 프로그램 작성
        // 만약 소수의 갯수가 50개 미만이면 모든 소수의 합을 구하라
        int count = 0; // 갯수
        int total = 0; // 합
        boolean isPrime = true;

        for(int n=2; n<100000; n++){
            for(int i=2; i*i < n; i++){
                if(n%i == 0)
                    isPrime=false;
                if (isPrime)
                    count++;
            }
            if(count <= 50)
                total += count;
        }
        System.out.println(total);
    }
}
