package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-09-13 30min
// https://www.acmicpc.net/problem/14426
public class FindPrefix {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int stringNum = Integer.parseInt(st.nextToken());
		int prefixesNum = Integer.parseInt(st.nextToken());

		PriorityQueue<String> strings = new PriorityQueue<>();
		PriorityQueue<String> totals = new PriorityQueue<>();
		for (int i = 0; i < stringNum; i++) {
			String s = br.readLine();
			strings.add(s);
		}

		for (int i = 0; i < prefixesNum; i++) {
			String s = br.readLine();
			totals.add(s);
		}

		String std = strings.poll();
		int ans = 0;
		while (!totals.isEmpty()) {
			String poll = totals.poll();

			// 빠져나온 글자가 기준보다 뒷 순서면 기준 갱신
			while (!strings.isEmpty() && std.compareTo(poll) < 0) {
				std = strings.poll();
			}

			// 빠져나온 글자가 prefix가 맞으면
			if (std.startsWith(poll)) {
				ans++;
			}

		}
		System.out.println(ans);
	}
}
