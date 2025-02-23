package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-02-23 10min
// https://www.acmicpc.net/problem/13413
public class OthelloRearrangement {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCase = Integer.parseInt(br.readLine());
		while (testCase-- > 0) {
			int result = 0;
			int white = 0;
			int black = 0;
			int length = Integer.parseInt(br.readLine());
			String origin = br.readLine();
			String goal = br.readLine();
			for (int i = 0; i < length; i++) {
				char originStatus = origin.charAt(i);
				char goalStatus = goal.charAt(i);
				// 상태가 같으면 바꿀 필요 없음
				if (originStatus == goalStatus) {
					continue;
				}
				// 바꿔야 하는 상태 확인
				if (originStatus == 'W') {
					white++;
				} else {
					black++;
				}
				// 짝이 있으면 바꿈
				// 1. 배치된 말 중 임의의 2개의 말을 골라 서로의 위치를 바꾼다.
				if (white > 0 && black > 0) {
					white--;
					black--;
					result++;
				}
			}

			// 하나만 남은 것도 더함.
			// 2. 말 1개를 들어 뒤집어 놓아 색상을 변경한다.
			result += (white + black);
			sb.append(result + "\n");

		}

		System.out.println(sb);
	}
}
