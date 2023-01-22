package Doit알고리즘코딩테스트.탐색;// @ author ninaaano

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 두 점 사이중 가장 긴 것 찾기
 * BFS 이용
 */
public class P1167_트리의지름 {

    static ArrayList<Node>[] list; // 노드형 배열리스트
    static boolean[] visited; // 방문배열
    static int max = 0; // 최댓값
    static int node;

    public static class Node{
        int e; // 정점
        int cost; // 거리

        public Node(int e, int cost) {
            this.e = e;
            this.cost = cost;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        list = new ArrayList[n+1];
        for(int i=1; i<=n; i++){
            list[i] = new ArrayList<>();
        }

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            while(true){
                int e = Integer.parseInt(st.nextToken());
                if(e == -1) break;
                int cost = Integer.parseInt(st.nextToken());
                list[s].add(new Node(e,cost));
            }
        }

        // 임의의 노드 (1)에서 부터 가장 먼 노드를 찾고 node에 저장
        visited = new boolean[n+1];
        DFS(1,0);

        // node에서 부터 가장 먼 노드까지의 거리 구하기
        visited = new boolean[n+1];
        DFS(node, 0);

        System.out.println(max);
    }

    private static void DFS(int x, int len) {
        if(len>max){
            max = len;
            node = x;
        }
        visited[x] = true;

        for (int i = 0; i < list[x].size(); i++) {
            Node n = list[x].get(i);
            if(!visited[n.e]){
                DFS(n.e, n.cost + len);
                visited[n.e] = true;
            }
        }
    }
}
