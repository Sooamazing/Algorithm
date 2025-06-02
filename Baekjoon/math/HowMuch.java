package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-06-02 5min
// https://www.acmicpc.net/problem/9325
public class HowMuch {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int test = Integer.parseInt(br.readLine());
		while (test-- > 0) {
			int total = Integer.parseInt(br.readLine());
			int option = Integer.parseInt(br.readLine());
			for (int i = 0; i < option; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int number = Integer.parseInt(st.nextToken());
				int price = Integer.parseInt(st.nextToken());
				total += (number * price);
			}
			sb.append(total).append("\n");
		}

		System.out.println(sb);
	}
}
