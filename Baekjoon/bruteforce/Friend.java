package Baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 25-04-23 30min
// https://www.acmicpc.net/problem/1058
public class Friend {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());

		boolean[][] relationship = new boolean[total][total];
		boolean[][] is2Friend = new boolean[total][total];
		for (int i = 0; i < total; i++) {
			String string = br.readLine();
			for (int j = 0; j < total; j++) {
				char c = string.charAt(j);
				if (c == 'Y') {
					relationship[i][j] = true;
				}
			}
		}

		for (int i = 0; i < total; i++) {
			Queue<Integer> que = new LinkedList<>();
			for (int j = 0; j < total; j++) {
				if (relationship[i][j]) {
					is2Friend[i][j] = true;
					que.add(j);
				}
			}

			while (!que.isEmpty()) {
				int friend = que.poll();
				for (int j = 0; j < total; j++) {
					if (relationship[friend][j] && i != j) {
						is2Friend[i][j] = true;
					}
				}
			}
		}

		int maxResult = 0;
		for (int i = 0; i < total; i++) {
			int sum = 0;
			for (int j = 0; j < total; j++) {
				if (is2Friend[i][j]) {
					sum++;
				}
			}
			maxResult = Math.max(maxResult, sum);
		}

		System.out.println(maxResult);

	}
}
