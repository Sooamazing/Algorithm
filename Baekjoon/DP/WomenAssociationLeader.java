package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-03-11 10min
// https://www.acmicpc.net/problem/2775
public class WomenAssociationLeader {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int test = Integer.parseInt(br.readLine());
		int[][] apartment = new int[14 + 1][14 + 1];
		for (int i = 1; i <= 14; i++) {
			apartment[0][i] = i; // 0층에는 각 호에 i만큼의 수가 살고 있다.
		}
		for (int i = 1; i <= 14; i++) {
			for (int j = 1; j <= 14; j++) {
				apartment[i][j] = apartment[i][j - 1] + apartment[i - 1][j];
			}
		}
		while (test-- > 0) {
			int floor = Integer.parseInt(br.readLine());
			int room = Integer.parseInt(br.readLine());
			sb.append(apartment[floor][room]).append("\n");
		}

		System.out.println(sb);

	}
}
