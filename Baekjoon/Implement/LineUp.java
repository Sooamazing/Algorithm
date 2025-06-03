package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-06-03 5min
// https://www.acmicpc.net/problem/1681
public class LineUp {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int total = Integer.parseInt(st.nextToken());
		String exclude = st.nextToken();

		int result = 0;
		int count = 1;
		int number = 0;
		while (true) {
			String numberString = String.valueOf(++number);
			if (numberString.contains(exclude)) {
				continue;
			}
			if (count == total) {
				result = number;
				break;
			}
			count++;
		}

		System.out.println(result);
	}
}
