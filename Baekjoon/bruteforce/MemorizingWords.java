package Baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-08-20 25min
// https://www.acmicpc.net/problem/18119
public class MemorizingWords {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int wordsNum = Integer.parseInt(st.nextToken());
		int queryNum = Integer.parseInt(st.nextToken());
		int[][] alphabetsNumOfWord = new int[wordsNum][26]; // 각 알파벳 숫자+총 길이
		int[][] results = new int[wordsNum][2]; // 0: 원래 길이, 1: 지금 길이
		// 시간 초과
		// Set[] wordsByAlphabetIdxSet = new Set[26]; // 각 알파벳이 들어간 단어의 idx 집합
		// for (int i = 0; i < 26; i++) {
		// 	wordsByAlphabetIdxSet[i] = new HashSet<Integer>();
		// }
		for (int i = 0; i < wordsNum; i++) {
			String s = br.readLine();
			int length = s.length();
			for (int j = 0; j < length; j++) {
				int alphabetIdx = s.charAt(j) - 'a';
				alphabetsNumOfWord[i][alphabetIdx]++;
				// wordsByAlphabetIdxSet[alphabetIdx].add(i);
			}
			results[i][1] = results[i][0] = length;
		}

		int tempRes = wordsNum;
		while (queryNum-- > 0) {
			st = new StringTokenizer(br.readLine());
			int cmd = Integer.parseInt(st.nextToken());
			int alphabetIdx = st.nextToken().charAt(0) - 'a';

			// Set<Integer> set = wordsByAlphabetIdxSet[alphabetIdx]; // 해당 알파벳이 포함된 단어 세트

			if (cmd == 1) {
				// alphabet을 잊음
				for (int i = 0; i < wordsNum; i++) {
					int forget = alphabetsNumOfWord[i][alphabetIdx]; // 잊을 알파벳 개수
					// 지금 길이가 원래 길이와 같고, 잊을 알파벳이 있다면 -> 완전하지 않은 알파벳 -> tempRes--
					if (results[i][0] == results[i][1] && forget > 0) {
						tempRes--;
					}
					// 잊음 처리.
					results[i][1] -= forget;
				}
			} else {
				// alphabet을 떠올림
				for (int i = 0; i < wordsNum; i++) {
					int recall = alphabetsNumOfWord[i][alphabetIdx]; // 기억할 알파벳 개수
					// 떠올림
					results[i][1] += recall;
					// 지금 길이가 원래 길이와 같고, 지금 기억해낸 거라면 -> 완전한 알파벳 -> tempRes++
					if (results[i][0] == results[i][1] && recall > 0) {
						tempRes++;
					}
				}
			}

			sb.append(tempRes).append("\n");
		}

		System.out.println(sb);

	}
}
