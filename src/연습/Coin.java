package 연습;

public class Coin {
    public static void main(String[] args) {
        int n = 1260;
        int count = 0;

        // 큰 단위의 화폐부터 차례대로 확인하기
        int[] array = {500,100,50,10};

        for(int i=0; i<4; i++) {
            count += n/array[i]; // 매번 현재의 동전을 확인 후 남아있는 돈을 현재의 동전으로 나눈 몫을 결과값에 더해준다
            n %= array[i]; // 해당 동전에 대해서 거슬러 주는 게 끝나면 남은 금액도 해당 동전으로 나눈 나머지 값이 될 수 있도록 남은 금액을 줄여준다
        }
        System.out.println(count);
    }
}
