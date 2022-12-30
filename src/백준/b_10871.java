package 백준;// @ author ninaaano

import java.io.*;
import java.util.StringTokenizer;

public class b_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            int count = Integer.parseInt(st.nextToken());
            arr[i] = count;
            if(arr[i]<max){
                bw.write(arr[i]+" ");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
