package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

// 24-12-10 22:25
// https://www.acmicpc.net/problem/2754
public class CreditCalculation {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Double> creditMap = Map.ofEntries(
			Map.entry("A+", 4.3),
			Map.entry("A0", 4.0),
			Map.entry("A-", 3.7),
			Map.entry("B+", 3.3),
			Map.entry("B0", 3.0),
			Map.entry("B-", 2.7),
			Map.entry("C+", 2.3),
			Map.entry("C0", 2.0),
			Map.entry("C-", 1.7),
			Map.entry("D+", 1.3),
			Map.entry("D0", 1.0),
			Map.entry("D-", 0.7),
			Map.entry("F", 0.0)
		);
		String credit = br.readLine();

		System.out.println(creditMap.get(credit));

	}
}
