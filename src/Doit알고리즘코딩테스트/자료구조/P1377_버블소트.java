package Doit알고리즘코딩테스트.자료구조;// @ author ninaaano


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class mData implements Comparable<mData>{
    int data;
    int index;

    public mData(int data, int index) {
        this.data = data;
        this.index = index;
    }

    @Override
    public int compareTo(mData o) { // data 기준 오름차순
        return this.data - o.data;
    }
}
public class P1377_버블소트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        mData[] arr = new mData[n];
        for(int i=0; i<n; i++){
            arr[i] = new mData(Integer.parseInt(br.readLine()),i);
        }
        Arrays.sort(arr);
        int max = 0;
        for(int i=0; i<n; i++){
            // arr[i]의 정렬 전 index - 정렬 후 index 최댓값 찾아 계산하기
            if(max < arr[i].data-i);
            max = arr[i].data-i;
        }
        System.out.println(max+1); // 왜 1추가하는지 이해를 못하겠다..

    }
}
