package Baekjoon.parsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-10-03 40min
// https://www.acmicpc.net/problem/17214
// 반례: https://www.acmicpc.net/board/view/39803 - 0 등
// 반례: https://www.acmicpc.net/board/view/150557 - 10
public class IntegrationOfPolynomialFunction {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String expression = br.readLine();
		int length = expression.length();

		// 0인 경우
		if (expression.equals("0")) {
			System.out.println("W");
			return;
		}

		int coefficient = 0;
		for (int i = 0; i < length; i++) {
			char c = expression.charAt(i);
			// 연산자인 경우
			if (c == '+' || c == '-') {
				sb.append(c);
			} else {
				// 문자인 경우
				if (c == 'x') {
					if (coefficient == 2) {
						sb.append("xx");
					} else {
						sb.append(coefficient / 2).append("xx");
					}
					coefficient = 0; // 계수 초기화
				} else {
					// 숫자인 경우 계수 계산
					coefficient = coefficient * 10 + c - '0';
				}
			}
		}

		// 0으로 끝나는 경우
		if (expression.charAt(length - 1) == '0' && coefficient == 0) {
			sb.deleteCharAt(sb.length() - 1);
		} else if (expression.charAt(length - 1) != 'x') {
			// 0 제외 숫자로 끝나는 경우
			sb.append(coefficient == 1 ? "" : coefficient).append("x");
		}

		sb.append("+W");

		System.out.println(sb);
	}
}
