package Doit알고리즘코딩테스트.유클리드호제법;// @ author ninaaano

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1850_최대공약수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long result = gcb(a,b);
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<result;i++){
            sb.append(1);
        }

        System.out.println(sb);
    }

    private static long gcb(long a, long b) {
        while(b!=0){
            long r = a%b;
            a=b;
            b=r;
        }
        return a;
    }
}
