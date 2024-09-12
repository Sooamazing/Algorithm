package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 8
// 1 2
// 3 4
// 3 5
// 7 8
// 6 7
// 5 2
// 갱신 안 되는 경우 해결 필요.
// 24-08-01 45min
// https://www.acmicpc.net/problem/17352
// 반례: https://www.acmicpc.net/board/view/62194
public class IWillBeYourBridge {
	static int[] rootBridge;
	static int[] rank;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int connectedBridgeNum = Integer.parseInt(br.readLine());
		rootBridge = new int[connectedBridgeNum + 1];
		rank = new int[connectedBridgeNum + 1];

		// rootBridge 자리 초기화!
		for (int i = 1; i < connectedBridgeNum + 1; i++) {
			// rootBridge[i] = i;
			rootBridge[i] = -1;
			rank[i] = 1;
		}

		StringTokenizer st;
		for (int i = 0; i < connectedBridgeNum - 2; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			union(a, b);
		}

		int a = rootBridge[1];
		int b = 0;
		boolean isChange = false;
		for (int i = 2; i < connectedBridgeNum + 1; i++) {
			int cur = rootBridge[i];
			if (cur != a && !isChange) {
				isChange = true;
				b = cur;
				break;
			}
		}

		System.out.println(Math.abs(a) + " " + Math.abs(b));
	}

	// static void union(int a, int b) {
	// 	if (rootBridge[a] < rootBridge[b]) {
	// 		rootBridge[b] = rootBridge[a];
	// 	} else if (rootBridge[a] > rootBridge[b]) {
	// 		rootBridge[a] = rootBridge[b];
	// 	}
	// }

	static void union(int a, int b) {
		int a_parent = find(a);
		int b_parent = find(b);

		// if (a_parent > b_parent) {
		// 	union(a_parent, b_parent);
		// 	rootBridge[b] = a_parent;
		// } else if (a_parent < b_parent) {
		// 	union(a_parent, b_parent);
		// }

		if (rank[a_parent] < rank[b_parent]) {
			rootBridge[a_parent] += rootBridge[b_parent];
			rootBridge[b_parent] = a_parent;
			// rootBridge[a_parent] = b_parent;
			// rank[b_parent] += rank[a_parent];
		} else {
			rootBridge[b_parent] += rootBridge[a_parent];
			rootBridge[a_parent] = b_parent;
		}
		// } else if (rank[a_parent] == rank[b_parent]) {
		return;
		// rootBridge[a_parent] = b_parent;
		// rank[a_parent]++;

	}

	static int find(int a) {
		if (rootBridge[a] < 0) {
			return a;
		} else {
			return rootBridge[a] = find(rootBridge[a]);
		}
		// if (a != rootBridge[a]) {
		// 	return rootBridge[a] = find(rootBridge[a]);
		// } else {
		// 	return a;
		// }
	}
}
