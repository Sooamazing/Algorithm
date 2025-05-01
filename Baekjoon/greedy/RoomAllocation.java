package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 25-05-01 10min
// https://www.acmicpc.net/problem/13300
public class RoomAllocation {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int student = Integer.parseInt(st.nextToken());
		int roomMax = Integer.parseInt(st.nextToken());

		// int[][] students = new int[7][2];
		Map<String, Integer> studentMap = new HashMap<>();
		for (int i = 0; i < student; i++) {
			String sexAndGrade = br.readLine();
			studentMap.put(sexAndGrade, studentMap.getOrDefault(sexAndGrade, 0) + 1);

		}

		int result = 0;
		for (String s : studentMap.keySet()) {
			int studentNumber = studentMap.get(s);
			result += studentNumber / roomMax;
			result += studentNumber % roomMax > 0 ? 1 : 0;
		}

		System.out.println(result);
	}
}
