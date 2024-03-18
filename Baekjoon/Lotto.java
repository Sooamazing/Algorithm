package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lotto {

	private static StringBuilder sb = new StringBuilder();
	private static int groupSize;
	private static int[] lottoGroup;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			groupSize = Integer.parseInt(st.nextToken());
			if (groupSize == 0) {
				break;
			}

			visited = new boolean[groupSize];
			lottoGroup = new int[groupSize];
			for (int i = 0; i < groupSize; i++) {
				lottoGroup[i] = Integer.parseInt(st.nextToken());
			}

			getGroups(0, 0);
			sb.append('\n');

		}

		System.out.println(sb);

	}

	private static int[] curArr = new int[6];
	private static boolean[] visited;

	private static void getGroups(int depth, int idx) {
		if (depth == 6) {

			for (int cur : curArr) {
				sb.append(cur).append(' ');
			}
			sb.append('\n');
			return;

		}

		for (int i = idx; i < groupSize; i++) {
			if (visited[i]) {
				continue;
			}
			visited[i] = true;
			curArr[depth] = lottoGroup[i];
			getGroups(depth + 1, i);
			visited[i] = false;
		}

	}

}
