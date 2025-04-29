package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-04-29 5min
// https://www.acmicpc.net/problem/2914
public class Copyright {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int total = Integer.parseInt(st.nextToken());
		int average = Integer.parseInt(st.nextToken());

		int result = (average - 1) * total + 1;

		System.out.println(result);
	}
}
