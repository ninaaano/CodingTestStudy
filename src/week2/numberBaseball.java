package week2;// @ author ninaaano

import java.util.*;

public class numberBaseball {
        public static void main(String[] args) {
            List<String> computerNum = makeNums();
            List<String> playerNum = new ArrayList<>();
            String answer = "";
            int total = 0;
            int strike = 0;
            int ball = 0;
            int chance = 0;

            while (true) {
                playerNum = inputNums();
                total = calTotal(computerNum, playerNum);
                strike = calStrike(computerNum, playerNum);
                ball = calBall(total, strike);
                answer = calGame(strike, ball);

                if (answer.equals("3 스트라이크")) {
                    System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                    System.exit(0);
                } else {
                    System.out.println(answer);
                }
            }
        }

        //  컴퓨터의 숫자 반환 메서드
        static List<String> makeNums() {
            Set<String> set = new HashSet<>();
            while (true) {
                set.add(String.valueOf((int)(Math.random() * 9) + 1));
                if (set.size() == 3) {
                    break;
                }
            }
            List<String> list = new ArrayList<>(set);
            Collections.shuffle(list);
            return list;
        }

        //  사용자의 숫자 입력 메서드
        static List<String> inputNums() {
            Scanner scan = new Scanner(System.in);
            List<String> list = new ArrayList<>();
            int input = 0;

            while (true) {
                System.out.print("숫자를 입력해주세요 ex)123 : ");
                input = scan.nextInt();
                if (input < 123 || input > 987) {
                    System.out.println("잘못된 범위입니다. 다시 입력해주세요.");
                    continue;
                }
                list = Arrays.asList(String.valueOf(input).split(""));
                Set<String> tmpSet = new HashSet<>(list);
                if (tmpSet.size() != 3) {
                    System.out.println("중복된 숫자는 안됩니다. 다시 입력해주세요.");
                    continue;
                }
                break;
            }

            return list;
        }

        //  strike 와 ball 의 개수에 따라 경기 결과를 반환 메서드
        static String calGame(int strike, int ball) {
            StringBuilder sb = new StringBuilder();

            if (strike == 3) {
                sb.append("3 스트라이크");
            } else if (strike > 0 && strike <= 2) {
                sb.append(strike + " 스트라이크 ");
            }

            if (ball > 0) {
                sb.append(ball + "볼");
            } else if (strike == 0 && ball == 0) {
                sb.append("낫싱");
            }

            return sb.toString();
        }

        //  총 해당 숫자 개수인 total 구하는 메서드
        static int calTotal(List<String> computer, List<String> player) {
            int total = 0;

            for (int i = 0; i < computer.size(); i++) {
                if (computer.contains(player.get(i))) {
                    total++;
                }
            }

            return total;
        }

        //  strike 계산 메서드
        static int calStrike(List<String> computer, List<String> player) {
            int strkike = 0;

            for (int i = 0; i < computer.size(); i++) {
                if (computer.get(i).equals(player.get(i))) {
                    strkike++;
                }
            }

            return strkike;
        }

        //  ball 계산 메서드
        static int calBall(int total, int strike) {
            return total - strike;
        }
    }

