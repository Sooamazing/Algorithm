package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 24-08-27 10min
//https://www.acmicpc.net/problem/9375
public class FashionKingShinHaebin {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testNum = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Map<String, Integer> map;
		while (testNum-- > 0) {
			int n = Integer.parseInt(br.readLine());
			map = new HashMap<>();

			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				String category = st.nextToken();
				map.put(category, map.getOrDefault(category, 0) + 1);
			}

			int ans = 1;
			for (int value : map.values()) {
				ans *= (value + 1);
			}
			sb.append(ans - 1).append("\n");
		}

		System.out.println(sb);

	}
}
