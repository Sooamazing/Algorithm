package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 25-02-06 5min
// https://www.acmicpc.net/problem/2161
public class Card1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int total = Integer.parseInt(br.readLine());
		Queue<Integer> que = new LinkedList<>();
		for (int i = 1; i <= total; i++) {
			que.add(i);
		}

		while (!que.isEmpty()) {
			// 1. 맨 위 카드 버리기
			sb.append(que.poll()).append(" ");

			// 2. 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 옮긴다.
			if (!que.isEmpty()) {
				que.add(que.poll());
			}
		}

		System.out.println(sb);
	}
}
