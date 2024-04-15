package Baekjoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 24-04-15 25min
// https://www.acmicpc.net/problem/11004
public class KthNumber {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int size = Integer.parseInt(st.nextToken());
		int targetIdx = Integer.parseInt(st.nextToken());

		Integer[] arr = new Integer[size];
		// int[] arr = new int[size];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		System.out.println(arr[targetIdx - 1]);

		// List<String> list = Arrays.stream(br.readLine().split(" ")).collect(Collectors.toList());

		// Collections.sort(list);
		// System.out.println(list.get(targetIdx - 1));

		// Arrays.sort(split, (o1, o2) ->
		// 	o1.compareTo(o2)
		// );

	}

}
