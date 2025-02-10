package Baekjoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

// 25-02-10 15min
// https://www.acmicpc.net/problem/1755
public class NumberPlay {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int minimum = Integer.parseInt(st.nextToken());
		int maximum = Integer.parseInt(st.nextToken());
		Map<String, Integer> map = new TreeMap<>();

		for (int i = minimum; i <= maximum; i++) {
			int num = i;
			StringBuilder noun = new StringBuilder();
			while (num != 0) {
				switch (num % 10) {
					case 0:
						noun.insert(0, "zero ");
						break;
					case 1:
						noun.insert(0, "one ");
						break;
					case 2:
						noun.insert(0, "two ");
						break;
					case 3:
						noun.insert(0, "three ");
						break;
					case 4:
						noun.insert(0, "four ");
						break;
					case 5:
						noun.insert(0, "five ");
						break;
					case 6:
						noun.insert(0, "six ");
						break;
					case 7:
						noun.insert(0, "seven ");
						break;
					case 8:
						noun.insert(0, "eight ");
						break;
					case 9:
						noun.insert(0, "nine ");
						break;
					default:
						break;
				}
				num /= 10;
			}
			map.put(noun.toString(), i);
		}

		int count = 0;
		for (int v : map.values()) {
			count++;
			sb.append(v).append(" ");
			if (count % 10 == 0) {
				sb.append("\n");
			}
		}

		System.out.println(sb);

	}
}
