package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NextPermutation {

	private static int[] arr, result;
	private static boolean[] visited;
	private static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		arr = new int[size];
		result = new int[size];
		visited = new boolean[size];
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		getNextPermutation(0, 0);

		if (flag || end) {
			sb.append("-1");
		}

		System.out.println(sb);

	}

	private static boolean flag, end;

	private static void getNextPermutation(int depth, int idx) {
		if (depth == arr.length) {
			if (flag) {
				sb.append(Arrays.toString(result)).append("\n");
				end = true;
			}

			if (Arrays.equals(arr, result)) {
				flag = true;
			}
			System.out.println(Arrays.toString(result));
			return;
		}
		for (int i = idx; i < arr.length; i++) {
			if (visited[i]) {
				System.out.println(Arrays.toString(result));
				continue;
			}
			result[depth] = arr[i];
			visited[i] = true;
			getNextPermutation(depth + 1, idx + 1);
			visited[i] = false;
			if (end)
				break;
		}
	}
}
