package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortNumber5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		// PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i < n; i++) {
			// pq.add(Integer.parseInt(br.readLine()));
			arr[i] = Integer.parseInt(br.readLine());
		}
		// while (!pq.isEmpty()) {
		// 	sb.append(pq.poll()).append("\n");
		// }
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			sb.append(arr[i]).append("\n");
		}
		System.out.println(sb);

	}
}
