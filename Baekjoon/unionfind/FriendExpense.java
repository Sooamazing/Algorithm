package Baekjoon.unionfind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-10-01 60min
// https://www.acmicpc.net/problem/16562
public class FriendExpense {

	static int studentNum;
	static int[] expenses;
	static int[] parent;
	static int[] rank;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		studentNum = Integer.parseInt(st.nextToken());
		int relationshipNum = Integer.parseInt(st.nextToken());
		int budget = Integer.parseInt(st.nextToken());

		expenses = new int[studentNum + 1];
		parent = new int[studentNum + 1];
		rank = new int[studentNum + 1];

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i < studentNum + 1; i++) {
			expenses[i] = Integer.parseInt(st.nextToken());
			parent[i] = i;
			rank[i] = -1;
		}

		for (int i = 0; i < relationshipNum; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			union(a, b);
			find(a);
			find(b);
		}

		long friendExpense = 0;
		boolean[] visited = new boolean[studentNum + 1];
		for (int i = 1; i < studentNum + 1; i++) {
			int idx = find(i);
			if (!visited[i]) {
				if (!visited[idx]) {
					visited[idx] = true;
					friendExpense += expenses[idx];
				}
				visited[i] = true;
			}
		}

		// Set<Integer> relatedFriendSet = new HashSet<>();
		// for (int i = 1; i < studentNum + 1; i++) {
		// 	relatedFriendSet.add(parent[i]);
		// }
		//
		// for (int v : relatedFriendSet) {
		// 	friendExpense += expenses[v];
		// }

		if (friendExpense > budget) {
			System.out.println("Oh no");
		} else {
			System.out.println(friendExpense);
		}
	}

	static void union(int x, int y) {

		int nX = find(x);
		int nY = find(y);
		// if (rank[nX] == rank[nY]) {
		if (expenses[nX] <= expenses[nY]) {
			// rank[nX]++;
			parent[nY] = nX;
		} else if (expenses[nX] > expenses[nY]) {
			// rank[nY]++;
			parent[nX] = nY;
		}
		// }

		// if (rank[nX] > rank[nY]) {
		// 	parent[nY] = nX;
		// } else {
		// 	parent[nX] = nY;
		// }
		// // parent[nY] = nX;

	}

	static int find(int x) {
		if (parent[x] == x) {
			return x;
		}
		return parent[x] = find(parent[x]);
	}
}
