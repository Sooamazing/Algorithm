package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class GirlGroupMasterJunsuk {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] s = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);
		Map<String, String> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String group = br.readLine();
			int groupNum = Integer.parseInt(br.readLine());
			for (int j = 0; j < groupNum; j++) {
				String member = br.readLine();
				map.put(member, group);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			String find = br.readLine();
			int std = Integer.parseInt(br.readLine());
			if (std == 1) {
				sb.append(map.get(find)).append("\n");
			} else if (std == 0) {

				map.keySet()
					.stream()
					.filter(t -> map.get(t).equals(find))
					.sorted(String::compareTo)
					.forEach(t -> sb.append(t).append("\n"));

			}

		}
		System.out.println(sb);
	}
}
