package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 24-09-02 25min
// https://www.acmicpc.net/problem/15595
public class CalculatingThePercentageOfCorrectAnswers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testNum = Integer.parseInt(br.readLine());
		int correct = 0;
		int total = 0;

		StringTokenizer st;
		Map<String, Integer> map = new HashMap();
		for (int i = 0; i < testNum; i++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			String user = st.nextToken();
			if (user.equals("megalusion")) {
				continue;
			}
			int code = Integer.parseInt(st.nextToken());
			map.put(user, map.getOrDefault(user, 0) + 1);
			if (code == 4 && map.get(user) != -1) {
				total += map.get(user);
				correct++;
				map.put(user, -1);
			} else {
				if (map.getOrDefault(user, 0) == -1) {
					continue;
				}
			}
		}
		System.out.println(total == 0 ? 0 : (double)correct / total * 100);

	}
}
