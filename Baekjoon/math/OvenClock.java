package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-10-23 5min
// https://www.acmicpc.net/problem/2525
public class OvenClock {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int hour = Integer.parseInt(st.nextToken());

		int minutes = Integer.parseInt(st.nextToken());

		int cookTime = Integer.parseInt(br.readLine());

		minutes += cookTime;

		hour += minutes / 60;

		minutes %= 60;

		hour %= 24;

		System.out.println(hour + " " + minutes);

	}

}