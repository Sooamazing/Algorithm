package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-12-13 10min
// https://www.acmicpc.net/problem/1598
public class ChainedNumberSequence {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int first = Integer.parseInt(st.nextToken()) - 1;
		int second = Integer.parseInt(st.nextToken()) - 1;

		int firstRow = first % 4;
		int secondRow = second % 4;

		int firstCol = first / 4;
		int secondCol = second / 4;

		int rowDistance = Math.abs(firstRow - secondRow);
		int colDistance = Math.abs(firstCol - secondCol);

		System.out.println(rowDistance + colDistance);
	}
}
