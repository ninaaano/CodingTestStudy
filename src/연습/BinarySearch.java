package 연습;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 4, 6, 1, 7, 8, 10};
        System.out.print("찾을 데이터 : ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int low = 0;
        int high = arr.length - 1;
        int mid ;

        // 배열이 정렬되어 있어야 한다
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        while (low <= high) {
            mid = (low + high) / 2;
            if (target == arr[mid]) {
                System.out.println("찾는 데이터 : " + target);
                break;
            }else if (target > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
    }
}
