package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;
import java.util.StringTokenizer;

// 25-05-16 5min
// https://www.acmicpc.net/problem/5063
public class TGN {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringJoiner sj = new StringJoiner("\n");

		int total = Integer.parseInt(br.readLine());

		for (int i = 0; i < total; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int noAds = Integer.parseInt(st.nextToken());
			int withAds = Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken());
			if (noAds > withAds) {
				sj.add("do not advertise");
			} else if (noAds < withAds) {
				sj.add("advertise");
			} else {
				sj.add("does not matter");
			}

		}

		System.out.println(sj);
	}
}
