package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.StringTokenizer;

// 24-12-09 5min
// https://www.acmicpc.net/problem/2530
public class ArtificialIntelligenceWatch {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		int second = Integer.parseInt(st.nextToken());

		int time = Integer.parseInt(br.readLine());
		LocalDateTime now = LocalDateTime.of(2024, 12, 9, hour, minute, second);
		LocalDateTime finishedTime = now.plusSeconds(time);

		System.out.println(finishedTime.getHour() + " " + finishedTime.getMinute() + " " + finishedTime.getSecond());
	}
}
