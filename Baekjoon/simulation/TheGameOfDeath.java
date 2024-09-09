package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-09-09 15min
// https://www.acmicpc.net/problem/17204
public class TheGameOfDeath {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int total = Integer.parseInt(st.nextToken());
		int goal = Integer.parseInt(st.nextToken());
		int[] arr = new int[total];
		boolean[] visited = new boolean[total + 1];
		for (int i = 0; i < total; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int ans = 0;
		boolean flag = false;
		int idx = 0;
		for (int i = 0; i < total; i++) {
			// 방문한 경우 무한 루프
			if (visited[idx]) {
				break;
			}
			// 목표에 도달한 경우
			if (idx == goal) {
				flag = true;
				break;
			}
			visited[idx] = true; // 방문 처리
			idx = arr[idx]; // 다음 인덱스로 이동
			ans++;
		}
		System.out.println(flag ? ans : -1);
	}
}
