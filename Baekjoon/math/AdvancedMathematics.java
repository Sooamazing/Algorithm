package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 25-07-22 5min
// https://www.acmicpc.net/problem/7510
public class AdvancedMathematics {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int total = Integer.parseInt(br.readLine());
        for (int i = 1; i <= total; i++) {
            sb.append("Scenario #").append(i).append(":\n");

            StringTokenizer st = new StringTokenizer(br.readLine());
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            pq.add(Integer.parseInt(st.nextToken()));
            pq.add(Integer.parseInt(st.nextToken()));
            pq.add(Integer.parseInt(st.nextToken()));

            double first = Math.pow(pq.poll(), 2);
            double second = Math.pow(pq.poll(), 2);
            double third = Math.pow(pq.poll(), 2);
            if (first + second == third) {
                sb.append("yes\n\n");
                continue;
            }

            sb.append("no\n\n");
        }

        System.out.println(sb);
    }
}