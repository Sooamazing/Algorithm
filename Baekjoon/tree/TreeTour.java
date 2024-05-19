package Baekjoon.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-04-04, 05-19 60min
// https://www.acmicpc.net/problem/1991
public class TreeTour {

	private static StringBuilder sb = new StringBuilder();
	private static char[][] trees;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int rows = Integer.parseInt(br.readLine());

		trees = new char[26][2];

		for (int i = 0; i < rows; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int root = st.nextToken().charAt(0) - 'A';
			char left = (char)(st.nextToken().charAt(0));
			char right = (char)(st.nextToken().charAt(0));

			if (left == ('.')) {
				left = '0';
			}
			if (right == ('.')) {
				right = '0';
			}

			trees[root][0] = left;
			trees[root][1] = right;

		}

		getPreorderTraversal('A');
		sb.append('\n');
		visited = new boolean[26];
		getInorderTraversal('A');
		sb.append('\n');
		visited = new boolean[26];
		getPostorderTraversal('A');

		System.out.println(sb);

	}

	private static void getPostorderTraversal(char root) {

		char left = trees[root - 'A'][0];
		char right = trees[root - 'A'][1];

		// 왼쪽 자식부터
		if (left != '0') {
			getPostorderTraversal(left);
		}
		// 오른쪽 자식
		if (right != '0') {
			getPostorderTraversal(right);
		}
		// root
		if (!visited[root - 'A']) {
			visited[root - 'A'] = true;
			sb.append(root);
		}

	}

	private static boolean[] visited;

	private static void getInorderTraversal(char root) {

		// visited[root - 'A'] = true;

		char left = trees[root - 'A'][0];
		char right = trees[root - 'A'][1];

		// 왼쪽
		if (left != '0' && !visited[left - 'A']) {
			getInorderTraversal(left);
			// sb.append(left);
		}
		// root
		if (!visited[root - 'A']) {
			visited[root - 'A'] = true;
			sb.append(root);
		}
		// 오른쪽
		if (right != '0') {
			// visited[right - 'A'] = true;
			getInorderTraversal(right);
			// sb.append(right);
		}
	}

	private static void getPreorderTraversal(char root) {

		sb.append(root);
		char left = trees[root - 'A'][0];
		char right = trees[root - 'A'][1];

		// root에 자식이 있으면
		// 왼쪽 자식부터
		if (left != '0') {
			getPreorderTraversal(left);
		}

		// 오른쪽 자식
		if (right != '0') {
			getPreorderTraversal(right);
		}

	}

}
