// https://www.acmicpc.net/problem/22233
package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class KaheeWithKeywords {
	public static void main(String[] args) throws IOException {
		// 1 ≤N≤ 2×10^5
		// 1 ≤M≤ 2×10^5
		// 1 ≤ 글에 있는 키워드 개수 ≤ 10
		// 1 ≤ 키워드 길이 ≤ 10
		// 가희가 메모장에 적은 키워드 개수 N
		// 가희가 블로그에 쓴 글의 개수 M
		// x번째 글을 쓰고 난 후에 메모장에 남아 있는 키워드의 개수를 출력

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] splits = br.readLine().split(" ");
		int N = Integer.parseInt(splits[0]);
		int M = Integer.parseInt(splits[1]);

		Map<String, Integer> map = new HashMap<>();
		for(int i = 0 ; i <N;i++){
			String s = br.readLine();
			// map.putIfAbsent(s, 1);
			map.put(s, 1);
		}

		for(int i = 0;i<M;i++){
			splits = br.readLine().split(",");
			for(String s:splits){
				// if(map.containsKey(s)){
					map.remove(s);
				// }
			}
			sb.append(map.size()).append('\n');
		}

		System.out.println(sb);

	}
}
