package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-12-28 3min
// https://www.acmicpc.net/problem/10214
public class Baseball {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCase = Integer.parseInt(br.readLine());

		StringTokenizer st;
		while (testCase-- > 0) {
			int yonsei = 0;
			int korea = 0;

			for (int i = 0; i < 9; i++) {
				st = new StringTokenizer(br.readLine());
				yonsei += Integer.parseInt(st.nextToken());
				korea += Integer.parseInt(st.nextToken());
			}

			if (yonsei > korea) {
				sb.append("Yonsei\n");
			} else if (yonsei < korea) {
				sb.append("Korea\n");
			} else {
				sb.append("Draw\n");
			}
		}

		System.out.println(sb);
	}
}
