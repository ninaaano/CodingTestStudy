package 실습문제;

public class Prob {

    public int abs(int num1, int num2){
        int abs;
        if(num1>num2){
            abs = num1-num2;
        }else
            abs = num2-num1;
        return abs;
    }

    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 15;

        Prob prob = new Prob();
        System.out.println("두 수의 차는 : "+prob.abs(num1,num2));
    }

}
