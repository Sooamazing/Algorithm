package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 155987643211011121314 -> 15 5 9 8 7 6 4 3 2 11 1 11 12 13 14  출력.
// 67891054321 - visit=false 처리 안 함.
// 24-07-10 23:10
// https://www.acmicpc.net/problem/10597
public class PlayingWithPermutations {
	static int maxNum;
	static StringBuilder sb = new StringBuilder();
	static boolean[] visited;
	static String str;
	static int length;
	static int[] result;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();
		maxNum = 0;
		length = str.length();
		if (length > 9) {
			maxNum = 9 + (length - 9) / 2;
		} else {
			maxNum = length;
		}

		visited = new boolean[length + 1];
		result = new int[maxNum];

		dfs(0, 0);

		for (int v : result) {
			sb.append(v).append(" ");
		}

		System.out.println(sb);

		// copilot
		// try {
		// 	String str = br.readLine();
		// 	int length = str.length();
		// 	int[] arr = new int[length + 1];
		// 	boolean[] visited = new boolean[length + 1];
		// 	for (int i = 1; i <= length; i++) {
		// 		arr[i] = -1;
		// 	}
		// 	dfs(arr, visited, str, 0);
		// } catch (Exception e) {
		// 	e.printStackTrace();
		// }
	}

	static void dfs(int idx, int depth) {

		if (idx >= length) {
			return;
		}

		// 한 자리
		int curNum = str.charAt(idx) - '0';
		if (idx < length && !visited[curNum] && curNum > 0) {
			visited[curNum] = true;
			result[depth] = curNum;
			dfs(idx + 1, depth + 1);
			visited[curNum] = false;
		}

		// 두 자리
		if (idx < length - 1) {
			curNum = curNum * 10 + (str.charAt(idx + 1) - '0');
			if (curNum <= maxNum && !visited[curNum]) {
				visited[curNum] = true;
				result[depth] = curNum;
				dfs(idx + 2, depth + 1);
				visited[curNum] = false;
			}
		}

	}

	// copilot
	// static void dfs(int[] arr, boolean[] visited, String str, int idx) {
	// 	if (idx == str.length()) {
	// 		for (int i = 1; i < arr.length; i++) {
	// 			System.out.print(arr[i] + " ");
	// 		}
	// 		System.out.println();
	// 		System.exit(0);
	// 	}
	//
	// 	if (arr[idx + 1] != -1) {
	// 		dfs(arr, visited, str, idx + 1);
	// 	}
	//
	// 	for (int i = 1; i <= 2; i++) {
	// 		if (idx + i > str.length()) {
	// 			break;
	// 		}
	// 		int num = Integer.parseInt(str.substring(idx, idx + i));
	// 		if (num > str.length() || visited[num]) {
	// 			continue;
	// 		}
	// 		visited[num] = true;
	// 		arr[idx + 1] = num;
	// 		dfs(arr, visited, str, idx + i);
	// 		visited[num] = false;
	// 	}
	// }
}
