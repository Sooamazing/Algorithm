package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

// 25-04-09 25min
// https://www.acmicpc.net/problem/12026
public class BOJStreet {
	private static int[] minEnergies;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		char[] street = br.readLine().toCharArray();
		minEnergies = new int[total];

		List<Integer> bIndexes = new LinkedList<>();
		bIndexes.add(0);
		List<Integer> oIndexes = new LinkedList<>();
		List<Integer> jIndexes = new LinkedList<>();

		for (int i = 1; i < street.length; i++) {
			char currentStreetSign = street[i];
			if (currentStreetSign == 'B') {
				processByAllPreviousSigns(jIndexes, i, bIndexes);
				continue;
			}

			if (currentStreetSign == 'O') {
				processByAllPreviousSigns(bIndexes, i, oIndexes);
				continue;
			}

			processByAllPreviousSigns(oIndexes, i, jIndexes);

		}

		System.out.println(minEnergies[total - 1] == 0 ? -1 : minEnergies[total - 1]);
	}

	private static void processByAllPreviousSigns(List<Integer> prevIndexes, int currentIndex,
		List<Integer> currentIndexes) {
		if (!prevIndexes.isEmpty()) {
			int min = Integer.MAX_VALUE;
			for (int jIndex : prevIndexes) {
				min = (int)Math.min(min, minEnergies[jIndex] + Math.pow(currentIndex - jIndex, 2));
			}
			minEnergies[currentIndex] = min;
			currentIndexes.add(currentIndex);
		}
	}
}
