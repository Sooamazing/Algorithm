package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-11-08 5min
// https://www.acmicpc.net/problem/2566
public class Maximum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = -1; // 0이 최대일 수 있음.
		int[] maxIndex = new int[2];

		StringTokenizer st;
		for (int i = 1; i <= 9; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= 9; j++) {
				int num = Integer.parseInt(st.nextToken());
				if (max < num) {
					maxIndex[0] = i;
					maxIndex[1] = j;
					max = num;
				}
			}
		}

		System.out.println(max + "\n" + maxIndex[0] + " " + maxIndex[1]);
	}
}
