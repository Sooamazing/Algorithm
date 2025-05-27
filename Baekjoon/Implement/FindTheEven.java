package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-05-27 5min
// https://www.acmicpc.net/problem/3058
public class FindTheEven {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int total = Integer.parseInt(br.readLine());
		while (total-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int minEven = 100;
			int evenSum = 0;
			for (int i = 0; i < 7; i++) {
				int number = Integer.parseInt(st.nextToken());
				if (number % 2 == 0) {
					evenSum += number;
					minEven = Math.min(minEven, number);
				}
			}
			sb.append(evenSum).append(" ").append(minEven).append("\n");
		}

		System.out.println(sb);
	}
}
