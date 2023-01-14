package Doit알고리즘코딩테스트.정렬;// @ author ninaaano

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P2751_수정렬하기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        List<Integer> sortList = new ArrayList<>();

        for(int i = 0; i<n; i++){
            sortList.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(sortList);

        for(int i : sortList) {
            sb.append(i+"\n");
        }
        System.out.print(sb);
    }
}
