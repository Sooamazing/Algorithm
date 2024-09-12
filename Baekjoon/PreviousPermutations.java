package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 13:5
public class PreviousPermutations {
	private static int size;
	private static int[] std;
	private static int[] arr;
	private static int[] temp;
	private static int[] prev;
	private static int[] result;
	private static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		size = Integer.parseInt(br.readLine());
		std = new int[size];

		temp = new int[size];
		prev = new int[size];
		result = new int[size];
		visited = new boolean[size];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < size; i++) {
			std[i] = Integer.parseInt(st.nextToken());
		}
		arr = Arrays.copyOf(std, size);
		Arrays.sort(arr);

		getPreviousPermutation(0, prev);

		if (result[0] == 0) {
			sb.append(-1);
		} else {
			for (int itg : result) {
				sb.append(itg).append(" ");

			}
		}
		System.out.println(sb);
	}

	private static boolean end = false;

	static void getPreviousPermutation(int depth, int[] prev) {

		if (depth == size) {

			if (Arrays.equals(std, temp)) {
				// System.out.println("equals: " + Arrays.toString(result));
				end = true;
			} else {
				result = Arrays.copyOf(temp, size);
				// System.out.println(Arrays.toString(result));
			}
		}

		for (int i = 0; i < size; i++) {
			if (!visited[i]) {
				visited[i] = true;
				temp[depth] = arr[i];
				getPreviousPermutation(depth + 1, prev);
				if (end) {
					return;
				}
				visited[i] = false;
			}
		}
	}
}
