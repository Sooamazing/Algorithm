// https://www.acmicpc.net/problem/2108

package Baekjoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Statistics {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N];
		Map<Integer, Integer> map = new HashMap<>();
		int sum = 0;

		for (int i = 0; i < N; i++) {
			int cur = arr[i] = Integer.parseInt(br.readLine());

			// sum
			sum += cur;

			// 각 숫자의 빈도 cnt
			// putIfAbsent 등 사용해 보기.
			if (map.containsKey(cur)) {
				int temp = map.get(cur).intValue();
				map.put(cur, temp + 1);
			} else {
				map.put(cur, 1);
			}

		}
		Arrays.sort(arr);
		// 입력 및 정렬 완료

		int length = arr.length;

		// 산술 평균: N개의 수들의 합을 N으로 나눈 값
		// 소수점 이하 첫째 자리에서 반올림한 값
		double meanTemp = (double) sum / length;
		int mean = (int) Math.round(meanTemp);
		// String mean = String.format("%.0f", meanTemp);
		sb.append(mean).append("\n");

		// 중앙값: N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
		int midian = arr[(length / 2)];
		sb.append(midian).append("\n");

		// 최빈값: N개의 수들 중 가장 많이 나타나는 값

		//Value 기준 내름차순 정렬
		// .sorted(Map.Entry.comparingByValue()) 오름차순
		List<Map.Entry<Integer, Integer>> collect = map.entrySet().stream()
			.sorted((o1, o2) -> {
					if (o1.getValue() == (o2.getValue())) {
						return o1.getKey() - o2.getKey();
					}
					return o2.getValue() - o1.getValue();
				}
			)
			.collect(Collectors.toList());
		// keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
		// List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
		// entryList.sort(((o1, o2) -> map.get(o2.getKey()) - map.get(o1.getKey())));

		// keySet.size()!=1 하나인 경우 고려!! 입력값 범위 확인!
		int mode = 4001;
		if (collect.size() != 1 && collect.get(0).getValue() == collect.get(1).getValue()) {
			mode = collect.get(1).getKey();
		} else {
			mode = collect.get(0).getKey();
		}
		sb.append(mode).append("\n");

		// 범위: N개의 수들 중 최댓값과 최솟값의 차이
		int range = arr[N - 1] - arr[0];
		sb.append(range).append("\n");

		System.out.println(sb);

	}
}
