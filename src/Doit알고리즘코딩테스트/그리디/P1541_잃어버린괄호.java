package Doit알고리즘코딩테스트.그리디;// @ author ninaaano

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 그리디 알고리즘
 * 최솟값 구하기
 * 연산자랑 숫자를 분리해 배열에 담아서 계산
 */
public class P1541_잃어버린괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] number = input.split("[+-]+");
        String[] operator = input.split("[0-9]+");
        int answer = Integer.parseInt(number[0]);

        for (int i = 0; i < operator.length-1; i++) {
            if (operator[i+1].equals("-")) {
                while(i < number.length-1){
                    answer -= Integer.parseInt(number[i+1]);
                    i++;
                }
                break;
            }
            answer += Integer.parseInt(number[i+1]);
        }

        System.out.println(answer);

    }
}
