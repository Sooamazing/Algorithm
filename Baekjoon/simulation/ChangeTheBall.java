package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-11-19 5min
// https://www.acmicpc.net/problem/10813
public class ChangeTheBall {

	static int[] basket;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int ballNum = Integer.parseInt(st.nextToken());
		int swapNum = Integer.parseInt(st.nextToken());
		basket = new int[ballNum];

		for (int i = 0; i < ballNum; i++) {
			basket[i] = i + 1;
		}

		for (int i = 0; i < swapNum; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1;
			int b = Integer.parseInt(st.nextToken()) - 1;
			swap(a, b);
		}

		for (int i = 0; i < ballNum; i++) {
			sb.append(basket[i]).append(" ");
		}

		System.out.println(sb);
	}

	public static void swap(int a, int b) {
		int temp = basket[a];
		basket[a] = basket[b];
		basket[b] = temp;
	}
}
