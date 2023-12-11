// https://www.acmicpc.net/problem/7568
package Baekjoon;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Frame {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		List<int[]> list = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			String[] split = br.readLine().split(" ");
			list.add(new int[] {Integer.parseInt(split[0]), Integer.parseInt(split[1]), i});
		}

		Collections.sort(list, (o1, o2) -> {
			if (o2[0] == o1[0]) {
				return o1[1] - o2[1];
			}
			return o1[0] - o2[0];
		});

		int[] result = new int[N];
		for (int i = 0; i < N; i++) {
			int[] std = list.get(i);
			int stdW = std[0];
			int stdH = std[1];
			int cnt = 0;
			for (int j = i+1; j < N; j++) {
				int[] cur = list.get(j);
				int curW = cur[0];
				int curH = cur[1];
				if (stdW < curW && stdH < curH) {
					cnt++;
				}
			}
			result[std[2]] = cnt+1;
		}
		for(int idx: result){
			sb.append(idx).append(' ');
		}

		System.out.println(sb);
	}

}


