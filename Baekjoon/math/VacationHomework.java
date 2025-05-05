package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-05-05 5min
// https://www.acmicpc.net/problem/5532
public class VacationHomework {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int vacation = Integer.parseInt(br.readLine());
		int koreanMax = Integer.parseInt(br.readLine());
		int mathMax = Integer.parseInt(br.readLine());
		int koreanPerDay = Integer.parseInt(br.readLine());
		int mathPerDay = Integer.parseInt(br.readLine());

		int homeworkMax = Math.max((koreanMax - 1) / koreanPerDay + 1
			, (mathMax - 1) / mathPerDay + 1);

		System.out.println(vacation - homeworkMax);

	}
}
