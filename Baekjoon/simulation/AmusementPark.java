package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-08-31 20min
// https://www.acmicpc.net/problem/2594
public class AmusementPark {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int operatorNum = Integer.parseInt(br.readLine());
		PriorityQueue<int[]> playTimes = new PriorityQueue<>(operatorNum, (a, b) -> {
			if (a[0] == b[0]) {
				return b[1] - a[1];
			}
			return a[0] - b[0];
		}); // 시작 시각이 빠른 것부터, 같다면 끝나는 시각이 늦은 것부터

		StringTokenizer st;
		for (int i = 0; i < operatorNum; i++) {
			st = new StringTokenizer(br.readLine());
			int time = Integer.parseInt(st.nextToken());
			int start = time / 100 * 60 + time % 100 - 10; // 시작 시각 10분 전까지는 만날 수 없음

			time = Integer.parseInt(st.nextToken());
			int end = time / 100 * 60 + time % 100 + 10; // 끝나는 시각 10분 후까지는 만날 수 없음

			playTimes.add(new int[] {start, end});

		}

		int prevEnd = 10 * 60;
		int max = 0;
		while (!playTimes.isEmpty()) {
			int[] cur = playTimes.poll();
			int start = cur[0];
			int end = cur[1];

			if (prevEnd >= start) {
				// 이전에 끝난 시각이 현재 시작 시각보다 늦다면
				prevEnd = Math.max(prevEnd, end);
			} else {
				// 이전에 끝난 시각이 현재 시작 시각보다 빠르다면
				max = Math.max(max, start - prevEnd);
				prevEnd = end;
			}
		}

		System.out.println(Math.max(max, 22 * 60 - prevEnd)); // 마지막 시각과 22시간 사이의 시간을 비교

	}
}
