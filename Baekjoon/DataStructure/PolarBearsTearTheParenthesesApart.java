package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 24-08-15 15min
// https://www.acmicpc.net/problem/25918
public class PolarBearsTearTheParenthesesApart {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		String strings = br.readLine();
		Stack<Character> stack = new Stack<>();

		int ans = 0;
		int stackSize = 0;
		for (int i = length - 1; i >= 0; i--) {
			char curChar = strings.charAt(i);
			// stack이 비어 있으면 넣고, stackSize++
			if (stack.isEmpty()) {
				stackSize++;
				stack.push(curChar);
			} else {
				// stack에 차 있다면, 현재 char와 같은지 확인 후, 같으면 stack에 넣고, 다르면 pop.
				if (stack.peek() == curChar) {
					stackSize++;
					stack.push(curChar);
				} else {
					stackSize--;
					stack.pop();
				}
			}
			// 답은 가장 큰 stack size.
			ans = Math.max(ans, stackSize);
		}

		// 마지막에 stack이 비어 있으면 ans, 뭔가 남아 있으면 -1 출력.
		System.out.println(stack.isEmpty() ? ans : -1);
	}
}