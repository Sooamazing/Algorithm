package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// 24-05-14 35min
// https://www.acmicpc.net/problem/1339
public class WordMath {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());
		String[] strs = new String[size];
		int[] arr = new int[26];
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < size; i++) {
			String str = strs[i] = br.readLine();
			int length = str.length();
			for (int j = 0; j < length; j++) {
				char curChar = str.charAt(j);
				int finalJ = j;
				map.compute(curChar, (K, V) -> V == null ?
					(int)Math.pow(10, length - finalJ - 1)
					: V + (int)Math.pow(10, length - finalJ
					- 1));
			}
		}

		List<Map.Entry<Character, Integer>> list =
			map.entrySet().stream().sorted((o1, o2) -> o2.getValue() - o1.getValue()).collect(Collectors.toList());

		int idx = 0;
		for (Map.Entry<Character, Integer> entry : list) {
			Character key = entry.getKey();
			arr[key - 'A'] = 9 - idx++;
		}

		int sum = 0;
		for (int i = 0; i < strs.length; i++) {
			String str = strs[i];
			int length = str.length();
			for (int j = 0; j < length; j++) {
				char curChar = str.charAt(j);
				sum += (int)Math.pow(10, length - j
					- 1) * arr[curChar - 'A'];
			}
		}
		System.out.println(sum);
	}
}

