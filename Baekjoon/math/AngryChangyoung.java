package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-07-10 10min
// https://www.acmicpc.net/problem/3034
public class AngryChangyoung {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());
        int diagonal = (int) Math.sqrt(
                Math.pow(width, 2) + Math.pow(height, 2)
        );
        for (int i = 0; i < total; i++) {
            int currentMatch = Integer.parseInt(br.readLine());
            if (currentMatch <= width || currentMatch <= height || currentMatch <= diagonal) {
                sb.append("DA\n");
                continue;
            }
            sb.append("NE\n");
        }

        System.out.println(sb);
    }
}
