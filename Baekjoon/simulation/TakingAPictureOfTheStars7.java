package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-11-10 20min
// https://www.acmicpc.net/problem/2444
//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *
public class TakingAPictureOfTheStars7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			sb.append(" ".repeat(n - i - 1)).append("*".repeat(2 * i + 1)).append("\n");
		}
		for (int i = n - 2; i >= 0; i--) {
			sb.append(" ".repeat(n - i - 1)).append("*".repeat(2 * i + 1)).append("\n");
		}

		System.out.println(sb);
	}
}
