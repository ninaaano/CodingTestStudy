package 연습;

import java.util.Arrays;

public class 버블정렬 {
    public static void main(String[] args) {
        int[] arr = {5,3,1,2,4,10,8,7,9,6};
        int temp;
        // 한 번의 반복이 완료될 때마다 가장 큰 수는 배열의 가장 마지막 부분으로 밀리는 것이 보장
        for(int i = arr.length-1; i>0; i--) {
            boolean swapped = false;
            // 한 번의 반복마다 가장 뒤의 인덱스는 비교하지 않도록 반복문 설정
            for (int j = 0; j < i; j++) {
                // 만일 앞의 수가 뒤의 수 보다 더 크다면 swap 연산
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // 비교했다면 true로 변경
                    swapped = true;
                }
            }
            // 만약 swap된 적이 없다면 이미 정렬되었다는 의미이므로 반복문 종료
            if(swapped == false) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
