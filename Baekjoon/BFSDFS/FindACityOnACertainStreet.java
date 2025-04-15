package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

// 25-04-15 30min
// https://www.acmicpc.net/problem/18352
public class FindACityOnACertainStreet {
	private static List[] list;
	private static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int city = Integer.parseInt(st.nextToken());
		int street = Integer.parseInt(st.nextToken());
		int goalDistance = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());

		// int[][] streets = new int[city + 1][city + 1];
		// {start, end, distance}
		// PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[2]));
		list = new List[city + 1];
		visited = new boolean[city + 1];
		for (int i = 1; i < city + 1; i++) {
			// list[i] = new LinkedList<>();
			list[i] = new ArrayList();
		}
		for (int i = 0; i < street; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list[a].add(b);
		}

		Set<Integer> results = bfs(start, goalDistance);
		for (int result : results) {
			sb.append(result).append("\n");
		}
		if (results.isEmpty()) {
			sb.append(-1);
		}
		System.out.println(sb);
	}

	private static Set<Integer> bfs(int start, int goalDistance) {
		Set<Integer> result = new TreeSet<>();
		// {currentCity, distance}
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {start, 0});
		visited[start] = true;
		while (!que.isEmpty()) {
			int[] poll = que.poll();
			int currentCity = poll[0];
			int distance = poll[1];
			if (distance == goalDistance) {
				result.add(currentCity);
				continue;
			}

			List<Integer> adjCities = list[currentCity];
			int length = adjCities.size();
			for (int i = 0; i < length; i++) {
				int adjCity = adjCities.get(i);
				if (visited[adjCity]) {
					continue;
				}
				visited[adjCity] = true;
				que.add(new int[] {adjCity, distance + 1});
			}
		}

		return result;
	}
}
