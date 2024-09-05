package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-09-06 20min
// https://www.acmicpc.net/problem/2346
public class BurstingBalloons {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int balloonsNum = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] balloons = new int[balloonsNum];
		for (int i = 0; i < balloonsNum; i++) {
			balloons[i] = Integer.parseInt(st.nextToken());
		}

		int idx = 0;
		sb.append("1 ");
		for (int cnt = 1; cnt < balloonsNum; cnt++) {
			int round = balloons[idx];
			balloons[idx] = 0;
			while (round != 0) {
				if (round > 0) {
					idx = (idx + 1) % balloonsNum;
					if (balloons[idx] != 0) {
						round--;
					}
				} else {
					idx = (idx - 1) < 0 ? balloonsNum - 1 : (idx - 1);
					if (balloons[idx] != 0) {
						round++;
					}
				}
			}
			sb.append(idx + 1).append(" ");
		}
		System.out.println(sb);
	}
}
