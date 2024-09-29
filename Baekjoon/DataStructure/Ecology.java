package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

// 24-09-29 40min
// https://www.acmicpc.net/problem/4358
public class Ecology {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String tree;
		Map<String, Float> map = new TreeMap<>();

		int total = 0;
		while (true) {
			tree = br.readLine();
			if (tree == null) {
				break;
			}
			map.put(tree, map.getOrDefault(tree, 0F) + 1);
			total++;
		}

		for (Map.Entry<String, Float> entry : map.entrySet()) {
			sb.append(entry.getKey())
				.append(" ")
				// .append((float)Math.round(entry.getValue() * 10000 * 100 / total) / 10000) // 틀림
				.append(String.format("%.4f", entry.getValue() * 100 / total))
				.append("\n");
		}

		System.out.println(sb);
	}
}
