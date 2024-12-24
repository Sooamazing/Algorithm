package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-12-24 5min
// https://www.acmicpc.net/problem/10797
public class TenDayRotation {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int day = Integer.parseInt(br.readLine()) % 10;
		StringTokenizer st = new StringTokenizer(br.readLine());

		int count = 0;
		for (int i = 0; i < 5; i++) {
			if (Integer.parseInt(st.nextToken()) == day) {
				count++;
			}
		}

		System.out.println(count);
	}
}
