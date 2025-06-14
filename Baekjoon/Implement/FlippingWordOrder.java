package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-06-14 10min
// https://www.acmicpc.net/problem/12605
public class FlippingWordOrder {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int max = Integer.parseInt(br.readLine());
		for (int test = 1; test <= max; test++) {
			String[] words = br.readLine().split(" ");
			sb.append("Case #").append(test).append(": ");
			for (int i = words.length - 1; i >= 0; i--) {
				sb.append(words[i]).append(" ");
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}
}
