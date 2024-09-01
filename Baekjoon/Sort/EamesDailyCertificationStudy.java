package Baekjoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 24-09-01 20min
// https://www.acmicpc.net/problem/29730
public class EamesDailyCertificationStudy {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int studyRecordNum = Integer.parseInt(br.readLine());
		PriorityQueue<String> otherStudies = new PriorityQueue<>(
			(o1, o2) -> {
				if (o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}
				return o1.length() - o2.length();
			}
		);

		PriorityQueue<Integer> bojs = new PriorityQueue<>();

		for (int i = 0; i < studyRecordNum; i++) {
			String str = br.readLine();
			if (str.startsWith("boj.kr/")) {
				int problemId = Integer.parseInt(str.substring(7));
				// if (!bojs.contains(problemId)) {
				bojs.add(problemId);
				// }
				continue;
			}
			// if (!otherStudies.contains(str)) {
			otherStudies.add(str);
			// }
		}
		while (!otherStudies.isEmpty()) {
			sb.append(otherStudies.poll()).append("\n");
		}
		while (!bojs.isEmpty()) {
			sb.append("boj.kr/").append(bojs.poll()).append("\n");
		}

		System.out.println(sb);

	}
}
