package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-12-25 5min
// https://www.acmicpc.net/problem/4589
public class GnomeSequencing {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        sb.append("Gnomes:\n");

        int total = Integer.parseInt(br.readLine());
        while (total-- > 0) {
            boolean isOrdered = true;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());
            int three = Integer.parseInt(st.nextToken());

            if (!(one <= two && two <= three) && !(one >= two && two >= three)) {
                isOrdered = false;
            }

            sb.append(isOrdered ? "Ordered" : "Unordered").append("\n");
        }

        System.out.println(sb);
    }
}