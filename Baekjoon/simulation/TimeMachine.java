package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-01-12 10min
// https://www.acmicpc.net/problem/1440
public class TimeMachine {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		int first = Integer.parseInt(st.nextToken());
		if (!checkMinutes(first)) {
			System.out.print("0");
			return;
		}
		int mid = Integer.parseInt(st.nextToken());
		if (!checkMinutes(mid)) {
			System.out.print("0");
			return;
		}
		int last = Integer.parseInt(st.nextToken());
		if (!checkMinutes(last)) {
			System.out.print("0");
			return;
		}

		int possibleHours = 0;

		if (checkHours(first)) {
			possibleHours++;
		}
		if (checkHours(mid)) {
			possibleHours++;
		}
		if (checkHours(last)) {
			possibleHours++;
		}

		if (possibleHours == 0) {
			System.out.print("0");
		} else if (possibleHours == 1) {
			System.out.print("2");
		} else if (possibleHours == 2) {
			System.out.print("4");
		} else {
			System.out.print("6");
		}

	}

	private static boolean checkMinutes(int value) {
		if (value >= 0 && value <= 59) {
			return true;
		}
		return false;
	}

	private static boolean checkHours(int value) {
		if (value >= 1 && value <= 12) {
			return true;
		}
		return false;
	}
}
