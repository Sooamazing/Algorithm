package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-12-2 15min
// https://www.acmicpc.net/problem/1924
public class Year2007 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int month = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(st.nextToken());

		int order = 0;
		// 2007년 1월 1일 월요일
		// 31 - 3, 30 - 2, 28 - 0
		switch (month) {
			case 1:
				order = day % 7;
				break;
			case 2:
				order = (day + 3) % 7;
				break;
			case 3:
				order = (day + 3) % 7;
				break;
			case 4:
				order = (day + 6) % 7;
				break;
			case 5:
				order = (day + 1) % 7;
				break;
			case 6:
				order = (day + 4) % 7;
				break;
			case 7:
				order = (day + 6) % 7;
				break;
			case 8:
				order = (day + 2) % 7;
				break;
			case 9:
				order = (day + 5) % 7;
				break;
			case 10:
				order = (day) % 7;
				break;
			case 11:
				order = (day + 3) % 7;
				break;
			case 12:
				order = (day + 5) % 7;
				break;
			default:
				break;
		}

		String str = null;
		switch (order) {
			case 0:
				str = "SUN";
				break;
			case 1:
				str = "MON";
				break;
			case 2:
				str = "TUE";
				break;
			case 3:
				str = "WED";
				break;
			case 4:
				str = "THU";
				break;
			case 5:
				str = "FRI";
				break;
			case 6:
				str = "SAT";
				break;
			default:
				break;
		}
		System.out.println(str);
	}
}
