package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-09-24 10min
// https://www.acmicpc.net/problem/1009
public class DispersiveProcessing {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCaseNum = Integer.parseInt(br.readLine());
		StringTokenizer st;
		while (testCaseNum-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int result = 1;
			for (int i = 0; i < b; i++) {
				result = (result * a) % 10;
				if (result == 0) {
					result = 10;
					break;
				}
			}
			sb.append(result).append("\n");
		}

		System.out.println(sb);

	}
}
