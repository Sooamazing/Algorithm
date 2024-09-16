package Baekjoon.unionfind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-09-16 45min
// https://www.acmicpc.net/problem/7511
public class SocialNetworkingApplication {
	static int[] parent;
	// static int[] rank;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int testCaseNum = Integer.parseInt(br.readLine());

		for (int i = 1; i < testCaseNum + 1; i++) {
			sb.append("Scenario " + i + ":\n");
			int friendNum = Integer.parseInt(br.readLine());
			parent = new int[friendNum];
			for (int j = 0; j < friendNum; j++) {
				parent[j] = j;
				// rank[j] = 0;
			}

			int relationNum = Integer.parseInt(br.readLine());
			for (int j = 0; j < relationNum; j++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());

				union(a, b);
			}

			int queryNum = Integer.parseInt(br.readLine());
			for (int j = 0; j < queryNum; j++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				if (find(a) == find(b)) {
					sb.append(1);
				} else {
					sb.append(0);
				}
				sb.append("\n");
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}

	private static int find(int a) {
		if (parent[a] == a) {
			return a;
		}
		return parent[a] = find(parent[a]);
	}

	// 시간 초과
	// private static void union(int a, int b) {
	// 	a = find(a);
	// 	b = find(b);
	//
	// 	if (a != b) {
	// 		for (int i = 0; i < parent.length; i++) {
	// 			if (find(i) == b) {
	// 				parent[i] = a;
	// 			}
	// 		}
	// 		parent[b] = a;
	// 	}
	// }
	private static void union(int a, int b) {
		a = find(a);
		b = find(b);

		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		parent[b] = a;
	}
}
