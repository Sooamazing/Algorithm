package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 3
 1
 100000
 10000000

 5
 1
 3
 5
 7
 9
 0
 */
// https://www.acmicpc.net/problem/2485
public class RoadsideTrees {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine()); // N>=3, N<=100,000, 나무의 수
		int[] trees = new int[N];
		List<Integer> distances = new ArrayList<>(); // 나무 사이의 거리, 중복 거리 계산 위해 list 사용
		int std = Integer.MAX_VALUE; // 최소값을 찾기 위한 변수, 최대 공약수는 특정 수보다 클 수 없음.

		trees[0] = Integer.parseInt(br.readLine());
		for (int i = 1; i < N; i++) {
			trees[i] = Integer.parseInt(br.readLine());
			int distance = (trees[i] - trees[i - 1]);
			distances.add(distance);

			// min, max/2 중 최소값 불가 -> 모두 같은 경우 틀림.
			std = Math.min(std, distance);
		}

		int result = 0;
		for (int i = std; i > 0; i--) {

			boolean allDivided = false;
			result = 0;

			for (int d : distances) {
				if (d % i == 0) {

					// 최대공약수로 나눈 몫에서 1을 뺀 값을 더함
					result += (d / i - 1);
					allDivided = true;
				} else {
					allDivided = false;
					break;
				}
			}

			// 모든 나무 사이의 거리가 i로 나누어 떨어지면 최소값을 찾은 것이므로 break
			if (allDivided) {
				break;
			}
		}

		System.out.println(result);

	}
}
