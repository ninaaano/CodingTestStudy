package Doit알고리즘코딩테스트.그리디;// @ author ninaaano

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**
 * 그리디 알고리즘
 * 우선순위 큐(낮은 값부터 꺼내므로)
 */

public class P1715_카드정렬하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }
        int sum = 0;

        while(pq.size() > 1){
            int a = pq.poll();
            int b = pq.poll();
            sum += a+b;
            pq.add(a+b);
        }
        
        System.out.println(sum);
    }

}
