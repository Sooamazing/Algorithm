package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10162
public class Microwaves {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int timeT = Integer.parseInt(br.readLine());

		if (timeT % 10 != 0) {
			System.out.println(-1);
			return;
		}

		int min5 = 300;
		int min1 = 60;
		int sec10 = 10;

		int count5 = timeT / min5;
		timeT %= min5;
		int count1 = timeT / min1;
		timeT %= min1;
		int count10 = timeT / sec10;

		System.out.println(count5 + " " + count1 + " " + count10);

	}
}
