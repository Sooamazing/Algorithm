package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-01-14 10min
// https://www.acmicpc.net/problem/1284
public class HomeAddress {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String unitNumber = "-1";
		while (true) {
			unitNumber = br.readLine();
			if (unitNumber.equals("0")) {
				break;
			}
			int count = 1; // 왼쪽 시작
			int length = unitNumber.length();
			for (int i = 0; i < length; i++) {
				int cur = unitNumber.charAt(i) - '0';

				// 숫자가 차지하는 나무판
				if (cur == 1) {
					count += 2;
				} else if (cur == 0) {
					count += 4;
				} else {
					count += 3;
				}

				count += 1; // 사이 여백
			}

			sb.append(count).append('\n');

		}

		System.out.println(sb);
	}
}
