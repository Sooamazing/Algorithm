package Baekjoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

// 5
// 1 3
// 3 1
// 2 5
// 4 6
// 6 4
// 24-05-30 80min
// https://www.acmicpc.net/problem/2565
public class ElectricWire {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int wireNum = Integer.parseInt(br.readLine());
		// Wire[] wires = new Wire[wireNum];
		Map<Integer, Wire> wires = new HashMap<>();

		for (int i = 0; i < wireNum; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());

			wires.put(i, new Wire(start, end));
			Map<Integer, Integer> lines = wires.get(i).lines;

			// wires[i] = new Wire(start, end);
			// Map<Integer, Integer> lines = wires[i].lines;

			for (int j = 0; j < i; j++) {
				Wire tempWire = wires.get(j);
				int tempStart = tempWire.start;
				int tempEnd = tempWire.end;
				Map<Integer, Integer> tempLines = tempWire.lines;

				if ((end >= tempEnd && start <= tempStart)
					|| (end <= tempEnd && start >= tempStart)) {
					lines.put(j, 0);
					tempLines.put(i, 0);
				}

			}
		}

		// size가 바뀌면 자동으로 감지해서 정렬해 주는 자료구조는 없겠지..? ... pq 안 되겠지..?
		// List<Map.Entry<Integer, Wire>> list = wires.entrySet().stream()
		// 	.sorted((o1, o2) -> o2.getValue().lines.size() - o1.getValue().lines.size())
		// 	.collect(Collectors.toList());

		int result = 0;
		for (int i = 0; i < wireNum; i++) {
			List<Map.Entry<Integer, Wire>> list = wires.entrySet().stream()
				.sorted((o1, o2) -> o2.getValue().lines.size() - o1.getValue().lines.size())
				.collect(Collectors.toList());
			int key = list.get(0).getKey();
			Wire wire = wires.get(key);
			Map<Integer, Integer> lines = wire.lines;

			if (lines.isEmpty()) {
				continue;
			}

			for (int k : lines.keySet()) {
				wires.get(k).lines.remove(i);
			}
			wire.lines = new HashMap<>();
			result++;

		}

		System.out.println(result);

	}

	static class Wire implements Comparable<Wire> {
		int start;
		int end;
		Map<Integer, Integer> lines = new HashMap<>();

		public Wire(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(Wire o) {
			return o.lines.size() - lines.size();
		}
	}

}
