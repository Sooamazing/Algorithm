package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SortInside {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		PriorityQueue<String> pq = new PriorityQueue<>(Comparator.reverseOrder());
		String[] split = br.readLine().split("");

		for (int i = 0; i < split.length; i++) {
			pq.add(split[i]);
		}

		while (!pq.isEmpty()) {
			sb.append(pq.poll());
		}

		System.out.println(sb);

	}
}
