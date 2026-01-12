package Baekjoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

// 26-01-12 10min
// https://www.acmicpc.net/problem/14729
public class SevenNoAnswer {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int total = Integer.parseInt(br.readLine());
        PriorityQueue<Double> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < total; i++) {
            pq.add(Double.parseDouble(br.readLine()));
            if (pq.size() <= 7) {
                continue;
            }
            pq.poll();
        }

        while (!pq.isEmpty()) {
            sb.insert(0, String.format("%.3f\n", pq.poll()));
        }

        System.out.println(sb);
    }
}