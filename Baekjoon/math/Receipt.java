package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-10-24 10min
// https://www.acmicpc.net/problem/25304
public class Receipt {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;

		int totalPrice = Integer.parseInt(br.readLine());

		int totalItem = Integer.parseInt(br.readLine());

		for (int i = 0; i < totalItem; i++) {

			st = new StringTokenizer(br.readLine());

			int price = Integer.parseInt(st.nextToken());

			int itemNum = Integer.parseInt(st.nextToken());

			totalPrice -= (price * itemNum);

		}

		System.out.println(totalPrice == 0 ? "Yes" : "No");

	}
}
