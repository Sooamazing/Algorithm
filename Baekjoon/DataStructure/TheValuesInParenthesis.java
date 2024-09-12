package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 24-05-30 30min
// https://www.acmicpc.net/problem/2504
public class TheValuesInParenthesis {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		Stack<Character> rightStack = new Stack<>();

		int sum = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			char curChar = str.charAt(i);
			if (rightStack.isEmpty()) {
				rightStack.push(curChar);
			} else {
				char rightCurChar = rightStack.peek();
				if (curChar == '[') {
					if (rightCurChar == ']') {
						rightStack.pop();
						// TODO sum 계산, 3점
						// 곱하기 혹은 더하기.
						// chatAt(i-1) == '(' || '['이면 *, 아니면 +
					} else {
						System.out.println(0);
						return;
					}
				} else if (curChar == '(') {
					if (rightCurChar == ')') {
						rightStack.pop();
						// TODO sum 계산, 3점
						// 곱하기 혹은 더하기.
					} else {
						System.out.println(0);
						return;
					}
				} else {
					rightStack.push(curChar);
				}

			}

		}

	}
}
