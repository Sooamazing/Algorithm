package Baekjoon.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

// 24-08-26 21:30
// https://www.acmicpc.net/problem/17245
public class ServerRoom {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		// List<Integer> heightList = new ArrayList<>();
		Map<Integer, Long> map = new TreeMap<>();
		// int[] heights = new int[10000001];

		StringTokenizer st;
		long total = 0;
		int maxH = 0;
		int cnt = 0;
		for (int i = 0; i < size; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < size; j++) {
				int num = Integer.parseInt(st.nextToken());
				if (num != 0) {
					cnt++;
					// heightList.add(num);
					total += num;
					maxH = Math.max(maxH, num);
					map.put(num, map.getOrDefault(num, 0L) + 1);
					// heights[num]++;
				}
			}
		}
		if (maxH == 0) {
			System.out.println(0);
			return;
		}
		// Collections.sort(heightList);
		// ArrayStoreExc
		// int[] heightArr = heightList.toArray(new int[heightList.size()]);
		// int[] heightArr = heightList.stream().mapToInt(i -> i).toArray();
		// int[] heightArr = heightList.stream().mapToInt(Integer::intValue).toArray();

		// long[][] mapArr = map.entrySet().toArray(new long[map.size()][2]);
		long[][] mapArr = map.entrySet()
			.stream()
			.map(e -> new long[] {e.getKey(), e.getValue()})
			.toArray(long[][]::new);
		long[] sums = new long[map.size()];
		long[] cnts = new long[map.size()];
		sums[0] = mapArr[0][0] * mapArr[0][1];
		cnts[0] = mapArr[0][1];
		cnts[map.size() - 1] = cnt;
		long goal = total / 2;
		for (int i = 1; i < map.size(); i++) {
			sums[i] = sums[i - 1] + mapArr[i][1] * mapArr[i][0];
			cnts[i] = cnts[i - 1] + mapArr[i][1];
			long l = sums[i] + (cnts[map.size() - 1] - cnts[
				i]) * mapArr[i][0];
			if (l >= goal) {
				System.out.println(mapArr[i][0]);
				return;
			}
		}
	}
}
