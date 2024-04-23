package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-04-23 40min
// https://www.acmicpc.net/problem/2841
public class AliensGuitarPlaying {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int noteSize = Integer.parseInt(st.nextToken());
		int pretSize = Integer.parseInt(st.nextToken());

		PriorityQueue<Integer>[] pqs = new PriorityQueue[6 + 1];
		for (int i = 0; i < 7; i++) {
			pqs[i] = new PriorityQueue<>(Comparator.reverseOrder());
		}

		int result = 0;
		for (int i = 0; i < noteSize; i++) {
			st = new StringTokenizer(br.readLine());
			int rowNum = Integer.parseInt(st.nextToken());
			int pretNum = Integer.parseInt(st.nextToken());
			PriorityQueue<Integer> curPQ = pqs[rowNum];
			int curPeek = 0;
			if (curPQ.isEmpty()) {
				// 한 개도 없으면 넣기
				curPQ.add(pretNum);
				result++;
			} else {
				curPeek = curPQ.peek();
				if (curPeek < pretNum) {
					curPQ.add(pretNum);
					result++;
				} else if (curPeek > pretNum) {
					while (!curPQ.isEmpty() && curPeek > pretNum) {
						curPQ.poll();
						result++;
						if (!curPQ.isEmpty()) {
							curPeek = curPQ.peek();
						}
					}

					if (curPQ.isEmpty()) {
						// 한 개도 없으면 넣기
						curPQ.add(pretNum);
						result++;
					} else if (curPeek < pretNum) {
						curPQ.add(pretNum);
						result++;
					}

				}

				// 현재와 같은 경우 아무 일도 일어나지 않음.

			}

		}

		System.out.println(result);

	}
}
