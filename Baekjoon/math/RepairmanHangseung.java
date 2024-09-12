package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-08-29 5min
// https://www.acmicpc.net/problem/1449
public class RepairmanHangseung {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int brokenNum = Integer.parseInt(st.nextToken());
		int tapeLength = Integer.parseInt(st.nextToken());

		System.out.println(brokenNum / tapeLength + (brokenNum % tapeLength == 0 ? 0 : 1));

	}
}
