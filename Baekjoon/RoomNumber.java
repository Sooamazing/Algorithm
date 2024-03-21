package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// 24-03-21
// https://www.acmicpc.net/problem/1475
public class RoomNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> map = new HashMap<>();

		br.readLine().chars().forEach(c -> map.compute(c - '0', (k, v) -> v == null ? 1 : v + 1));

		int sixNine = map.getOrDefault(6, 0) + map.getOrDefault(9, 0);
		map.put(6, sixNine / 2 + sixNine % 2);
		map.remove(9);

		int max = 0;
		for (int value : map.values()) {
			max = Math.max(max, value);
		}

		System.out.println(max);

	}
}
