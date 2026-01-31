package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-01-31 5min
// https://www.acmicpc.net/problem/5176
public class PlaceOfCompetition {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int test = Integer.parseInt(br.readLine());
        while (test-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int people = Integer.parseInt(st.nextToken());
            int place = Integer.parseInt(st.nextToken());
            boolean[] places = new boolean[place + 1];

            int notTaken = 0;
            for (int i = 0; i < people; i++) {
                int preferred = Integer.parseInt(br.readLine());
                if (places[preferred]) {
                    notTaken++;
                    continue;
                }
                places[preferred] = true;
            }

            sb.append(notTaken).append('\n');
        }

        System.out.println(sb);
    }
}