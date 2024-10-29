package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-10-29 10min
// https://www.acmicpc.net/problem/10811
public class FlippingTheBasket {
	static int[] basket;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int total = Integer.parseInt(st.nextToken());
		int rows = Integer.parseInt(st.nextToken());
		basket = new int[total + 1];
		for (int i = 1; i < total + 1; i++) {
			basket[i] = i;
		}

		while (rows-- > 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for (int i = 0; i < (y - x + 1) / 2; i++) {
				swap(x + i, y - i);
			}
		}

		for (int i = 1; i < total + 1; i++) {
			sb.append(basket[i]).append(" ");
		}

		System.out.println(sb);

	}

	static void swap(int x, int y) {
		int temp = basket[x];
		basket[x] = basket[y];
		basket[y] = temp;
	}
}
