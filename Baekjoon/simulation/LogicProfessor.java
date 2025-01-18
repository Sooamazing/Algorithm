package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-01-18 10min
// https://www.acmicpc.net/problem/1813
public class LogicProfessor {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		int[] states = new int[50 + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < total; i++) {
			states[Integer.parseInt(st.nextToken())]++;
		}

		int result = 0;
		for (int i = 1; i < 50 + 1; i++) {
			if (states[i] == i) {
				result = i;
			}
		}
		if (result == 0 && states[0] != 0) {
			// 0만 있을 때 모순
			result = -1;
		}

		System.out.println(result);
	}
}
