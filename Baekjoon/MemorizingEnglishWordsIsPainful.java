package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MemorizingEnglishWordsIsPainful {
	public static void main(String[] args) throws IOException {
		// 길이가 M 이상인 단어들만 외운다고 한다.
		// 자주 나오는 단어일수록 앞에 배치한다.
		// 	해당 단어의 길이가 길수록 앞에 배치한다.
		// 	알파벳 사전 순으로 앞에 있는 단어일수록 앞에 배치한다

		// 1<=N<=1000000, 1<= M <= 10

		// 화은이의 단어장에 들어 있는 단어를 단어장의 앞에 위치한 단어부터 한 줄에 한 단어씩 순서대로 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] split = br.readLine().split(" ");
		int N = Integer.parseInt(split[0]);
		int M = Integer.parseInt(split[1]);

		Map<String, Integer> words = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String s = br.readLine();

			if(s.length()<M){
				continue;
			}

			words.computeIfPresent(s, (k,v) -> (v+1));
			words.putIfAbsent(s, 1);
		}


		List<Map.Entry<String, Integer>> entryList = new LinkedList<>(words.entrySet());

		entryList.sort(((o1, o2) -> {
			if(words.get(o2.getKey()) == words.get(o1.getKey())){
				if(o2.getKey().length()==o1.getKey().length()){
					return o1.getKey().compareTo(o2.getKey());
				}
				return o2.getKey().length() - o1.getKey().length();
			}
			return words.get(o2.getKey()) - words.get(o1.getKey());
		}));

		for(Map.Entry<String, Integer> s: entryList){
			sb.append(s.getKey()).append('\n');
		}

		System.out.println(sb);
	}
}
