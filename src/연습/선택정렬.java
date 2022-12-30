package 연습;

import java.util.Arrays;

public class 선택정렬 {
    public static void main(String[] args) {
        int[] array = {9,10,1,4,2,5,6,7,8,3};
        int index,temp;
        for(int i =0; i< array.length-1; i++){
            // 가장 앞의 원소를 초기값으로 설정한다
            index = i;
            // 탐색을 진행하며, 가장 작은 값을 찾는다
            for(int j=i+1; j< array.length; j++){
                if(array[j]<array[index]){
                    index = j;
                }
            }
            // 탐색이 완료되면 가장 작은 값을 가장 앞의 원소와 가장 작은 원소의 위치를 교환. swap
            temp = array[index];
            array[index] = array[i];
            array[i]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
