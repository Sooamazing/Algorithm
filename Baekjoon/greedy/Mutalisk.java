package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-07-08 35min
// https://www.acmicpc.net/problem/12869
public class Mutalisk {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int mutalNum = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < mutalNum; i++) {
			pq.add(Integer.parseInt(st.nextToken()));
		}

		int ans = 0;
		// 3개 이상일 때까지 반복
		while (pq.size() >= 3) {
			ans++;
			int a = pq.poll();
			int b = pq.poll();
			int c = pq.poll();

			if (a - 9 > 0)
				pq.add(a - 9);
			if (b - 3 > 0)
				pq.add(b - 3);
			if (c - 1 > 0)
				pq.add(c - 1);
		}

		// SCV가 2개인 경우
		while (pq.size() == 2) {
			ans++;
			int a = pq.poll();
			int b = pq.poll();

			if (a - 9 > 0)
				pq.add(a - 9);
			if (b - 3 > 0)
				pq.add(b - 3);
		}

		// SCV가 1개인 경우
		while (pq.size() == 1) {
			ans++;
			int a = pq.poll();

			if (a - 9 > 0)
				pq.add(a - 9);
		}

		System.out.println(ans);

	}
}
