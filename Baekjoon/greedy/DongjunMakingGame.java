package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-04-18 50min
// https://www.acmicpc.net/problem/2847
public class DongjunMakingGame {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int level = Integer.parseInt(br.readLine());
		int[] levels = new int[level];
		for (int i = 0; i < level; i++) {
			levels[i] = Integer.parseInt(br.readLine());
		}

		int result = 0;

		// 첫번째와 마지막의 차이는 최소 해당 수만큼 나야 함.
		if (Math.abs(levels[0] - levels[level - 1]) < level - 1) {
			result = (level - 1);
			levels[0] -= (level - 1);
		}

		for (int i = level - 2; i >= 0; i--) {
			int first = levels[0];
			int current = levels[i];
			int next = levels[i + 1];
			int distanceWithCurrentAndNext = next - current;
			int distanceWithFirstAndCurrent = current - first;
			int goalAtLeastDistanceWithFirstAndCurrent = i;
			boolean isCurrentBiggerThanGoal = distanceWithFirstAndCurrent >= goalAtLeastDistanceWithFirstAndCurrent;

			if (current < next && isCurrentBiggerThanGoal) {
				continue;
			}

			if (current >= next) {
				result += -(distanceWithCurrentAndNext - 1);
				levels[i] += distanceWithCurrentAndNext - 1;
			}

			distanceWithFirstAndCurrent = levels[i] - first;
			goalAtLeastDistanceWithFirstAndCurrent = i;
			isCurrentBiggerThanGoal = distanceWithFirstAndCurrent >= goalAtLeastDistanceWithFirstAndCurrent;
			if (!isCurrentBiggerThanGoal) {
				result += (i - 1);
				levels[0] -= (i - 1);
			}

			// 첫번째
			if (i == 0 && next - levels[0] <= 0) {
				result += (levels[0] - (next - 1));
				levels[0] = next - 1;
			}
		}

		System.out.println(result);
	}
}
