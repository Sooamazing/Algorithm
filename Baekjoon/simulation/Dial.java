package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

// 24-09-26 5min
// https://www.acmicpc.net/problem/5622
public class Dial {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		Map<Character, Integer> dialMap = Map.ofEntries(
			Map.entry('A', 3),
			Map.entry('B', 3),
			Map.entry('C', 3),
			Map.entry('D', 4),
			Map.entry('E', 4),
			Map.entry('F', 4),
			Map.entry('G', 5),
			Map.entry('H', 5),
			Map.entry('I', 5),
			Map.entry('J', 6),
			Map.entry('K', 6),
			Map.entry('L', 6),
			Map.entry('M', 7),
			Map.entry('N', 7),
			Map.entry('O', 7),
			Map.entry('P', 8),
			Map.entry('Q', 8),
			Map.entry('R', 8),
			Map.entry('S', 8),
			Map.entry('T', 9),
			Map.entry('U', 9),
			Map.entry('V', 9),
			Map.entry('W', 10),
			Map.entry('X', 10),
			Map.entry('Y', 10),
			Map.entry('Z', 10)
		);

		int time = 0;
		for (int i = 0; i < word.length(); i++) {
			time += dialMap.get(word.charAt(i));
		}

		System.out.println(time);

	}
}
