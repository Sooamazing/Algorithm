package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class PeopleInWork {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		Set<String> set = new TreeSet<>(
			(o1, o2) -> o2.compareTo(o1)
		);

		for (int i = 0; i < N; i++) {
			String[] s = br.readLine().split(" ");
			if (s[1].equals("enter")) {
				set.add(s[0]);
			} else {
				set.remove(s[0]);
			}
		}
		List<String> list = set.stream().collect(Collectors.toList());

		// list.sort((o1, o2) -> o2.compareTo(o1));

		StringBuilder sb = new StringBuilder();
		for (String string : list) {
			sb.append(string).append("\n");
		}
		System.out.println(sb);

	}
}
