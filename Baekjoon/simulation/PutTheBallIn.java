package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-11-18 5min
// https://www.acmicpc.net/problem/10810
public class PutTheBallIn {

	public static void main(String[] args) throws IOException {

		// your code goes here

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());

		int size = Integer.parseInt(st.nextToken());

		int rows = Integer.parseInt(st.nextToken());

		int[] baskets = new int[size];

		for (int i = 0; i < rows; i++) {

			st = new StringTokenizer(br.readLine());

			int start = Integer.parseInt(st.nextToken()) - 1;

			int end = Integer.parseInt(st.nextToken());

			int ball = Integer.parseInt(st.nextToken());

			for (int j = start; j < end; j++) {

				baskets[j] = ball;

			}

		}

		for (int i = 0; i < size; i++) {

			sb.append(baskets[i]).append("\n");

		}

		System.out.println(sb);

	}
}
