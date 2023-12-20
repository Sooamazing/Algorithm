package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class GroupWordsChecker {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();



		int T = Integer.parseInt(br.readLine());
		int cnt = 0 ;
		while (T-- > 0) {
			Set<String> set = new HashSet<>();
			String[] split = br.readLine().split("");
			String prev = "";
			boolean same = false;
			for (String s : split) {
				if (s.equals(prev)) {
					continue;
				} else if (set.contains(s)) {
					same=true;
					break;
				}
				set.add(s);
				prev=s;
			}
			if(!same){
				cnt++;
			}

		}
		System.out.println(cnt);

	}
}
