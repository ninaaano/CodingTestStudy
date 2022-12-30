package 실습문제;

public class CaesarCipher {
    public static void main(String[] args) {

        String sourceString = "everyday we have is one more than we deserve";
        String encodedString = "";
        int s;

        // 프로그램을 구현부 시작
        // 참고 : 문자'a'의 정수값은 97이며, 'z'는 122입니다.
        // char c = 'a'
        // int i = (int) c;
        // char c1 = (char)i;

        for (int i = 0; i < sourceString.length(); i++) {
            s = sourceString.charAt(i);
            if (s != ' ') {
                //System.out.print(' ');
                s = sourceString.charAt(i) + 3;
                if (s > 'z') {
                    s = s - ('z' - 'a' + 1);
                }
            }
            encodedString += (char) s;
        }
        //if(sourceString.charAt(i)=='x' || sourceString.charAt(i)=='y' || sourceString.charAt(i)== 'z'){

        // 프로그램 구현부 끝
        System.out.println("암호화할 문자열 : "+sourceString);
        System.out.println("암호화된 문자열 : "+encodedString);
    }
}
