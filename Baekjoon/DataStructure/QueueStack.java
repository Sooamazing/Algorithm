package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

// 24-11-23 30min
// https://www.acmicpc.net/problem/24511
public class QueueStack {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int size = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		boolean[] isStack = new boolean[size];
		for (int i = 0; i < size; i++) {
			isStack[i] = Integer.parseInt(st.nextToken()) == 1;
		}
		//
		// int[] queueStack = new int[size];
		// st = new StringTokenizer(br.readLine());
		// for (int i = 0; i < size; i++) {
		// 	queueStack[i] = Integer.parseInt(st.nextToken());
		// }
		//
		// int total = Integer.parseInt(br.readLine());
		// st = new StringTokenizer(br.readLine());
		// for (int i = 0; i < total; i++) {
		// 	int pop = Integer.parseInt(st.nextToken());
		//
		// 	for (int j = 0; j < size; j++) {
		// 		if (isStack[j]) {
		// 			continue;
		// 		}
		// 		// TODO swap function
		// 		int temp = queueStack[j];
		// 		queueStack[j] = pop;
		// 		pop = temp;
		// 	}
		//
		// 	sb.append(pop).append(" ");
		// }

		st = new StringTokenizer(br.readLine());
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < size; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (isStack[i]) {
				continue;
			}
			stack.push(num);
		}

		int total = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		Queue<Integer> que = new LinkedList<>();
		for (int i = 0; i < total; i++) {
			que.add(Integer.parseInt(st.nextToken()));
			if (!stack.isEmpty()) {
				sb.append(stack.pop()).append(" ");
				continue;
			}
			sb.append(que.poll()).append(" ");
		}

		System.out.println(sb);
	}
}
