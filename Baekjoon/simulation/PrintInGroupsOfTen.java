package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-12-16 5min
// https://www.acmicpc.net/problem/11721
public class PrintInGroupsOfTen {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str = br.readLine();
		for (int i = 0; i < str.length(); i++) {
			sb.append(str.charAt(i));
			if (i % 10 == 9) {
				sb.append("\n");
			}
		}

		System.out.println(sb);

	}
}
