package 백준;// @ author ninaaano

import java.util.Scanner;

public class b_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i< arr.length; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i]=a+b;
        }
        for(int j : arr)
            System.out.println(j);
        sc.close();
    }
}
