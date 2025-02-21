package Baekjoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 25-02-21 10min
// https://www.acmicpc.net/problem/14469
public class WhyCowCrossedRoad3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cows = Integer.parseInt(br.readLine());
		PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> {
			if (o1[0] == o2[0]) {
				return o1[1] - o2[1];
			}
			// 빨리 도착한 순서대로
			return o1[0] - o2[0];
		});

		StringTokenizer st;
		for (int i = 0; i < cows; i++) {
			st = new StringTokenizer(br.readLine());
			pq.add(new int[] {
				Integer.parseInt(st.nextToken()), // 도착 시각
				Integer.parseInt(st.nextToken()), // 검문에 걸리는 시간
			});
		}

		int time = 0;
		while (!pq.isEmpty()) {
			int[] poll = pq.poll();
			int arrivedTime = poll[0];
			int duration = poll[1];

			// 현재 시각이 지금 소의 도착 시각보다 빠른 경우, 현재 시각에 그만큼 더하기
			if (time < arrivedTime) {
				time = arrivedTime + duration;
			} else {
				time += duration;
			}
		}

		System.out.println(time);

	}
}
