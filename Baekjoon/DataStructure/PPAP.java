package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 24-07-06 15min
// https://www.acmicpc.net/problem/16120
public class PPAP {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		Stack<Character> leftStk = new Stack<>();
		Stack<Character> rightStk = new Stack<>();
		for (int i = str.length() - 1; i >= 0; i--) {
			rightStk.push(str.charAt(i));
		}

		char[] ppap = new char[] {'P', 'P', 'A', 'P'};
		int ppapIdx = 0;
		while (!rightStk.isEmpty()) {
			char rightPop = rightStk.pop();
			leftStk.push(rightPop); // left로 우선 적립.
			if (rightPop == ppap[ppapIdx]) {
				ppapIdx++;
			} else {
				// ppapIdx = 0;
			}
		}
		System.out.println();

	}
}
