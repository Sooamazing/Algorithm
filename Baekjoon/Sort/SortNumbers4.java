package Baekjoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 25-02-17 2min
// https://www.acmicpc.net/problem/11931
public class SortNumbers4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int total = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
		for (int i = 0; i < total; i++) {
			pq.add(Integer.parseInt(br.readLine()));
		}

		while (!pq.isEmpty()) {
			sb.append(pq.poll()).append("\n");
		}

		System.out.println(sb);
	}
}
