package 실습문제;
// 소수를 구해서 소수의 개수를 리턴하는 메소드
// 소수를 배열에 저장, 배열을 리턴
 public class Util{
        public int findPrimeCount(int limit) {
            int primeCount = 0;
            boolean prime = false;

            for (int i = 2; i <= limit; i++) {
                prime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    primeCount++;
                }
            } return primeCount;
    }

    public int[] findPrimeReturnArray(int limit) {
        int primeCount = this.findPrimeCount(limit);
        int arr[] = new int[primeCount];
        int temp = 0;

        boolean prime = false;

        for (int i = 2; i <= limit; i++) {
            prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if(prime) {
                arr[temp] = i;
                temp++;
            }
        }
        return arr;
    }

    }



