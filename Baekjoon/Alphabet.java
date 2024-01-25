// https://www.acmicpc.net/problem/1987
package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Alphabet {

	static int R, C, max = 0;
	static char[][] alphabet;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] split = br.readLine().split(" ");
		R = Integer.parseInt(split[0]);
		C = Integer.parseInt(split[1]);

		alphabet = new char[R][C];
		for (int i = 0; i < R; i++) {
			String s = br.readLine();
			for (int j = 0; j < C; j++) {
				alphabet[i][j] = s.charAt(j);
			}
		}

		// 전역 변수가 아니라 파라미터로 넘기는 게 핵심.
		Set<Character> set = new HashSet<>();
		set.add(alphabet[0][0]);
		dfs(0, 0, set);

		System.out.println(max);

	}

	private static void dfs(int x, int y, Set<Character> set) {
		int[] dx = {0, 0, -1, 1};
		int[] dy = {-1, 1, 0, 0};

		for (int i = 0; i < 4; i++) {

			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx < 0 || nx >= R || ny < 0 || ny >= C)
				continue;
			if (set.contains(alphabet[nx][ny]))
				continue;

			set.add(alphabet[nx][ny]);
			dfs(nx, ny, set);
			set.remove(alphabet[nx][ny]);
		}

		// 갈 곳이 없을 때 dfs max값 갱신
		max = Math.max(max, set.size());

	}
}
