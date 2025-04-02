package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-04-02 95min
// https://www.acmicpc.net/problem/21317
// 참고: https://www.acmicpc.net/board/view/148907 - 반례로 이미 사용한 곳에서 이후 진행 시  1, 2 경우 더해주는 경우 추가
// 반례:
// 3
// 5000 5000
// 5000 5000
// 1
public class SteppingStoneCrossing {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());

		final int NOT_USED_VERY_BIG = 0;
		final int ALREADY_USED_VERY_BIG = 1;
		final int NEXT = 0;
		final int NEXT_NEXT = 1;
		// final int INF = 1_000_000_000; // Integer.MAX_VALUE 대신 적절한 큰 값 사용

		int[][] minEnergies = new int[total][2];
		int[][] stoneEnergy = new int[total - 1][2];

		// // minEnergies 배열을 무한대로 초기화
		// for (int i = 0; i < total; i++) {
		// 	minEnergies[i][NOT_USED_VERY_BIG] = INF;
		// 	minEnergies[i][ALREADY_USED_VERY_BIG] = INF;
		// }

		StringTokenizer st;
		for (int i = 0; i < total - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int nextJumpEnergy = Integer.parseInt(st.nextToken());
			int nextNextJumpEnergy = Integer.parseInt(st.nextToken());

			stoneEnergy[i][NEXT] = nextJumpEnergy;
			stoneEnergy[i][NEXT_NEXT] = nextNextJumpEnergy;
		}

		int veryBigEnergy = Integer.parseInt(br.readLine());
		// // 초기값 설정
		// minEnergies[0][NOT_USED_VERY_BIG] = 0;
		// if (total > 1) minEnergies[1][NOT_USED_VERY_BIG] = stoneEnergy[0][NEXT];
		// if (total > 2) {
		// 	minEnergies[2][NOT_USED_VERY_BIG] = Math.min(
		// 		minEnergies[1][NOT_USED_VERY_BIG] + stoneEnergy[1][NEXT],
		// 		stoneEnergy[0][NEXT_NEXT]
		// 	);
		// }
		//
		// for (int i = 3; i < total; i++) {
		// 	// 일반 점프 업데이트
		// 	minEnergies[i][NOT_USED_VERY_BIG] = Math.min(
		// 		minEnergies[i - 1][NOT_USED_VERY_BIG] + stoneEnergy[i - 1][NEXT],
		// 		minEnergies[i - 2][NOT_USED_VERY_BIG] + stoneEnergy[i - 2][NEXT_NEXT]
		// 	);
		//
		// 	// 매우 큰 점프를 사용한 경우
		// 	if (minEnergies[i - 3][NOT_USED_VERY_BIG] != INF) {
		// 		minEnergies[i][ALREADY_USED_VERY_BIG] = Math.min(
		// 			minEnergies[i][ALREADY_USED_VERY_BIG],
		// 			minEnergies[i - 3][NOT_USED_VERY_BIG] + veryBigEnergy
		// 		);
		// 	}
		//
		// 	// 매우 큰 점프 사용 후 일반 점프를 계속할 경우
		// 	minEnergies[i][ALREADY_USED_VERY_BIG] = Math.min(
		// 		minEnergies[i][ALREADY_USED_VERY_BIG],
		// 		Math.min(
		// 			minEnergies[i - 1][ALREADY_USED_VERY_BIG] + stoneEnergy[i - 1][NEXT],
		// 			minEnergies[i - 2][ALREADY_USED_VERY_BIG] + stoneEnergy[i - 2][NEXT_NEXT]
		// 		)
		// 	);
		// }
		//
		// System.out.println(Math.min(minEnergies[total - 1][NOT_USED_VERY_BIG], minEnergies[total - 1][ALREADY_USED_VERY_BIG]));

		for (int i = 1; i < total; i++) {
			if (i == 1) {
				minEnergies[i][NOT_USED_VERY_BIG] =
					stoneEnergy[i - 1][NEXT];
				continue;
			}
			if (i == 2) {
				minEnergies[i][NOT_USED_VERY_BIG] = Math.min(
					minEnergies[i - 1][NOT_USED_VERY_BIG] + stoneEnergy[i - 1][NEXT],
					stoneEnergy[i - 2][NEXT_NEXT]
				);
				continue;
			}

			if (i < 6) {
				minEnergies[i][NOT_USED_VERY_BIG] = Math.min(
					minEnergies[i - 1][NOT_USED_VERY_BIG] + stoneEnergy[i - 1][NEXT],
					minEnergies[i - 2][NOT_USED_VERY_BIG] + stoneEnergy[i - 2][NEXT_NEXT]
				);
				minEnergies[i][ALREADY_USED_VERY_BIG] =
					minEnergies[i - 3][NOT_USED_VERY_BIG] + veryBigEnergy;
				continue;
			}
			// 	// 일반 점프 업데이트
			// 	minEnergies[i][NOT_USED_VERY_BIG] = Math.min(
			// 		minEnergies[i - 1][NOT_USED_VERY_BIG] + stoneEnergy[i - 1][NEXT],
			// 		minEnergies[i - 2][NOT_USED_VERY_BIG] + stoneEnergy[i - 2][NEXT_NEXT]
			// 	);
			minEnergies[i][NOT_USED_VERY_BIG] = Math.min(
				minEnergies[i - 1][NOT_USED_VERY_BIG] + stoneEnergy[i - 1][NEXT],
				minEnergies[i - 2][NOT_USED_VERY_BIG] + stoneEnergy[i - 2][NEXT_NEXT]
			);

			// 	// 매우 큰 점프를 사용한 경우
			// 	if (minEnergies[i - 3][NOT_USED_VERY_BIG] != INF) {
			// 		minEnergies[i][ALREADY_USED_VERY_BIG] = Math.min(
			// 			minEnergies[i][ALREADY_USED_VERY_BIG],
			// 			minEnergies[i - 3][NOT_USED_VERY_BIG] + veryBigEnergy
			// 		);
			// 	}
			// 	// 매우 큰 점프 사용 후 일반 점프를 계속할 경우
			// 	minEnergies[i][ALREADY_USED_VERY_BIG] = Math.min(
			// 		minEnergies[i][ALREADY_USED_VERY_BIG],
			// 		Math.min(
			// 			minEnergies[i - 1][ALREADY_USED_VERY_BIG] + stoneEnergy[i - 1][NEXT],
			// 			minEnergies[i - 2][ALREADY_USED_VERY_BIG] + stoneEnergy[i - 2][NEXT_NEXT]
			// 		)
			// 	);
			// }
			minEnergies[i][ALREADY_USED_VERY_BIG] = Math.min(
				minEnergies[i - 3][NOT_USED_VERY_BIG] + veryBigEnergy,
				Math.min(
					minEnergies[i - 1][ALREADY_USED_VERY_BIG] + stoneEnergy[i - 1][NEXT],
					minEnergies[i - 2][ALREADY_USED_VERY_BIG] + stoneEnergy[i - 2][NEXT_NEXT])
			);
		}

		int result = 0;
		if (total > 3) {
			result =
				Math.min(minEnergies[total - 1][NOT_USED_VERY_BIG],
					minEnergies[total - 1][ALREADY_USED_VERY_BIG]);
		} else {
			result = minEnergies[total - 1][NOT_USED_VERY_BIG];
		}

		System.out.println(result);
	}
}