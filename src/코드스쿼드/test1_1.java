package 코드스쿼드;// @ author ninaaano

import java.util.Scanner;

public class test1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 3개 입력 >> ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        if(a>b && a<c) {
            System.out.println("중간값은 : " + a);
        }else if(b>a && b<c) {
            System.out.println("중간값은 : " + b);
        } else
            System.out.println("중간값은 : " + c);
    }
}
