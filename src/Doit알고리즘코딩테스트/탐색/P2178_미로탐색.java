package Doit알고리즘코딩테스트.탐색;// @ author ninaaano

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2178_미로탐색 {
    static int[][] arr;
    static boolean[][] visited;
    static int n,m;
    static int[] dx = {-1,1,0,0}; // x방항배열 - 상하
    static int[] dy = {0,0,-1,1}; // y방향배열 - 좌우
    static Queue<int[]> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 시작
        m = Integer.parseInt(st.nextToken()); // 끝

        arr = new int[n][m];

        for(int i=0; i<n; i++){
            String input = br.readLine();
            for(int j=0; j<m; j++){
                arr[i][j] = input.charAt(j) - '0';
            }
        }

        visited = new boolean[n][m];
        visited[0][0] = true;
        bfs(0,0);
        // 도착 지점에서의 수
        System.out.println(arr[n-1][m-1]);


        // 배열 확인용
//        for(int[] i:arr){
//            System.out.println(Arrays.toString(i));
//        }


    }

    private static void bfs(int x, int y) {
        queue = new LinkedList<>();
        queue.add(new int[] {x,y});

        while (!queue.isEmpty()){
           int now[] = queue.poll();
           int nowX = now[0];
           int nowY = now[1];

            for(int i = 0; i<4; i++){
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                // nextX가 0보다 작거나 n보다 크거나 nextY가 0보다 작거나 m보다 크면 건너뛴다
                if(nextX < 0 || nextY < 0 || nextX >= n || nextY >= m){
                    continue;
                }

                // 방문했거나 값이 0이면 건너뛴다
                if(visited[nextX][nextY] || arr[nextX][nextY] == 0) {
                    continue;
                }

                // 위 if문에서 걸리면 이것도 실행되지 않는다. 여기서 add해주면 위 now[] 에서 poll로 꺼낸다
                queue.add(new int[] {nextX,nextY});
                // 지나간 자리 카운트
                arr[nextX][nextY] = arr[nowX][nowY] + 1;
                visited[nextX][nextY] = true;
            }
        }

    }
}
