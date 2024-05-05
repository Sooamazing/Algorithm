package Baekjoon.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-05-05 90min
// https://www.acmicpc.net/problem/5710
public class ElectricCharges {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String input;
		while (!(input = br.readLine()).equals("0 0")) {
			StringTokenizer st = new StringTokenizer(input);
			int sumCharge = Integer.parseInt(st.nextToken());
			int abChargeGap = Integer.parseInt(st.nextToken());

			int totalUsage = getTotalUsageFromCharges(sumCharge);

			int charge = getEachChargeFromTotalUsage(totalUsage, abChargeGap);

			sb.append(charge).append("\n");

		}

		System.out.println(sb);

	}

	// 총 사용량과 gap을 이용해 상근이의 charge 구하기
	static int getEachChargeFromTotalUsage(int totalUsage, int abGap) {

		int start = 0;
		int end = totalUsage;

		int resultCharge = 0;
		while (start < end) {

			int mid = (start + end) / 2;
			int charge1 = getChargeFromUsage(mid);
			int charge2 = getChargeFromUsage(totalUsage - mid);
			int curGap = Math.abs(charge1 - charge2);

			if (curGap > abGap) {
				start = mid + 1;
			} else if (curGap < abGap) {
				end = mid;
			} else {
				resultCharge = Math.min(charge1, charge2);
				break;
			}

		}

		return resultCharge;
	}

	// 사용량으로 전기 요금 계산하기
	// 하드 코딩 말고 계산하는 법 고민하기
	static int getChargeFromUsage(int usage) {
		int charge = 0;
		if (usage > 1000000) {
			charge += 4979900;
			usage -= 1000000;
			charge += usage * 7;
		} else if (usage > 10000) {
			charge += 29900;
			usage -= 10000;
			charge += usage * 5;
		} else if (usage > 100) {
			charge += 200;
			usage -= 100;
			charge += usage * 3;
		} else {
			charge += usage * 2;
		}
		return charge;
	}

	// 전기 요금에서 총 사용량 얻기
	static int getTotalUsageFromCharges(int totalCharge) {
		int usage = 0;

		// 사용량*가격
		// ~100 100*2 = 200원
		// ~10000 100*2+9900*3 = 29900원
		// ~1000000 100*2+9900*3+990000*5 = 4979900원
		// 1000000~ 100*2+9900*3+990000*5+나머지*7

		if (totalCharge > 4979900) {
			usage += 1000000;
			totalCharge -= 4979900;
			usage += totalCharge / 7;
		} else if (totalCharge > 29900) {
			usage += 10000;
			totalCharge -= 29900;
			usage += totalCharge / 5;
		} else if (totalCharge > 200) {
			usage += 100;
			totalCharge -= 200;
			usage += totalCharge / 3;
		} else {
			usage += totalCharge / 2;
		}

		return usage;

	}

}
