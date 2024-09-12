package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 5 0 0 4 0 1 3 0 2 1 1 3 0 1 4 0 2 3
// 5 0 0 4 0 1 3 0 2 1 0 4 1 0 4 1 0 4
// 5 0 0 4 0 1 3 0 2 1 1 3 0 1 4 1 0 4
// 5 0 0 4 0 1 3 0 2 0 2 3 0 2 3 0 2 3
// 반례 참고: https://www.acmicpc.net/board/view/138747
// 24-07-10 60min
// https://www.acmicpc.net/problem/6987
public class WorldCup {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		// Queue<Integer> wins = new LinkedList<>();
		// List<Integer> sames = new ArrayList<>();
		// Stack<Integer> loses = new Stack<>();

		int[] wins = new int[6 + 1];
		int[] sames = new int[6 + 1];
		int[] loses = new int[6 + 1];

		for (int i = 0; i < 4; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= 6; j++) {
				int win = Integer.parseInt(st.nextToken());
				int same = Integer.parseInt(st.nextToken());
				int lose = Integer.parseInt(st.nextToken());

				wins[j] = win;
				sames[j] = same;
				loses[j] = lose;

				// if (win != 0) {
				// 	while (win-- > 0) {
				// 		wins.add(j);
				// 	}
				// }
				// if (same != 0) {
				// 	while (same-- > 0) {
				// 		sames.add(j);
				// 	}
				// }
				// if (lose != 0) {
				// 	while (lose-- > 0) {
				// 		loses.push(j);
				// 	}
				// }

			}

			boolean isPossible = true;

			// 승, 패 1번째 시도
			// 승과 패의 수가 다르면 불가능한 결과
			// if (wins.size() != loses.size()) {
			// 	sb.append("0 ");
			// 	continue;
			// }

			// 승, 패의 경기가 같은 건 불가능함.
			// while (!wins.isEmpty()) {
			// 	int winPoll = wins.poll();
			// 	int losePop = loses.pop();
			// 	if (winPoll == losePop) {
			// 		sb.append("0 ");
			// 		isPossible = false;
			// 		break;
			// 	}
			// }

			// 승, 패 2번째 시도
			// 5 0 0 4 0 1 3 0 2 1 0 4 1 0 4 1 0 4 - idx 하나 차이로도 해결 불능.
			// 승, 패 경기 같은지 다른지
			// int cur = 1;
			// int next = 2;
			// while (cur <= 6) {
			//
			// 	// 승, 패가 같은 경기는 존재 불능.
			// 	if (cur == next) {
			// 		isPossible = false;
			// 		break;
			// 	}
			//
			// 	int win = wins[cur];
			// 	int lose = loses[next];
			//
			// 	if (win > lose) {
			// 		loses[next] = 0;
			// 		next = (next + 1) > 6 ? 1 : (next + 1);
			// 		wins[cur] = win - lose;
			// 	} else if (win < lose) {
			// 		wins[cur] = 0;
			// 		loses[next] = lose - win;
			// 		cur++;
			// 	} else {
			// 		// 같은 경우
			// 		wins[cur] = 0;
			// 		cur++;
			// 		loses[next] = 0;
			// 		next = (next + 1) > 6 ? 1 : (next + 1);
			// 	}
			// }

			if (!isPossible) {
				sb.append("0 ");
				continue;
			}

			// 무승부 1번째 시도
			// 무승부 총 횟수가 홀수는 불가능
			// if (sames.size() % 2 == 1) {
			// 	sb.append("0 ");
			// 	continue;
			// }
			//
			// int start = 0;
			// int end = sames.size() - 1;
			// while (start < end) {
			// 	if (sames.get(start) == sames.get(end)) {
			// 		// 같은 나라끼리 무승부는 불가능
			// 		sb.append("0 ");
			// 		isPossible = false;
			// 		break;
			// 	}
			// 	start++;
			// 	end--;
			// }
			//

			// 무승부 2번째 시도
			// int start = 1;
			// int end = 6;
			// while (start <= end) {
			//
			// 	// 같은 나라끼리 무승부는 불가능.
			// 	if (start == end) {
			// 		isPossible = false;
			// 		break;
			// 	}
			//
			// 	int sStart = sames[start];
			// 	int sEnd = sames[end];
			//
			// 	if (sStart > sEnd) {
			// 		sames[end] = 0;
			// 		end--;
			// 		sames[start] = sStart - sEnd;
			// 	} else if (sStart < sEnd) {
			// 		sames[start] = 0;
			// 		start++;
			// 		sames[end] = sEnd - sStart;
			// 	} else {
			// 		// 같은 경우
			// 		sames[start] = 0;
			// 		start++;
			// 		sames[end] = 0;
			// 		end--;
			// 	}
			// }

			if (isPossible) {
				sb.append("1 ");
			} else {
				sb.append("0 ");
			}

		}

		System.out.println(sb);

	}
}
