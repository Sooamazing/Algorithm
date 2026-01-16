package Baekjoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 26-01-16 3min
// https://www.acmicpc.net/problem/16212
public class PassionateSort {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int total = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < total; i++) {
            pq.add(Integer.parseInt(st.nextToken()));
        }

        while (!pq.isEmpty()) {
            sb.append(pq.poll()).append(' ');
        }

        System.out.println(sb);
    }
}