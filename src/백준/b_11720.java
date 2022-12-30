package 백준;// @ author ninaaano

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 한 줄씩 읽는다
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += br.read()-'0'; // read() > 한 자리씩 아스키코드 읽는다
        }
        System.out.println(sum);
    }
}

