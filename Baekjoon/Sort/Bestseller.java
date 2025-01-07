package Baekjoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

// 25-01-07 15min
// https://www.acmicpc.net/problem/1302
public class Bestseller {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		// key 기준 정렬
		Map<String, Integer> map = new TreeMap<>();

		for (int i = 0; i < total; i++) {
			String key = br.readLine();
			map.put(key, map.getOrDefault(key, 0) + 1);
		}

		String ans = "";
		int max = 0;
		for (String key : map.keySet()) {
			if (map.get(key) > max) {
				max = map.get(key);
				ans = key;
			}
		}

		System.out.println(ans);
	}
}
