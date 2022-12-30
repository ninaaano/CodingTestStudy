package 연습;

import java.util.Arrays;

public class 삽입정렬 {
    public static void main(String[] args) {
        // 배열 랜덤 생성
        int[] arr = new int[10];
        for(int i=0; i<10; i++){
            arr[i] = (int)(Math.random()*10);
        }
        // 2번째 원소부터 시작
        for(int i=1; i<arr.length; i++){
            // 현재 선택된 원소의 값을 임시 변수에 저장
            int index = arr[i];
            // 현재 원소 기준으로 이전 원소를 탐색하기위한 변수
            int temp = i-1;
            // 현재 원소가 이전 원소보다 크기 전까지 반복. 단 0번째 원소까지만 비교한다
            while(temp>=0 && index < arr[temp]){
                // 이전 원소는 한 칸씩 뒤로 미룬다
                arr[temp+1]=arr[temp];
                // 다음 대상 원소를 탐색한다
                temp--;
            }
            // 탐색이 종료된 지점에서 현재 선택되었던 변수의 값을 삽입해준다.
            // 여기서 탈출하는 경우 앞의 원소보다 index가 작다는 의미이므로
            // index는 temp뒤에 와야한다. 그러므로 index는 temp+1
            arr[temp+1]=index;
        }
        System.out.println(Arrays.toString(arr));
    }
}
