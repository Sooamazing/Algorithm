package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-05-13 5min
// https://www.acmicpc.net/problem/5554
public class OnOnesWayToAnErrand {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = 0;
		for (int i = 0; i < 4; i++) {
			total += Integer.parseInt(br.readLine());
		}

		System.out.println(
			(total / 60) + " " + (total % 60)
		);
	}
}
