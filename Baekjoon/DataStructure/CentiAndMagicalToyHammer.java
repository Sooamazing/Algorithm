package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-07-25 20min
// https://www.acmicpc.net/problem/19638
public class CentiAndMagicalToyHammer {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int population = Integer.parseInt(st.nextToken());
		int centiH = Integer.parseInt(st.nextToken());
		int limit = Integer.parseInt(st.nextToken());
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		for (int i = 0; i < population; i++) {
			pq.add(Integer.parseInt(br.readLine()));
		}

		for (int i = 0; i < limit; i++) {
			int poll = pq.poll();
			if (poll < centiH) {
				// 마법의 뿅망치를 최소로 사용한 횟수
				System.out.println("YES\n" + i);
				return;
			} else {
				if (poll == 1) {
					// 1이면 더 줄어들 수 없음.
					System.out.println("NO\n" + 1);
					return;
				}
				pq.add(poll / 2);
			}
		}

		int poll = pq.poll();
		if (poll < centiH) {
			// 마법의 뿅망치를 최소로 사용한 횟수
			System.out.println("YES\n" + limit);
		} else {
			System.out.println("NO\n" + poll);
		}

	}
}
