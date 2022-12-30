package week2;// @ author ninaaano

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//  1부터 9까지의 서로 다른 임의의 수 3개를 생성하기. (GenerateRandomNum 클래스)
public class GenerateRandomNum {
    public int randomMake() {
        Random random = new Random();
        return random.nextInt(9) + 1;
    }

    public List<Integer> create() {
        List<Integer> computerNumber = new ArrayList<>();
        while (computerNumber.size() < 3) {
            int randomNumber = randomMake();
            if (computerNumber.contains(randomNumber)) {
                continue;
            } else {
                computerNumber.add(randomNumber);
            }
        }
        return computerNumber;
    }
}
