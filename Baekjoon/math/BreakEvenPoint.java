package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-04-19 15min
//https://www.acmicpc.net/problem/1712
public class BreakEvenPoint {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long fixedCost = Integer.parseInt(st.nextToken());
		long variableCost = Integer.parseInt(st.nextToken());
		long salesCost = Integer.parseInt(st.nextToken());
		if (variableCost >= salesCost) {
			System.out.println(-1);
			return;
		}
		int salesNumber = 1;
		while (true) {
			long totalCost = fixedCost + variableCost * salesNumber;
			long totalIncome = salesCost * salesNumber;
			if (totalCost < totalIncome) {
				break;
			}
			salesNumber++;
		}

		System.out.println(salesNumber);
	}
	//
	// private static int binarySearch(int start) {
	//
	// }
}
