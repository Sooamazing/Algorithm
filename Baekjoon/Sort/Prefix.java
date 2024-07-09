package Baekjoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

// 24-07-09 10min
// https://www.acmicpc.net/problem/1141
public class Prefix {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		Map<String, Integer> prefixes = new TreeMap<>();

		for (int i = 0; i < num; i++) {
			String prefix = br.readLine();
			prefixes.put(prefix, prefixes.getOrDefault(prefix, 0) + 1);
		}

		String[] sortedWords = prefixes.keySet().toArray(new String[num]); // 신기한 활용..

		int ans = 0;

		for (int i = 0; i < num - 1; i++) {
			String curWord = sortedWords[i];
			String tempWord = sortedWords[i + 1];

			// 3
			// topcoder
			// topcoder
			// topcoding
			if (tempWord == null)
				break;
			if (!tempWord.startsWith(curWord)) {
				ans++;
			}
		}

		// 마지막 1개는 보장이라 +1
		System.out.println(ans + 1);

	}
}
