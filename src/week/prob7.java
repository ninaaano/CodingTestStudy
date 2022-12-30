package week;// @ author ninaaano

import java.util.*;

public class prob7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = new ArrayList<>();
        List<String> friendsList = new ArrayList<>(); // 이미 친구
        HashSet<String> checkFriend = new HashSet<>(); // 친구
        Map<String, Integer> score = new HashMap<>(); // 점수

        for (int i = 0; i < friends.size(); i++) {
            String friend = friends.get(i).get(0); // 친구
            String unknown = friends.get(i).get(1); // 친구의 친구
            if (friends.contains(user)) { // 친구 목록에 친구가 있다면
                friendsList.add(friend); // 이미 친구 목록에 추가
            } else {
                friendsList.add(unknown); // 아니라면 친구가 될 수 있는지에 추가
            }
        }

        //함께아는 친구 수 계산
        for (int i = 0; i < friends.size(); i++) {
            String friend = friends.get(i).get(0);
            String unknown = friends.get(i).get(1);
            if (friend.equals(user) || unknown.equals(user))
                continue;
            if (checkFriend.contains(friend) && checkFriend.contains(unknown))
                continue;
            if (checkFriend.contains(friend)) {
                if (score.containsKey(unknown)){
                    score.put(unknown, score.get(unknown) + 10);
                } else {
                    score.put(unknown, 10);
                }
            } else if (checkFriend.contains(unknown)) {
                if (score.containsKey(friend)){
                    score.put(friend, score.get(friend) + 10);
                } else{
                    score.put(friend, 10);
                }
            }
        }
        //방문횟수
        for (int i = 0; i < visitors.size(); i++) {
            if (!checkFriend.contains(visitors.get(i))) {
                if (score.containsKey(visitors.get(i))) {
                    score.put(visitors.get(i), score.get(visitors.get(i))+1);
                } else {
                    score.put(visitors.get(i), 1);
                }
            }
        }

        List<Map.Entry<String, Integer>> score_list = new ArrayList<>(score.entrySet());
        //추천 점수가 동일한 경우 이름순 정렬
        Collections.sort(score_list, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        //추천 점수가 가장 높은 순으로 정렬
        Collections.sort(score_list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        //최대 5명까지 입력
        for (int i = 0; i < score_list.size(); i++) {
            if (i > 4) break;
            answer.add(score_list.get(i).getKey());
        }

        return answer;
    }




    public static void main(String[] args) {
        System.out.println(solution("mrko", List.of(
                        List.of("donut", "andole"),
                        List.of("donut", "jun"),
                        List.of("donut", "mrko"),
                        List.of("shakevan", "andole"),
                        List.of("shakevan", "jun"),
                        List.of("shakevan", "mrko")),
                List.of("bedi", "bedi", "donut", "bedi", "shakevan")
        ));
    }
}
