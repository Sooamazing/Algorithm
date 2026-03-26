package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-03-26 5min
// https://www.acmicpc.net/problem/10865
public class FriendFriend {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(st.nextToken());
        int relation = Integer.parseInt(st.nextToken());

        int[] friends = new int[total];
        for (int i = 0; i < relation; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            friends[a]++;
            friends[b]++;
        }

        for (int i = 0; i < total; i++) {
            sb.append(friends[i]).append('\n');
        }

        System.out.println(sb);
    }
}