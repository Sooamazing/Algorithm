package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 24-05-03 10min
// https://www.acmicpc.net/problem/1715
public class SortTheCards {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());

		// 1개인 경우는 비교하지 않음!!
		if (size < 2) {
			System.out.println(0);
			return;
		}

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i < size; i++) {
			pq.add(Integer.parseInt(br.readLine()));
		}

		int minResult = 0;
		int lastSum = 0;
		while (pq.size() > 1) {
			int a = pq.poll();
			int b = pq.poll();
			int sum = a + b;

			minResult += sum;
			pq.add(sum);
			lastSum = sum;
		}

		minResult += pq.poll();
		minResult -= lastSum;

		System.out.println(minResult);

	}
}
