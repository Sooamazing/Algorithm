package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10816
public class NumberCards2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		// 182912KB, 1064ms
		// Map<Integer, Integer> map = new HashMap<>();
		// for (String s : br.readLine().split(" ")) {
		// 	int key = Integer.parseInt(s);
		// 	map.compute(key, (k, v) -> v == null ? 1 : v + 1);
		// }
		//
		// int M = Integer.parseInt(br.readLine());
		// for (String s : br.readLine().split(" ")) {
		// 	int key = Integer.parseInt(s);
		// 	sb.append(map.getOrDefault(key, 0)).append(" ");
		// }
		// System.out.println(sb);

		// 228988KB, 980ms
		int[] arr = new int[20000001];

		String[] cards = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			arr[Integer.parseInt(cards[i]) + 10000000]++;
		}

		int M = Integer.parseInt(br.readLine());
		String[] numbers = br.readLine().split(" ");
		for (int i = 0; i < M; i++) {
			sb.append(arr[Integer.parseInt(numbers[i]) + 10000000]).append(" ");
		}

		System.out.println(sb);

	}

}
