package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-06-06 5min
// https://www.acmicpc.net/problem/19944
public class WhatsTheNewbieStandard {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int oldStandard = Integer.parseInt(st.nextToken());
		int grade = Integer.parseInt(st.nextToken());

		if (grade <= 2) {
			System.out.println("NEWBIE!");
		} else if (grade <= oldStandard) {
			System.out.println("OLDBIE!");
		} else {
			System.out.println("TLE!");
		}
	}
}
