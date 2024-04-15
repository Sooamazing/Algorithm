package Baekjoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

// 8 3
// 1 3 3 3 2 2 2 1
// 24-04-15 120min
// https://www.acmicpc.net/problem/2910
public class FrequencySorting {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());

		int size = Integer.parseInt(st.nextToken());
		int range = Integer.parseInt(st.nextToken());

		Map<Long, Num> map = new HashMap<>();

		// int[] orders = new int[range + 1];
		// int[] frequencies = new int[range + 1];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < size; i++) {
			long curNum = Long.parseLong(st.nextToken());
			if (map.containsKey(curNum)) {
				Num num = map.get(curNum);
				num.plusFrequencyOne();
			} else {
				map.put(curNum, new Num(i + 1));
			}
		}

		List<Long> list = new java.util.ArrayList<>(map.keySet());
		list.sort((o1, o2) -> {
			Num num1 = map.get(o1);
			Num num2 = map.get(o2);
			if (num1.frequency == num2.frequency) {
				return num1.order - num2.order;
			}
			return num2.frequency - num1.frequency;
		});

		for (long num : list) {

			int pollSize = map.get(num).getFrequency();
			for (int i = 0; i < pollSize; i++) {
				sb.append(num).append(' ');
			}

		}

		// List<Integer> list = new LinkedList<>();
		// PriorityQueue<Integer> intPq = new PriorityQueue<>((o1, o2) -> {
		// 	if (frequencies[o1] == frequencies[o2]) {
		// 		return orders[o1] - orders[o2];
		// 	}
		// 	return frequencies[o2] - frequencies[o1];
		// });

		// st = new StringTokenizer(br.readLine());
		// for (int i = 0; i < size; i++) {
		// 	int curNum = Integer.parseInt(st.nextToken());
		// 	frequencies[curNum]++;
		// 	if (frequencies[curNum] == 1) {
		// 		orders[curNum] = i + 1;
		// 		list.add(curNum);
		// 	}
		// }
		// Collections.sort(list, ((o1, o2) -> {
		// 	if (frequencies[o1] == frequencies[o2]) {
		// 		return orders[o1] - orders[o2];
		// 	}
		// 	return frequencies[o2] - frequencies[o1];
		// }));
		// for (int idx : list) {
		// 	int pollSize = frequencies[idx];
		// 	for (int i = 0; i < pollSize; i++) {
		// 		sb.append(idx).append(' ');
		// 	}
		// }

		// while (!intPq.isEmpty()) {
		// 	int poll = intPq.poll();
		// 	int pollSize = frequencies[poll];
		// 	for (int i = 0; i < pollSize; i++) {
		// 		sb.append(poll).append(' ');
		// 	}
		// }

		System.out.println(sb);
	}

	private static class Num {

		private int frequency;

		private int order;

		Num(int order) {
			this.frequency = 1;
			this.order = order;
		}

		public int getFrequency() {
			return this.frequency;
		}

		public int plusFrequencyOne() {
			return this.frequency++;
		}

	}

}
