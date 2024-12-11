package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 24-12-11 22:25
// https://www.acmicpc.net/problem/17608
public class Pole {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		int result = 0;

		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < total; i++) {
			int cur = Integer.parseInt(br.readLine());
			while (!stack.isEmpty() && stack.peek() <= cur) {
				stack.pop();
			}
			if (stack.isEmpty() || stack.peek() > cur) {
				stack.push(cur);
			}
		}
		result = stack.size();

		// int[] arr = new int[total];
		// for (int i = 0; i < total; i++) {
		// 	arr[i] = Integer.parseInt(br.readLine());
		// }
		//
		// int max = 0;
		// for (int i = total - 1; i >= 0; i--) {
		// 	if (max < arr[i]) {
		// 		max = arr[i];
		// 		result++;
		// 	}
		// }

		System.out.println(result);

	}
}
