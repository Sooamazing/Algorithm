package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class SkylineEasy {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		Stack<Integer> firstStack = new Stack<>();
		Stack<Integer> tempStack = new Stack<>();
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			firstStack.push(y);
		}

		int prev = 0;
		while (!firstStack.isEmpty()) {
			int cur = firstStack.pop();
			if (cur > prev) {
				tempStack.push(cur);
			}
			if (cur < prev) {
				cnt++;
				while (!tempStack.isEmpty()) {
					prev = tempStack.pop();
				}
			}
			prev = cur;
		}
		if (!tempStack.isEmpty()) {
			cnt += tempStack.size();
		}

		System.out.println(cnt);
	}
}
