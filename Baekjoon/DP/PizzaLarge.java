package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// 25-04-10 60min
// https://www.acmicpc.net/problem/14607
// 참고: https://www.acmicpc.net/board/view/20929
// 참고2: https://www.acmicpc.net/source/89458930
public class PizzaLarge {
	private static Map<Integer, Long> map = new HashMap<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int pizzaTop = Integer.parseInt(br.readLine());
		// long totalPleasure = (long)pizzaTop * (pizzaTop - 1) / 2;

		// 메모리 초과 - 3 (98%...)
		map.put(1, 0L);
		map.put(2, 1L);
		long totalPleasure = getPleasure(pizzaTop);

		// 메모리 초과 -2
		// int length = pizzaTop / 2 + pizzaTop % 2 + 1;
		// long[] pleasures = new long[length];
		// if (pizzaTop >= 2) {
		// 	pleasures[2] = 1;
		// }
		// for (int i = 3; i < length; i++) {
		// 	int half1 = i / 2;
		// 	int half2 = i / 2 + i % 2;
		// 	pleasures[i] = ((long)half1 * half2) + pleasures[half1] + pleasures[half2];
		// }

		// 메모리 초과 - 1
		// Queue<Integer> que = new LinkedList<>();
		// que.add(pizzaTop);
		// while (!que.isEmpty()) {
		// 	int poll = que.poll();
		// 	int half1 = poll / 2;
		// 	int half2 = poll / 2 + poll % 2;
		// 	totalPleasure += ((long)half1 * half2);
		// 	if (half1 != 1) {
		// 		que.add(half1);
		// 	}
		// 	if (half2 != 1) {
		// 		que.add(half2);
		// 	}
		// }
		// int half1 = pizzaTop / 2;
		// int half2 = pizzaTop / 2 + pizzaTop % 2;
		// totalPleasure = ((long)half1 * half2) + (pleasures[half1] + pleasures[half2]);

		System.out.println(totalPleasure);
	}

	private static long getPleasure(int currentTop) {
		if (map.containsKey(currentTop)) {
			return map.get(currentTop);
		}

		int half1 = currentTop / 2;
		int half2 = currentTop / 2 + currentTop % 2;

		// 이렇게 따로 관리해서 98% 메모리 초과...
		// long pleasureOfHalf1;
		// long pleasureOfHalf2;
		// if (!map.containsKey(half1)) {
		// 	pleasureOfHalf1 = getPleasure(half1);
		// } else {
		// 	pleasureOfHalf1 = map.get(half1);
		// }
		// if (!map.containsKey(half2)) {
		// 	pleasureOfHalf2 = getPleasure(half2);
		// } else {
		// 	pleasureOfHalf2 = map.get(half2);
		// }
		// long currentPleasure = ((long)half1 * half2) + pleasureOfHalf1 + pleasureOfHalf2;
		long currentPleasure = ((long)half1 * half2) + getPleasure(half1) + getPleasure(half2);
		map.put(currentTop, currentPleasure);
		return currentPleasure;
	}
}
