package 실습문제;
// 문자열의 순서를 뒤집어서 char 배열로 리턴하는 메소드 정의
// 문자를 가르키는 인덱스(start,end)는 0부터 시작한다
// s=0,e=3 > a. avaJProgram
// s=4,e=7 > b. JavagorPram
// s=8,e=10 > c. JavaProgmar
// s=0,e=10 > d. margoPavaJ 로 리턴

public class ArrayUtil {
    public char[] reverseString(char[] s, int start, int end) {
        char[] c = new char[s.length]; // 새로운 배열
        char temp = ' ';
        c=s;

        for (int i = start; i <= (start+end)/2; i++) {
            int j = start+end-i;
            temp = c[i];
            c[i]=c[j];
            c[j]=temp;
          }
          return c;
    }

    public static void main(String[] args) {
        ArrayUtil au = new ArrayUtil();
        char[] s = {'J', 'a', 'V', 'a', 'P', 'r', 'o', 'g', 'r', 'a', 'm'};
        System.out.println(au.reverseString(s, 0, 3));
//        System.out.println(au.reverseString(s, 4, 7));
//        System.out.println(au.reverseString(s, 8, 10));
//        System.out.println(au.reverseString(s, 0, 10));
    }
}
