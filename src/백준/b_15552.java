package 백준;// @ author ninaaano

import java.io.*;
import java.util.StringTokenizer;

public class b_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            StringTokenizer str = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());
            arr[i] = a+b;
            bw.write(String.valueOf(arr[i])); // 뒤에 "\n"을 해도된다
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
