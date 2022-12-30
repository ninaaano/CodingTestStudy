package week2;// @ author ninaaano

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//  입력값 받기. (Input 클래스)
public class Input {
    public List<Integer> playerNumber() {
        System.out.println("숫자를 입력해주세요");
        Scanner scanner = new Scanner(System.in);
        List<Integer> playerNum = new ArrayList<>();
        String input = scanner.next();

        for (String number : input.split("")) {
            playerNum.add(Integer.parseInt(number));
        }
        return playerNum;
    }
}
