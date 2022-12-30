package week;// @ author ninaaano

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class prob5 {
    public static List<Integer> solution(int money) {
        List<Integer> coin = new ArrayList<>(Arrays.asList(50000,10000,5000,1000,500,100,50,10,1));
        List<Integer> answer = new ArrayList<>();

        for(int price : coin){
            answer.add(money/price);
            money %= price;
        }
        return answer;
    }

    public static void main(String[] args) {
        prob5 prob = new prob5();
        System.out.println(solution(50237));
    }
}
