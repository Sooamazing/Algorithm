package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-08-29 23:35
// https://www.acmicpc.net/problem/1871
public class GoodLicensePlate {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int carNum = Integer.parseInt(br.readLine());
		while (carNum-- > 0) {
			st = new StringTokenizer(br.readLine(), "-");
			String carNumStr = st.nextToken();
			int prev = 0;
			for (int i = 0; i < 3; i++) {
				prev += (carNumStr.charAt(i) - 'A') * Math.pow(26, 2 - i);
			}
			int next = Integer.parseInt(st.nextToken());
			int diff = Math.abs(prev - next);
			if (diff <= 100) {
				sb.append("nice\n");
			} else {
				sb.append("not nice\n");
			}
		}
		System.out.println(sb);
	}
}
