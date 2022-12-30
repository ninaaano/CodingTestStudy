package week;// @ author ninaaano

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class prob6 {
    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = new ArrayList<>();
        Map<String, String> users = new HashMap<>(); // 비교할때 사용
        HashSet<String> emails = new HashSet<>();

        for(int i=0; i< forms.size(); i++) {
           String email = forms.get(i).get(0);
           String nickname = forms.get(i).get(1);
            for(int j=0; j<nickname.length()-1; j++){
                String check1 = nickname.substring(j,j+2); // 첫번째 닉네임 자르기
                if(!users.containsKey(check1)){ // check1이 포함되어 있지 않으면 users에 추가
                    users.put(check1,email);
                } else{
                    emails.add(users.get(check1)); // 포함되어있다면 users의 닉네임정보를 emails에 추가
                    emails.add(email);
                }
            }
        }
        answer = emails.stream()
                .sorted()
                .collect(Collectors.toList());

        return answer;
    }

    // 이메일 유효성 체크
    public static boolean emailCheck(String email) {
        // 11자 이상 20자 미만
        // 이메일 형식이 email.com 이 아닌 경우
        return email.length() >= 11 && email.length() < 20 && Pattern.matches("^[a-z0-9A-Z._-]*@[email]*.[com]*$", email);
    }

    // 닉네임 유효성 체크
    public static boolean nicknameCheck(String nickname) {
        // 특수문자, 영어, 숫자 예외처리
        // 닉네임 길이는 1자 이상 20자 미만
        return nickname.length() >= 1 && nickname.length() < 20 && Pattern.matches("[가-힣]*$", nickname);
    }

    public static void main(String[] args) {
        System.out.println(solution(List.of(
                List.of("jm@email.com", "제이엠"),
                List.of("jason@email.com", "제이슨"),
                List.of("woniee@email.com", "워니"),
                List.of("mj@email.com", "엠제이"),
                List.of("nowm@email.com", "이제엠")
        )));
    }
}
