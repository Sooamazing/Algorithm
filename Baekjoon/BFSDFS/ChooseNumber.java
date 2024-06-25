package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 4
// 2
// 3
// 2
// 3
// visit 처리 문제
// 24-06-25 30min
// https://www.acmicpc.net/problem/2668
public class ChooseNumber {

	static boolean[] visited;
	static int[] numTable;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int size = Integer.parseInt(br.readLine());

		numTable = new int[size + 1];
		visited = new boolean[size + 1];
		result = new PriorityQueue<>();
		for (int i = 1; i <= size; i++) {
			numTable[i] = Integer.parseInt(br.readLine());
			// // dot, 무조건 포함.
			// if (numTable[i] == i) {
			// 	visited[i] = true;
			// 	result.add(i);
			// }
		}

		for (int i = 1; i <= size; i++) {
			if (!visited[i]) {
				dfs(i, i);
				// 방문 처리 필요.
				visited[i] = true;
			}
		}

		sb.append(result.size()).append("\n");
		while (!result.isEmpty()) {
			sb.append(result.poll()).append("\n");
		}
		System.out.println(sb);

	}

	static PriorityQueue<Integer> result;

	static boolean dfs(int startNum, int curIdx) {

		// circle, dot
		if (visited[curIdx]) {
			return startNum == curIdx; // simplify
			// if (startNum == curIdx) {
			// 	return true;
			// }
			// return false;
		}
		visited[curIdx] = true;
		boolean isLoop = dfs(startNum, numTable[curIdx]);
		if (isLoop) {
			// 순환이면, 현재 node는 정답.
			// 순환이면, visit 유지하는 이유: 똑같은 처리니 굳이 재귀 더 할 필요 X
			result.add(curIdx);
		} else {
			// 비순환이면, 여태 다녀온 곳들 미방문 처리.
			visited[curIdx] = false;
		}
		return isLoop; // 맞나? dfs로 끝까지 갔을 때(재방문한 시점에) 순환인지 아닌지 여부.

		// copilot - right?
		// if (arr[idx] == 0) {
		// 	return false;
		// }
		// if (arr[idx] == -1) {
		// 	return true;
		// }
		// arr[idx] = -1;
		// if (dfs(arr, arr[idx])) {
		// 	arr[idx] = 0;
		// 	return true;
		// }
		// arr[idx] = 0;
		// return false;
	}

}
