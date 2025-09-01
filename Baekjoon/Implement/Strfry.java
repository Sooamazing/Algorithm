package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-09-01 10min
// https://www.acmicpc.net/problem/11328
// 참고: 길이가 다를 때 https://ideone.com/acn8GX
public class Strfry {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int total = Integer.parseInt(br.readLine());
        for (int i = 0; i < total; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String before = st.nextToken();
            String after = st.nextToken();

            if (before.length() != after.length()) {
                sb.append("Impossible\n");
                continue;
            }

            for (char c : before.toCharArray()) {
                after = after.replaceFirst(String.valueOf(c), "");
            }

            if (after.isEmpty()) {
                sb.append("Possible\n");
                continue;
            }
            sb.append("Impossible\n");
        }

        System.out.println(sb);
    }
}