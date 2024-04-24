package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 24-04-24 40min
// https://www.acmicpc.net/problem/1863
public class SkyLineEasy {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());

		// PriorityQueue<Integer> pq = new PriorityQueue<>();
		Stack<Integer> stack = new Stack<>();
		int result = 0;

		// 기준 0 삽입
		stack.push(0);

		for (int i = 0; i < size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int width = Integer.parseInt(st.nextToken());
			int curHeight = Integer.parseInt(st.nextToken());

			if (!stack.isEmpty()) {
				int peek = stack.peek();
				if (peek < curHeight) {
					// 현재 높이가 이전 건물보다 크면 추가
					stack.push(curHeight);
				} else if (peek > curHeight) {

					// 현재 높이가 이전 건물보다 작으면 커질 때까지 빠져 나옴, 건물 개수 ++
					while (!stack.isEmpty()
						&& stack.peek() > curHeight) {
						stack.pop();
						result++;
					}

					// stack이 비어 있지 않고, 이전 높이가 현재 높이보다 작다면 추가
					if (stack.peek() < curHeight) {
						stack.push(curHeight);
					}
				}
				// 같으면 아무 것도 안 함.

			} else {
				// stack이 비어 있으면
				stack.push(curHeight);
			}

		}

		while (!stack.isEmpty()) {
			stack.pop();
			result++;
		}

		// 0 제거
		System.out.println(result - 1);

	}
}
