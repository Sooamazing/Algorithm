package Baekjoon.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-07-08 25min
// https://www.acmicpc.net/problem/9934
public class CompletelyBinaryTree {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int maxDepth = Integer.parseInt(br.readLine());
		int total = (int)Math.pow(2, maxDepth) - 1;
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] nodes = new int[total + 1];
		for (int i = 1; i <= total; i++) {
			int node = Integer.parseInt(st.nextToken());
			nodes[i] = node;
		}

		int depth = maxDepth;
		while (depth > 0) {
			int curIdx = (int)Math.pow(2, depth - 1);
			// 루트가 아니라면
			if (depth != maxDepth) {
				int upDepth = (int)Math.pow(2, depth);
				while (curIdx <= total) {
					sb.append(nodes[curIdx]).append(" ");
					curIdx += upDepth;
				}
			} else {
				// 루트라면
				sb.append(nodes[curIdx]);
			}
			sb.append("\n");
			depth--;
		}

		System.out.println(sb);

	}
}
