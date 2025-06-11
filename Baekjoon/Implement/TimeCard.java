package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.StringTokenizer;

// 25-06-11 10min
// https://www.acmicpc.net/problem/5575
public class TimeCard {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 3; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			LocalTime startTime = LocalTime.of(
				Integer.parseInt(st.nextToken()),
				Integer.parseInt(st.nextToken()),
				Integer.parseInt(st.nextToken())
			);
			LocalTime endTime = LocalTime.of(
				Integer.parseInt(st.nextToken()),
				Integer.parseInt(st.nextToken()),
				Integer.parseInt(st.nextToken())
			);

			LocalTime localTime = endTime.minusSeconds(startTime.getSecond())
				.minusMinutes(startTime.getMinute())
				.minusHours(
					startTime.getHour());

			sb.append(localTime.getHour()).append(" ")
				.append(localTime.getMinute()).append(" ")
				.append(localTime.getSecond()).append("\n");
		}

		System.out.println(sb);
	}
}
