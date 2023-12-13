// https://www.acmicpc.net/problem/25757

package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class MiniGameWithIms {

	// static final int Y = 2;
	// static final int F = 3;
	// static final int O = 4;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		String type = st.nextToken();
		// Y, F, O 같이 할 사람 수
		// static final 이용은 못 하나?
		Set<String> set = new HashSet<>();
		for (int i = 0; i < N; i++) {
			set.add(br.readLine());
		}


		// Y면 set 그대로 출력, F면 2개 구하는 조합, O면 3개 구하는 조합
		// 같이 했던 사람과는 하지 않음.

		switch (type) {
			// 2명
			case "Y":
				System.out.println(set.size());
				return;
			// 3명
			case "F":
				System.out.println(set.size()/2);
				return;
			// "O" = 4:
			default:
				System.out.println(set.size()/3);
		}


	}
}
