package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-05-15 30min, 25-03-02 15min
// https://www.acmicpc.net/problem/16194
// 9
// 100 1 5 1 100 100 100 100 100
public class BuyingCard2 {

	static int wantedCardNum;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		wantedCardNum = Integer.parseInt(br.readLine());

		// Point x = 가격, y = 개수
		// PriorityQueue<Point> pq = new PriorityQueue<>((o1, o2) -> {
		// 	// lambda int 반환 필요 -> 왜?
		// 	double result = (double)o1.x / o1.y - (double)o2.x / o2.y;
		// 	if (result > 0) {
		// 		return 1;
		// 	} else if (result < 0) {
		// 		return -1;
		// 	}
		// 	return 0;
		// });

		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[wantedCardNum];
		int[] dp = new int[wantedCardNum + 1];
		for (int i = 1; i <= wantedCardNum; i++) {
			// 우선, 한 팩짜리를 살 경우가 가장 적다고 가정.
			dp[i] = Integer.parseInt(st.nextToken());

			// 다른 것들과 조합해서 구매하는 게 더 좋을지 계산
			for (int j = 1; j <= i / 2; j++) {
				dp[i] = Math.min(dp[i], dp[j] + dp[i - j]);
			}
		}

		System.out.println(dp[wantedCardNum]);

		// for (int i = 1; i <= wantedCardNum; i++) {
		// 	int curPrice = Integer.parseInt(st.nextToken());
		// 	arr[i - 1] = curPrice;
		// 	// pq.add(new Point(curPrice, i));
		// }

		// int resultPrice = 0;
		// int paidCardNum = 0;
		// while (paidCardNum != wantedCardNum) {
		// 	Point poll = pq.poll();
		// 	int price = poll.x;
		// 	int number = poll.y;
		// 	int curDeck = wantedCardNum / number;
		// 	wantedCardNum -= (curDeck * number);
		// 	resultPrice += (curDeck * price);
		// }
		// minResult = Integer.MAX_VALUE;
		// backtracking(1, 0);
		// System.out.println(minResult);

	}

	static int minResult;

	static void backtracking(int depth, int price) {
		if (depth == wantedCardNum) {
			minResult = Math.min(minResult, price);
			return;
		}

		for (int i = 0; i < wantedCardNum; i++) {
			if (price + arr[i] > minResult || depth + i + 1 > wantedCardNum) {
				continue;
			}
			backtracking(depth + i + 1, price + arr[i]);
		}
	}
}

