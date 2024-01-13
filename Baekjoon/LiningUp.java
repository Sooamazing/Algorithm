// https://www.acmicpc.net/problem/10431

package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class LiningUp {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			String[] s = br.readLine().split(" ");
			sb.append(Integer.parseInt(s[0])).append(' ');

			int cnt = 0;
			List<Integer> list = new LinkedList<>();
			list.add(Integer.parseInt(s[1]));
			for (int i = 2; i < 21; i++) {
				int cur = Integer.parseInt(s[i]);
				int last = list.get(list.size() - 1);
				if (last < cur) {
					list.add(cur);
				} else {
					for (int j = 0; j < list.size(); j++) {
						if (cur < list.get(j)) {
							cnt += list.size() - j;
							list.add(j, cur);
							int a = 0;
							break;
						}
					}
				}
			}
			sb.append(cnt).append('\n');
		}

		System.out.println(sb);
	}
}
