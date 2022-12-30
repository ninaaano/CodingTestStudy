package week;// @ author ninaaano

public class prob4 {
    public static String solution(String word) {
        String answer = "";

        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch > 'a' && ch < 'z'){
                ch = (char) ('z'-(ch-'a'));
            }
            if(ch > 'A' && ch < 'Z'){
                ch = (char) ('Z'-(ch-'A'));
            }
            answer += ch;
        }
        return answer;
    }

    public static void main(String[] args) {
        prob4 prob = new prob4();
        System.out.println(solution("I love you"));
    }
}
