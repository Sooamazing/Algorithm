package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-12-26 3min
// https://www.acmicpc.net/problem/13163
public class AddGodToNickname {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int total = Integer.parseInt(br.readLine());
        while (total-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken(); // ignore
            sb.append("god");
            while (st.hasMoreTokens()) {
                sb.append(st.nextToken());
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}