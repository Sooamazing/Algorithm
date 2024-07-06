package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// 24-07-06 15min
// https://www.acmicpc.net/problem/2002
public class Overtake {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int carNum = Integer.parseInt(br.readLine());

		boolean[] pass = new boolean[carNum];
		Map<String, Integer> carInOrder = new HashMap<>();
		for (int i = 0; i < carNum; i++) {
			carInOrder.put(br.readLine(), i);
		}

		int shouldOutIdx = 0;
		int ans = 0;
		int outCarNum = carNum;
		while (outCarNum-- > 0) {
			int carInOrderIdx = carInOrder.get(br.readLine());
			pass[carInOrderIdx] = true;
			if (shouldOutIdx != carInOrderIdx) {
				// 나와야 할 순서와 같지 않다면 추월
				ans++;
			} else {
				// 순서에 맞게 나왔다면, 다음 순서로 Idx 조정
				// idx 초과 방지 위해 shouldOutIdx < carNum 추가
				while (shouldOutIdx < carNum
					&& pass[shouldOutIdx]) {
					// 방문하지 않은 다음 나와야 하는 차 Idx까지 while
					shouldOutIdx++;
				}
			}
		}

		System.out.println(ans);

	}
}
