package 실습문제;
/*
소수란 자신과 1외의 다른 수로는 나누어 떨어지지 않는 정수입니다.
실행결과가 아래와 같이 50이하의 소수를 모두 출력하는 프로그램 작성하십시오

2
3
5
7
...
41
43
47

 */
public class Prob02 {
    public static void main(String[] args) {
        int limit = 50;
        // 아래 불린은 필요하면 쓰고 필요없으면 지우면 됨
        boolean prime = false;

        for (int i = 2; i <= limit; i++) {
            prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime==true) {
                System.out.println(i);

            }
        }
    }
}
/*
public static void main(String[] args) {
        int limit = 50;

        for (int i = 2; i <= limit; i++) {
            if(isPrime(i)) { System.out.println(i); }
        }
    }

    public static boolean isPrime(int target) {
        for(int i = 2; i < target; i++) {
            if(target%i == 0) {
                return false;
            }
        }
        return true;
    }
 */