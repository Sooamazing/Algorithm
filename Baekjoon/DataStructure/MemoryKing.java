package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// 25-01-05 5min
// https://www.acmicpc.net/problem/2776
public class MemoryKing {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCases = Integer.parseInt(br.readLine());
		while (testCases-- > 0) {
			int n = Integer.parseInt(br.readLine());
			Set<Integer> note1 = new HashSet<>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				note1.add(Integer.parseInt(st.nextToken()));
			}

			int m = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < m; i++) {
				if (note1.contains(Integer.parseInt(st.nextToken()))) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
			}
		}

		System.out.println(sb);
	}
}
