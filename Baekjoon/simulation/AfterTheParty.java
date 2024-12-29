package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-12-29 3min
// https://www.acmicpc.net/problem/2845
public class AfterTheParty {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int people = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			sb.append(Integer.parseInt(st.nextToken()) - people).append(" ");
		}

		System.out.println(sb);
	}
}
