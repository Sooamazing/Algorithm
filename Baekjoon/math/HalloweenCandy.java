package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-06-17 5min
// https://www.acmicpc.net/problem/10178
public class HalloweenCandy {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int test = Integer.parseInt(br.readLine());
		while (test-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int candy = Integer.parseInt(st.nextToken());
			int people = Integer.parseInt(st.nextToken());

			sb.append("You get ")
				.append(candy / people)
				.append(" piece(s) and your dad gets ")
				.append(candy % people)
				.append(" piece(s).\n");
		}

		System.out.println(sb);
	}
}
