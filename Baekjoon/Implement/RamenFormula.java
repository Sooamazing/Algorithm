package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-12-14 47
// https://www.acmicpc.net/problem/30007
public class RamenFormula {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int total = Integer.parseInt(br.readLine());
        while (total-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int ramen = Integer.parseInt(st.nextToken());
            int water = Integer.parseInt(st.nextToken());
            int ramenNumber = Integer.parseInt(st.nextToken());

            sb.append(ramen * (ramenNumber - 1) + water).append("\n");
        }
        System.out.println(sb);
    }
}