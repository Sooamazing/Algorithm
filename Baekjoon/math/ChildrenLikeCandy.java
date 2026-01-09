package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-01-09 5min
// https://www.acmicpc.net/problem/9550
public class ChildrenLikeCandy {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int test = Integer.parseInt(br.readLine());
        while (test-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int candy = Integer.parseInt(st.nextToken());
            int min = Integer.parseInt(st.nextToken());

            int student = 0;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < candy; i++) {
                student += (Integer.parseInt(st.nextToken()) / min);
            }
            sb.append(student).append("\n");
        }

        System.out.println(sb);
    }
}