package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// 24-08-16 5min
// https://www.acmicpc.net/problem/1076
public class Resistance {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Map<String, int[]> map = new HashMap<>();
		map.put("black", new int[] {0, 1});
		map.put("brown", new int[] {1, 10});
		map.put("red", new int[] {2, 100});
		map.put("orange", new int[] {3, 1_000});
		map.put("yellow", new int[] {4, 10_000});
		map.put("green", new int[] {5, 100_000});
		map.put("blue", new int[] {6, 1_000_000});
		map.put("violet", new int[] {7, 10_000_000});
		map.put("grey", new int[] {8, 100_000_000});
		map.put("white", new int[] {9, 1_000_000_000});

		long v = map.get(br.readLine())[0] * 10;
		v += map.get(br.readLine())[0];
		v *= map.get(br.readLine())[1];
		System.out.println(v);
	}
}
