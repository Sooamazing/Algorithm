package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 반례: " " 1
// 24-03-29
// https://www.acmicpc.net/problem/1152
public class TheNumberOfWords {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String string = br.readLine().trim();

		StringTokenizer st = new StringTokenizer(string, " ");

		int cnt = 0;
		while (st.hasMoreTokens()) {
			st.nextToken();
			cnt++;
		}

		// Map<String, Integer> map = new HashMap<>();
		//
		// for (int i = 0; i < split.length; i++) {
		// 	map.compute(split[i], (k, v) -> v == null ? 1 : v + 1);
		// }
		//
		// System.out.println(map.size());
		System.out.println(cnt);
	}
}
