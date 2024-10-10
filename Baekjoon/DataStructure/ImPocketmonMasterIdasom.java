package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 24-10-10 10min
// https://www.acmicpc.net/problem/1620
public class ImPocketmonMasterIdasom {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int total = Integer.parseInt(st.nextToken());
		int question = Integer.parseInt(st.nextToken());
		Map<String, Integer> pocketmon = new HashMap<>();
		String[] pocketmonOrder = new String[total + 1];
		for (int i = 1; i <= total; i++) {
			String name = br.readLine();
			pocketmon.put(name, i);
			pocketmonOrder[i] = name;
		}

		for (int i = 0; i < question; i++) {
			String input = br.readLine();
			if (Character.isDigit(input.charAt(0))) {
				sb.append(pocketmonOrder[Integer.parseInt(input)]).append("\n");
			} else {
				sb.append(pocketmon.get(input)).append("\n");
			}
		}

		System.out.println(sb);
	}
}
