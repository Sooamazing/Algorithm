package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FileCleanup {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String[] split = br.readLine().split("\\.");
			map.computeIfPresent(split[1], (K,V)-> V+1);
			map.putIfAbsent(split[1], 1);
		}

		List<Map.Entry<String, Integer>> collect = map.entrySet().stream().collect(Collectors.toList());
		Collections.sort(collect, ((o1, o2) -> {
			return o1.getKey().compareTo(o2.getKey());
		}));

		for(Map.Entry<String, Integer> item: collect){
			sb.append(item.getKey()).append(' ').append(item.getValue()).append('\n');
		}
		System.out.println(sb);
	}
}
