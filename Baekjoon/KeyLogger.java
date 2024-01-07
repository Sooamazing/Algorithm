// https://www.acmicpc.net/problem/5397
package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class KeyLogger {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			String[] split = br.readLine().split("");
			Stack<String> left = new Stack<>();
			Stack<String> right = new Stack<>();

			for (int i = 0; i < split.length; i++) {
				String cur = split[i];
				if (cur.equals("<")) {
					if (!left.isEmpty()) {
						right.push(left.pop());
					}
				} else if (cur.equals(">")) {
					if (!right.isEmpty()) {
						left.push(right.pop());
					}
				} else if (cur.equals("-")) {
					if (!left.isEmpty()) {
						left.pop();
					}
				} else {
					left.push(cur);
				}
			}
			while (!left.isEmpty()) {
				right.push(left.pop());
			}
			while (!right.isEmpty()) {
				sb.append(right.pop());
			}

			sb.append('\n');
		}
		System.out.println(sb);
	}
}