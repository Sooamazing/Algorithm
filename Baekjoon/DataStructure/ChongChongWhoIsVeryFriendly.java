package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// 24-10-05 5min
// https://www.acmicpc.net/problem/26069
public class ChongChongWhoIsVeryFriendly {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int meetNum = Integer.parseInt(br.readLine());
		Set<String> dance = new HashSet<>();
		dance.add("ChongChong"); // 총총이는 이미 춤을 춘다.

		for (int i = 0; i < meetNum; i++) {
			st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			String b = st.nextToken();

			if (dance.contains(a)) {
				dance.add(b);
			} else if (dance.contains(b)) {
				dance.add(a);
			}
		}

		System.out.println(dance.size());

	}
}
