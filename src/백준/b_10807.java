package 백준;// @ author ninaaano

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int searchNum = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i =0; i< arr.length; i++){
            if(arr[i]==searchNum){
                cnt++;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
