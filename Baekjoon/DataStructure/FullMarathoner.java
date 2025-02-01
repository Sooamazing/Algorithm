package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// 25-02-01 5min
// https://www.acmicpc.net/problem/10546
public class FullMarathoner {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		Map<String, Integer> participants = new HashMap<>();

		// 참가자 명단
		for (int i = 0; i < total; i++) {
			String participant = br.readLine();
			participants.put(participant, participants.getOrDefault(participant, 0) + 1);
		}

		// 완주 명단
		for (int i = 0; i < total - 1; i++) {
			String participant = br.readLine();
			participants.put(participant, participants.getOrDefault(participant, 0) - 1);
		}

		String answer = "";
		for (String key : participants.keySet()) {
			if (participants.get(key) == 1) {
				answer = key;
			}
		}
		System.out.println(answer);
	}
}
