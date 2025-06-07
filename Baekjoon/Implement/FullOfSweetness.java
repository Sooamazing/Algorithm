package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-06-07 10min
// https://www.acmicpc.net/problem/17256
public class FullOfSweetness {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int aX = Integer.parseInt(st.nextToken());
		int aY = Integer.parseInt(st.nextToken());
		int aZ = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int cX = Integer.parseInt(st.nextToken());
		int cY = Integer.parseInt(st.nextToken());
		int cZ = Integer.parseInt(st.nextToken());

		int bX = 0;
		int bY = 0;
		int bZ = 0;
		final int MAX = 100;
		for (int x = 1; x <= MAX; x++) {
			for (int y = 1; y <= MAX; y++) {
				for (int z = 1; z <= MAX; z++) {
					if ((aZ + x) == cX && (aY * y) == cY && (aX + z) == cZ) {
						bX = x;
						bY = y;
						bZ = z;
					}
				}
			}
		}

		System.out.println(bX + " " + bY + " " + bZ);

	}
}
