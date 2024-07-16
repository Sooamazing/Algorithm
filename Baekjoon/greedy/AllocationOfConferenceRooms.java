package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-07-16 10min
// https://www.acmicpc.net/problem/1931
public class AllocationOfConferenceRooms {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
			if (a[1] == b[1]) {
				return a[0] - b[0];
			}
			return a[1] - b[1];
		});

		StringTokenizer st;
		for (int i = 0; i < size; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			pq.add(new int[] {start, end});
		}

		int ans = 0;
		int curTime = 0;
		while (!pq.isEmpty()) {
			int[] poll = pq.poll();
			int start = poll[0];
			int end = poll[1];
			// 시작하자마자 끝나는 경우 포함.
			if (curTime <= start) {
				curTime = end;
				ans++;
			}
		}

		System.out.println(ans);

	}
}
