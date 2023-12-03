package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class PrinterQueue {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Map<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());

			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			// int[]: 입장 idx(PK), value
			List<int[]> list = new LinkedList<>();

			st = new StringTokenizer(br.readLine());
			int idx = 0;
			for (idx = 0; idx < N; idx++) {
				int curValue = Integer.parseInt(st.nextToken());
				list.add(new int[] {idx, curValue});
				map.computeIfPresent(curValue, (K, V) -> V + 1);
				map.putIfAbsent(curValue, 1);
			}

			// 순위 및 각 몇 개 있는지
			List<Map.Entry<Integer, Integer>> collect = map.entrySet().stream().collect(Collectors.toList());

			final int listIdx = 0;
			int mapIdx = 0;
			int result = 0;
			while (true) {

				int[] ints = list.get(listIdx);
				int curValue = ints[0];
				int curPriority = ints[1];
				if (curPriority < collect.get(mapIdx).getKey()) {

					// 현재 중요도보다 높은 순위가 있다면 제거 후 idx 다시 집어 넣기
					list.remove(listIdx);
					list.add(ints);

				} else {
					// 없다면 제거, result++,
					int[] remove = list.remove(listIdx);
					result++;
					// M번째가 나오면 break;
					if (remove[0]==M){
						break;
					}


					if(collect.get(mapIdx).getValue()==1){

						// 1개 있다면 다음 mapList로 넘어가기
						mapIdx++;

					}else{

						// 아니라면 value -1;
						collect.get(mapIdx).setValue(collect.get(mapIdx).getValue()-1);
					}

				}


			}
			sb.append(result).append('\n');

		}
		System.out.println(sb);

	}
}
