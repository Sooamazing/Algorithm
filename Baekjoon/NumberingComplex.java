package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberingComplex {
	static Map<Integer, Integer> map;
	static int[][] complex;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		map = new HashMap<>();
		int N = Integer.parseInt(br.readLine());

		complex = new int[N + 2][N + 2];
		for (int i = 1; i < N + 1; i++) {
			String[] split = br.readLine().split("");
			for (int j = 1; j < N + 1; j++) {
				complex[i][j] = Integer.parseInt(split[j - 1]);
			}
		}

		int sequence = 2;
		for (int i = 1; i < N + 1; i++) {
			for (int j = 1; j < N + 1; j++) {
				if (complex[i][j] != 1) {
					continue;
				}
				map.put(sequence, 1);
				complex[i][j] = sequence;
				bfs(i, j, sequence);
				sequence++;
			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append(map.size()).append("\n");
		List<Map.Entry<Integer, Integer>> collect =
			new LinkedList<>(map.entrySet());
		collect.sort(Comparator.comparingInt(Map.Entry::getValue));

		for (int i = 0; i < collect.size(); i++) {
			sb.append(collect.get(i).getValue()).append("\n");
		}
		System.out.println(sb);

	}

	private static void bfs(int x, int y, int sequence) {

		Queue<int[]> que = new LinkedList<>();
		int[][] dxdy = new int[][] {
			{1, 0}, {-1, 0},
			{0, 1}, {0, -1}
		};

		que.add(new int[] {x, y});
		complex[x][y] = sequence;

		while (!que.isEmpty()) {
			int[] poll = que.poll();
			for (int i = 0; i < 4; i++) {
				int tempX = poll[0] + dxdy[i][0];
				int tempY = poll[1] + dxdy[i][1];

				if (complex[tempX][tempY] == 1) {
					complex[tempX][tempY] = sequence;
					que.add(new int[] {tempX, tempY});
					map.compute(sequence, (K, V) -> V + 1);
				}
			}

		}

	}
}
