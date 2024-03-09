package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/19532
public class MathIsNonFaceToFaceLecture {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] split = br.readLine().split(" ");

		int a = Integer.parseInt(split[0]);
		int b = Integer.parseInt(split[1]);
		int c = Integer.parseInt(split[2]);
		int d = Integer.parseInt(split[3]);
		int e = Integer.parseInt(split[4]);
		int f = Integer.parseInt(split[5]);

		for (int i = -999; i <= 999; i++) {
			for (int j = -999; j <= 999; j++) {
				if (((a * i + b * j) == c)
					&& ((d * i + e * j) == f)) {

					System.out.println(i + " " + j);
					return;

				}
			}
		}
	}
}
