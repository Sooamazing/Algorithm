package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 25-02-05 30min
// https://www.acmicpc.net/problem/3986
// ABBAABAABA 1 - https://www.acmicpc.net/board/view/105028
public class GoodWord {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());

		int count = 0;
		while (total-- > 0) {
			String word = br.readLine();
			Stack<Character> stack = new Stack<>();
			int length = word.length();
			if (length % 2 != 0) {
				// 홀수면 좋은 단어가 아님
				continue;
			}

			for (int i = length - 1; i >= 0; i--) {
				char current = word.charAt(i);
				if (!stack.isEmpty() && stack.peek() == current) {
					// stack의 상단 char와 지금 char가 같으면 한 쌍.
					stack.pop();
					continue;
				}
				stack.push(current);
			}

			if (stack.isEmpty()) {
				count++;
			}
		}

		System.out.println(count);
	}
}
