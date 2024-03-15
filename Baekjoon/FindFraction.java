package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1193
public class FindFraction {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int input = Integer.parseInt(br.readLine());
		int sum = 0;
		int cnt = 1;
		while (input > sum) {
			sum = (cnt * (cnt + 1) / 2);
			cnt++;
		}

		int diff = sum - input;

		cnt--;
		System.out.println(
			cnt % 2 == 0 ?
				(cnt - diff) + "/" + (1 + diff)
				: (1 + diff) + "/" + (cnt - diff)
		);

	}
}
