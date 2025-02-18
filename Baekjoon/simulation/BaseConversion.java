package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-02-18 25min
// https://www.acmicpc.net/problem/11576
public class BaseConversion {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int beforeBase = Integer.parseInt(st.nextToken());
		int afterBase = Integer.parseInt(st.nextToken());

		int totalDigit = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int numberBase10 = 0;
		for (int i = 0; i < totalDigit; i++) {
			int number = Integer.parseInt(st.nextToken());
			numberBase10 += number *
				(int)Math.pow(beforeBase, totalDigit - 1 - i);
		}

		int numberBaseAfter = numberBase10;
		while (numberBaseAfter != 0) {
			sb.insert(0, " ");
			sb.insert(0, numberBaseAfter % afterBase);
			numberBaseAfter /= afterBase;
		}

		System.out.println(sb);
	}
}
