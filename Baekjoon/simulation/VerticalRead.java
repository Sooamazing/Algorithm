package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-09-04 15min
// https://www.acmicpc.net/problem/10798
public class VerticalRead {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] strs = new String[5];
		for (int i = 0; i < 5; i++) {
			strs[i] = br.readLine();
		}

		char[][] arr = new char[5][15];
		for (int i = 0; i < 5; i++) {
			arr[i] = strs[i].toCharArray();
		}
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (arr[j].length <= i) {
					continue;
				}
				sb.append(arr[j][i]);
			}
		}
		System.out.println(sb);
	}
}
