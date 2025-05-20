package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;
import java.util.StringTokenizer;

// 25-05-20 5min
// https://www.acmicpc.net/problem/11945
public class HotFishBun {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringJoiner answerSj = new StringJoiner("\n");
		StringTokenizer st = new StringTokenizer(br.readLine());

		int total = Integer.parseInt(st.nextToken());
		for (int i = 0; i < total; i++) {
			StringBuilder sb = new StringBuilder(br.readLine());
			answerSj.add(sb.reverse());
		}

		System.out.println(answerSj);

	}
}
