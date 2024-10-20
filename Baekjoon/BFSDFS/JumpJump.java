package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//24-10-20 10min
// https://www.acmicpc.net/problem/14248
public class JumpJump {
	static int[] stone;
	static boolean[] visited;
	static int stoneNum;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		stoneNum = Integer.parseInt(br.readLine());
		stone = new int[stoneNum + 1];
		visited = new boolean[stoneNum + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= stoneNum; i++) {
			stone[i] = Integer.parseInt(st.nextToken());
		}
		int youngwoo = Integer.parseInt(br.readLine());

		int result = jump(youngwoo);
		System.out.println(result);
	}

	static int jump(int idx) {
		int visit = 1; // 초기값 설정 주의, 0 X
		if (visited[idx]) {
			return 0;
		}
		visited[idx] = true;
		if (idx + stone[idx] <= stoneNum) {
			// 오른쪽으로 점프
			visit += jump(idx + stone[idx]);
		}
		if (idx - stone[idx] > 0) {
			// 왼쪽으로 점프
			visit += jump(idx - stone[idx]);
		}
		return visit;
	}
}
