package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-04-28 10min
// https://www.acmicpc.net/problem/15903
public class CardCoalescencePlay {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int numberNum = Integer.parseInt(st.nextToken());
		int coalescenceNum = Integer.parseInt(st.nextToken());
		PriorityQueue<Long> pq = new PriorityQueue<>();

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < numberNum; i++) {
			pq.add(Long.parseLong(st.nextToken()));
		}

		for (int i = 0; i < coalescenceNum; i++) {
			long a = pq.poll();
			long b = pq.poll();
			long c = a + b;
			pq.add(c);
			pq.add(c);
		}

		long sum = 0;
		while (!pq.isEmpty()) {
			sum += pq.poll();
		}

		System.out.println(sum);

	}
}
