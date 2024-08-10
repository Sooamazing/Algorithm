package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 24-08-10 80min
// https://www.acmicpc.net/problem/16678
// 반례: https://www.acmicpc.net/board/view/32229
// 반례: https://www.acmicpc.net/board/view/32229
public class Insult {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int memberOfCongressNum
			= Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i < memberOfCongressNum; i++) {
			pq.add(Integer.parseInt(br.readLine()));
		}

		long ans = 0; // 범위 고려. 100,000*100,000
		int goalNum = 1;
		// 1부터 만족하는 숫자가 있는지 확인
		while (!pq.isEmpty()) {

			int poll = pq.poll();

			// 현재 숫자(i)와 같으면 더 처리할 필요없기 때문에 다 poll.
			while (!pq.isEmpty() && pq.peek() == goalNum) {
				pq.poll();
			}
			// 원래 명예 수치와 만들어야 하는 명예 수치만큼 빼기.
			// 같은 경우는 0이 더해지기 때문에 따로 조건 처리 X.
			ans += (poll - goalNum);

			goalNum++; // 만들어야 하는 숫자++
		}

		System.out.println(ans);

		// 풀이 3, sum, 1~n까지의 합 비교 - 틀림
		// 반례: https://www.acmicpc.net/board/view/103557
		// 1 1 3은 1 1 2가 되어야 함. (1+2+3)이 될 수 없음.
		// int[] honorScore = new int[memberOfCongressNum + 1];
		// int[] scoreCheck = new int[memberOfCongressNum + 1];
		// boolean[] scoreCheck = new boolean[memberOfCongressNum + 1];
		// PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		//
		// int max = 0;
		// int sum = 0;
		// int stdSum = 0;
		// for (int i = 0; i < memberOfCongressNum; i++) {
		// 	int curScore = honorScore[i] = Integer.parseInt(br.readLine());
		// 	sum += curScore; // 모든 score 합
		// 	max = Math.max(max, curScore); // 가장 큰 score
		// 	stdSum += (i + 1); // 1~n까지의 합
		// 	if (curScore > 1) {
		// 		pq.add(curScore); // 중복 score pq에 삽입.
		// 	}
		// }
		//
		// if (max >= memberOfCongressNum) {
		// 	System.out.println(sum - stdSum);
		// } else {
		// 	int nIdx = memberOfCongressNum;
		// 	while (max < nIdx) {
		// 		int poll = pq.poll();
		// 		if (nIdx - poll < 0) {
		// 			System.out.println("이상합니다.");
		// 		}
		// 		stdSum -= (nIdx - poll);
		// 		nIdx--;
		// 	}
		// 	System.out.println(sum - stdSum);
		// }

		// 풀이 - 1,2
		// int max = 0;
		// for (int i = 1; i <= memberOfCongressNum; i++) {
		// 	int score = Integer.parseInt(br.readLine());
		// 	// honorScore[i] = score;
		// 	// 중복 숫자가 있는 것까지 걸러내야 함. - !scoreCheck[score]
		// 	max = Math.max(max, score);
		// 	if (score <= memberOfCongressNum) {
		// 		scoreCheck[score]++;
		// 	}
		// 	pq.add(score);
		//
		// }
		// max = Math.min(max, memberOfCongressNum);
		//
		// // Arrays.sort(honorScore);
		//
		// int ans = 0;
		// int numIdx = 1;
		// while (!pq.isEmpty()) {
		// 	int poll = pq.poll();
		// 	while (numIdx <= memberOfCongressNum && scoreCheck[numIdx] > 0) {
		// 		numIdx++;
		// 	}
		// 	if (numIdx > max) {
		// 		break;
		// 	}
		// 	ans += (poll - numIdx);
		// }
		// // for (int i = 1; i <= memberOfCongressNum; i++) {
		// // 	if (!scoreCheck[i]) {
		// // 		// int cur = honorScore[memberOfCongressNum - i + 1];
		// // 		int cur = pq.poll();
		// // 		ans += (cur - i);
		// // 	}
		// // }

		// System.out.println(ans);

	}
}
