package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 6
// 6 4 2 1 3 5
// 24-08-28 40min
// https://www.acmicpc.net/problem/12789
public class DockiDockySnackGiver {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int peopleNum = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<Integer> stk = new Stack<>();

		int curOrder = 1;
		for (int i = 0; i < peopleNum; i++) {
			int order = Integer.parseInt(st.nextToken());

			boolean isIn = false;
			if (curOrder == order) {
				curOrder++;
				isIn = true;
			}

			while (!stk.isEmpty() && curOrder == stk.peek()) {
				curOrder++;
				stk.pop();
			}
			if (!isIn) {
				stk.push(order);
			}
		}

		while (!stk.isEmpty()) {
			if (curOrder == stk.pop()) {
				curOrder++;
			} else {
				System.out.println("Sad");
				return;
			}
		}
		System.out.println("Nice");
	}
}
