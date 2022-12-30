package 실습문제;

import java.util.Scanner;
public class FactorialUtil {

    public int factorial(int n) {
        if (n == 1) {
            return n;
        }
            return n = n * this.factorial(n - 1);
        }
        public static void main(String[]args){

            Scanner keyborad = new Scanner(System.in);
            System.out.println("input =");

            FactorialUtil util = new FactorialUtil();
            System.out.println("Result = " + util.factorial(keyborad.nextInt()));

        }
    }


