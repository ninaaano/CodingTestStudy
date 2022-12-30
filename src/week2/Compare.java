package week2;// @ author ninaaano

import java.util.List;

//  컴퓨터의 수(3자리)와 플레이어의 수(3자리)를 비교하기. (Compare 클래스)
public class Compare {
    public int howMany(List<Integer> computer, List<Integer> player) {
        int result = 0;
        for (int i = 0; i < player.size(); i++) {
            if (computer.contains(player.get(i))) {
                result += 1;
            }
        }
        return result;
    }

    public int countStrike(List<Integer> computer, List<Integer> player) {
        int strike = 0;
        for (int i = 0; i < player.size(); i++) {
            if (computer.get(i) == player.get(i)) {
                strike += 1;
            }
        }
        return strike;
    }
}
