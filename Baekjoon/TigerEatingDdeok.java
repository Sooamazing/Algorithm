package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-04-01
// https://www.acmicpc.net/problem/2502
public class TigerEatingDdeok {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] split = br.readLine().split(" ");
		int day = Integer.parseInt(split[0]);
		int ddeok = Integer.parseInt(split[1]);

		int[][] days = new int[day + 1][2];
		days[1][0] = 1;
		days[2][1] = 1;
		for (int i = 3; i < day + 1; i++) {
			days[i][0] = days[i - 2][0] + days[i - 1][0];
			days[i][1] = days[i - 2][1] + days[i - 1][1];
		}

		int a = days[day][0];
		int b = days[day][1];
		int aResult = 0;
		int bResult = 0;
		for (int i = 2; ; i++) {
			int restDdeok = ddeok;
			restDdeok -= (b * i);
			if (restDdeok % a == 0 && restDdeok / a <= i) {
				aResult = restDdeok / a;
				bResult = i;
				break;
			}
		}

		System.out.println(aResult + "\n" + bResult);

	}
	
}
