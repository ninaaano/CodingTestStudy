package Doit알고리즘코딩테스트.자료구조;// @ author ninaaano

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P2164_카드게임 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 왜 이건 틀리다고 나올까?
        // int n = br.read()-48;
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=n; i++){
            q.add(i);
        }
        while(q.size()!=1){
            q.poll();
            int a = q.poll();
            q.add(a);
        }
        // peek을 하거나 poll하거나 상관없다
        System.out.println(q.peek());
    }
}
