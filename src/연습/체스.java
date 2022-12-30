package 연습;// @ author ninaaano

import java.util.Scanner;

public class 체스 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr =  new int[6];
        int count = 0;
        int[] arr1 = {1,1,2,2,2,8};
        for(int i = 0; i<arr1.length; i++){
            count = sc.nextInt();
            arr[i] = arr1[i]-count;
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
