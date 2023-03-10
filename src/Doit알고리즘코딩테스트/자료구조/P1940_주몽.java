package Doit알고리즘코딩테스트.자료구조;// @ author ninaaano

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1940_주몽{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int cnt = 0;
        int i = 0;
        int j = n-1;
        while (i < j){
            if(arr[i] + arr[j] < m){
                i++;
            }else if(arr[i]+arr[j] > m){
                j--;
            }else{
                cnt++;
                i++;
                j--;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
