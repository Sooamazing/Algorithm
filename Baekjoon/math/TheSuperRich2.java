package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

// 24-11-26 5min
// https://www.acmicpc.net/problem/1271
public class TheSuperRich2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger money = new BigInteger(st.nextToken());
		BigInteger people = new BigInteger(st.nextToken());

		sb.append(money.divide(people)).append("\n");
		sb.append(money.remainder(people));

		System.out.println(sb);

	}
}
