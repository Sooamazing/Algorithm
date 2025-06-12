package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-06-12 3min
// https://www.acmicpc.net/problem/10569
public class Polyhedron {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int total = Integer.parseInt(br.readLine());

		while (total-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			sb.append(
				2 - Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())
			).append("\n");
		}

		System.out.println(sb);
	}
}
