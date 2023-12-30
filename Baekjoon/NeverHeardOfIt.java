// https://www.acmicpc.net/problem/1764

package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class NeverHeardOfIt {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int K = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Set<String> heard = new HashSet<>();
		List<String> result = new LinkedList<>();

		for (int i = 0; i < K; i++) {
			heard.add(br.readLine());
		}
		for (int i = 0; i < M; i++) {
			String s = br.readLine();
			if (heard.contains(s)) {
				result.add(s);
			}
		}

		result.sort(Comparator.naturalOrder());

		StringBuilder sb = new StringBuilder();
		sb.append(result.size()).append('\n');
		for (String s : result) {
			sb.append(s).append('\n');
		}

		System.out.println(sb);

	}
}
