package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-10-21 10min
// https://www.acmicpc.net/problem/2884
public class AlarmClock {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int hour = Integer.parseInt(st.nextToken());

		int minutes = Integer.parseInt(st.nextToken());

		if (minutes >= 45) {

			System.out.println(hour + " " + (minutes - 45));

		} else {

			if (hour == 0) {

				System.out.println("23 " + (minutes + 15));

			} else {

				System.out.println((hour - 1) + " " + (minutes + 15));

			}

		}

	}

}
