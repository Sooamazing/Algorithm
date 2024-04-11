package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-04-11 40min
// https://www.acmicpc.net/problem/1614
public class YongsiksFinger {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int hurtFinger = Integer.parseInt(br.readLine());
		long max = Integer.parseInt(br.readLine());
		long sum = hurtFinger;

		switch (hurtFinger) {
			case 2:
				if (max == 0) {
					sum = hurtFinger;
				} else if (max % 2 == 1) {
					sum += ((8 * (max - 1) / 2) + 6);
				} else {
					sum += ((8 * (max) / 2));
				}
				break;
			case 3:
				if (max == 0) {
					sum = hurtFinger;
				} else if (max % 2 == 1) {
					sum += ((8 * (max - 1) / 2) + 4);
				} else {
					sum += ((8 * (max) / 2));
				}
				break;
			case 4:
				if (max == 0) {
					sum = hurtFinger;
				} else if (max % 2 == 1) {
					sum += ((8 * (max - 1) / 2) + 2);
				} else {
					sum += ((8 * (max) / 2));
				}
				break;
			default:
				if (max == 0) {
					sum = hurtFinger;
				} else {
					sum += ((8 * (max)));
				}
		}

		System.out.println(sum - 1);

		// int[] fingers = new int[5];
		// int idx = 0;
		// boolean front = true;
		// while (fingers[hurtFinger - 1] <= max) {
		//
		// 	if (front) {
		//
		// 		fingers[idx++]++;
		// 		if (idx == 5) {
		// 			front = false;
		// 			idx -= 2;
		// 		}
		//
		// 	} else {
		// 		fingers[idx--]++;
		// 		if (idx == -1) {
		// 			front = true;
		// 			idx += 2;
		// 		}
		// 	}
		// 	sum++;
		// }
		//
		// System.out.println(sum - 1);

	}
}
