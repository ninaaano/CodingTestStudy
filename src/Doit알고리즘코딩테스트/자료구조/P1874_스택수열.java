package Doit알고리즘코딩테스트.자료구조;// @ author ninaaano

import java.util.Scanner;
import java.util.Stack;

public class P1874_스택수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        int num = 1;
        // 종료 했다는 것을 알기 위해
        boolean result = true;
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < n; i++){
            int arrNum = arr[i];
            if(arrNum >= num) {
                while(arrNum >= num) {
                    // num의 값은 증가한다
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }else{
                // 작거나 같은 경우
                int temp = stack.pop();
                if(temp > arrNum) {
                    System.out.println("NO");
                    result = false;
                    break;
                }else{
                    sb.append("-\n");
                }
            }
        }
        if(result) System.out.println(sb.toString());
    }
}
