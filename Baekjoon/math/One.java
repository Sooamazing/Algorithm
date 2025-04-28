package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-04-28
// https://www.acmicpc.net/problem/4375
// 참고: https://nahwasa.com/entry/%EC%9E%90%EB%B0%94-%EB%B0%B1%EC%A4%80-4375-1-java
public class One {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String numberString; // <= 10_000
		while ((numberString = br.readLine()) != null) {
			int number = Integer.parseInt(numberString);
			long prev = 1;
			int length = 1;
			while (true) {
				if (prev % number == 0) {
					sb.append(length).append("\n");
					break;
				}
				length++;
				prev = (prev * 10 + 1) % number;
			}
		}

		System.out.println(sb);
	}

	// prev+=10, 매번 마지막 자리 1, 3, 7, 9 비교
	private static boolean checkAndAppendToSb(int currentStandard, int sum, int lastDigit, StringBuilder sb) {
		String result = getResult(currentStandard, sum, lastDigit);
		if (checkOneOnly(result)) {
			int length = result.length();
			sb.append(length).append("\n");
			return true;
		}
		return false;
	}

	private static boolean checkOneOnly(String result) {
		return result.replace("1", "").isEmpty();
	}

	private static String getResult(int currentStandard, int sum, int lastDigit) {
		return String.valueOf((long)currentStandard * (sum + lastDigit));
	}
}
