package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

// 25-01-03 10min
// https://www.acmicpc.net/problem/11652
public class Card {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();

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
			} else if (map.get(key) == max) {
				// +-2^62 범위 - long으로 표현 가능
				// 같다면 더 작은 수 출력
				BigInteger keyBI = new BigInteger(key);
				BigInteger ansBI = new BigInteger(ans);
				if (keyBI.compareTo(ansBI) < 0) {
					ans = key;
				}
			}
		}

		System.out.println(ans);
	}
}
