package 실습문제;

public class ProbLeftpad {
    public String leftPad(String str, int size, char padChar) {
        if (str.length() >= size) {
            return str;
        }
        String result = "";
        for (int i = 0; i < size - str.length(); i++) {
            result += padChar;
        }
        result += str;

        return result;
    }


    public static void main(String[] args) {

        ProbLeftpad prob3 = new ProbLeftpad();

        System.out.println(prob3.leftPad("ABC",6,'#'));
        System.out.println(prob3.leftPad("ABC",5,'$'));
        System.out.println(prob3.leftPad("ABC",2,'&'));

    }
}
