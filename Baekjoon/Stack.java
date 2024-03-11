package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10828
public class Stack {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int cmdNum = Integer.parseInt(br.readLine());
		int[] stack = new int[cmdNum];
		int top = -1;

		for (int i = 0; i < cmdNum; i++) {
			String[] split = br.readLine().split(" ");
			String command = split[0];

			if (command.equals("push")) {
				stack[++top] = Integer.parseInt(split[1]);
			} else if (command.equals("pop")) {
				if (top == -1) {
					sb.append(-1).append("\n");
				} else {
					sb.append(stack[top--]).append("\n");
				}
			} else if (command.equals("size")) {
				sb.append(top + 1).append("\n");
			} else if (command.equals("empty")) {
				if (top == -1) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
			} else if (command.equals("top")) {
				if (top == -1) {
					sb.append(-1).append("\n");
				} else {
					sb.append(stack[top]).append("\n");
				}
			}
		}

		System.out.println(sb);

	}
}
