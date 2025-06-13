package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-06-13 3min
// https://www.acmicpc.net/problem/19698
public class BarnSubscription {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int total = Integer.parseInt(st.nextToken());
		int width = Integer.parseInt(st.nextToken());
		int height = Integer.parseInt(st.nextToken());
		int cow = Integer.parseInt(st.nextToken());

		int max = (width / cow) * (height / cow);
		System.out.println(Math.min(max, total));
	}
}
