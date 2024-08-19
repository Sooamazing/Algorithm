package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2
// 1 100000000
// 10000000 100000000
// 24-08-19 40min
// https://www.acmicpc.net/problem/31964
public class ReturnCollection {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int housesNum = Integer.parseInt(br.readLine());
		int[] houses = new int[housesNum + 1];
		int[] times = new int[housesNum + 1];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i < housesNum + 1; i++) {
			houses[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i < housesNum + 1; i++) {
			times[i] = Integer.parseInt(st.nextToken());
		}

		// 먼저 가장 마지막 집부터 시작
		long curTime = houses[housesNum];
		// 마지막 집의 반품 내놓는 시간 비교
		if (curTime < times[housesNum]) {
			curTime = times[housesNum];
		}
		for (int i = housesNum; i > 0; i--) {
			int goalTime = times[i - 1]; // 반품 내놓는 시간
			curTime += houses[i] - houses[i - 1]; // 이전 시간+거리
			if (curTime < goalTime) {
				curTime = goalTime;
			}
		}

		System.out.println(curTime);

	}
}
