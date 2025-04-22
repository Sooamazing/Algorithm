package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-04-22 5min
// https://www.acmicpc.net/problem/2920
public class Scale {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		boolean isAscending = true;
		for (int i = 1; i <= 8; i++) {
			int current = Integer.parseInt(st.nextToken());
			if (i == 1) {
				if (current == 8) {
					isAscending = false;
					continue;
				} else if (current != 1) {
					System.out.println("mixed");
					return;
				}
			}

			if (isAscending) {
				if (current != i) {
					System.out.println("mixed");
					return;
				}
			} else {
				if (current != (8 - i + 1)) {
					System.out.println("mixed");
					return;
				}
			}
		}

		System.out.println(isAscending ? "ascending" : "descending");

	}
}
