package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 반례: 41, 42, 43, 44, 45, 95
// 24-07-31 20:50
// https://www.acmicpc.net/problem/19940
public class PizzaOven {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCase = Integer.parseInt(br.readLine());

		int[] buttons;
		// ADDH, ADDT, MINT, ADDO, MINO 순서
		while (testCase-- > 0) {

			int goalTime = Integer.parseInt(br.readLine());
			buttons = new int[5];

			buttons[0] = goalTime / 60;
			goalTime %= 60;
			if (goalTime >= 40) { // 순서 우선 순위 때문에, 30대는 10분씩 더하는 걸 우선.
				// 60분을 더하고, 차를 빼야 함.
				buttons[0]++;
				goalTime = -(goalTime) + 60;
				buttons[2] = goalTime / 10;
				goalTime %= 10;
				if (goalTime > 5) {
					buttons[2]++;
					buttons[3] = 10 - goalTime;
				} else {
					buttons[4] = goalTime;
				}

			} else {
				// 그대로 10분 더하기 돌입.
				buttons[1] = goalTime / 10;
				goalTime %= 10;
				if (goalTime > 5) {
					buttons[1]++;
					goalTime = -(goalTime) + 10;
					buttons[4] = goalTime;
				} else {
					buttons[3] = goalTime;
				}

			}
			for (int v : buttons) {
				sb.append(v).append(" ");
			}
			sb.append("\n");

			// copilot
			// int time = Integer.parseInt(br.readLine());
			// int hour = time / 60;
			// int min = time % 60;
			//
			// if (time < 60) {
			// 	System.out.println("0 " + time);
			// } else if (time < 120) {
			// 	System.out.println("1 " + min);
			// } else if (time < 180) {
			// 	System.out.println("2 " + min);
			// } else if (time < 240) {
			// 	System.out.println("3 " + min);
			// } else {
			// 	int hourCount = hour / 4;
			// 	int minCount = min / 10;
			// 	int remainHour = hour % 4;
			// 	int remainMin = min % 10;
			//
			// 	if (remainMin == 0) {
			// 		System.out.println(hourCount + " " + minCount);
			// 	} else {
			// 		System.out.println(hourCount + " " + minCount + 1);
			// 	}
			// }
		}

		System.out.println(sb);

	}
}
