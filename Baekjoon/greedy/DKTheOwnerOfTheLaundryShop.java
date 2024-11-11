package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-11-11 10min
// https://www.acmicpc.net/problem/2720
public class DKTheOwnerOfTheLaundryShop {
	public static void main(String[] args) throws IOException {
		// your code goes here

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		int testCaseNum = Integer.parseInt(br.readLine());

		int[] coins = new int[4];

		while (testCaseNum-- > 0) {

			int money = Integer.parseInt(br.readLine());

			coins[0] = money / 25;

			money %= 25;

			coins[1] = money / 10;

			money %= 10;

			coins[2] = money / 5;

			money %= 5;

			coins[3] = money;

			for (int v : coins) {

				sb.append(v).append(" ");

			}

			sb.append("\n");

		}

		System.out.println(sb);

	}
}
