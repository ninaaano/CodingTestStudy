package 실습문제;
/* 임의의 정수를 입력 받아서, 1부터 1000까지의 수 중에서
입력받은 정수의 배수의 개수와 배수들의 합을 계산하십시오
[출력값]
양의 정수를 입력하세요 :
()의 배수 개수 =
()의 배수 합 =
 */
import java.util.Scanner;
public class prob04 {
    public static void main(String[] args) {

        int number = 0;
        int count = 0;
        int sum = 0;

        Scanner keyborad = new Scanner(System.in);
        System.out.println("양의 정수를 입력하세요 : ");
        number = keyborad.nextInt();

        for(int i=0; i<1001; i++) {
            if (i % number == 0) {
                count++;
                sum += i;
            }
        }

        System.out.println(number + "의 배수 개수 = "+count);
        System.out.println(number + "의 배수 합 = "+sum);
    }
}
