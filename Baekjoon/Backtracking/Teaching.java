package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

// 24-04-16 13:50~15:13
// 반례: https://www.acmicpc.net/board/view/123600
// https://www.acmicpc.net/problem/1062
public class Teaching {

	private static int maxLetterSize;
	private static int maxAnswer;
	static boolean[] visited;
	static char[] alphaArr;
	static Set<Character> alphabetSet;
	static List<Set<Character>> tobeQualifiedWordsList;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int wordSize = Integer.parseInt(st.nextToken());
		maxLetterSize = Integer.parseInt(st.nextToken()) - 5;

		if (maxLetterSize < 0) {
			System.out.println(0);
			return;
		}
		temp = new char[maxLetterSize];
		tobeQualifiedWordsList = new LinkedList<>();
		boolean[] alphabetArr = new boolean[26];
		alphabetSet = new HashSet<>();
		int answer = 0;
		for (int i = 0; i < wordSize; i++) {
			String curWord = br.readLine();
			//
			// String antaSubstr = curWord.substring(4);
			// int ticaIdx = antaSubstr.indexOf("tica");
			// String allSubstr = antaSubstr.substring(0, ticaIdx);
			//
			// String replaceAll = allSubstr
			// 	.replace("a", "")
			// 	.replace("n", "")
			// 	.replace("t", "")
			// 	.replace("i", "")
			// 	.replace("c", "");

			// if (replaceAll.isBlank()) {
			// 	answer++;
			// } else {
			//
			// 	List<String> tobeQualifiedWordsList = new LinkedList<>();
			// 	tobeQualifiedWordsList.add(replaceAll);
			// 	Set<Character> set = new HashSet<>();
			// }

			int length = curWord.length();
			Set<Character> set = new HashSet<>();
			for (int j = 0; j < length; j++) {
				char cur = curWord.charAt(j);
				if (!(cur == 'a' || cur == 'n' || cur == 't' || cur == 'i' || cur == 'c')) {
					set.add(cur);
					alphabetArr[cur - 'a'] = true;
					alphabetSet.add(cur);
				}
			}

			if (set.isEmpty()) {
				answer++;
			} else {
				tobeQualifiedWordsList.add(set);
			}

		}

		// for(boolean bingo:alphabetArr){
		// 	if(bingo)
		// }
		int length = alphabetSet.size();
		if (tobeQualifiedWordsList.size() != 0) {
			visited = new boolean[length];
			alphaArr = new char[length];
			int idx = 0;
			for (int i = 0; i < 26; i++) {
				if (alphabetArr[i]) {
					alphaArr[idx++] = (char)(i + 'a');
				}
			}
			getMaxAnswer(0, 0);
		}
		answer += maxAnswer;
		System.out.println(answer);

	}

	static char[] temp;

	private static void getMaxAnswer(int depth, int curIdx) {
		if (depth == maxLetterSize) {
			int answer = 0;

			for (Set<Character> chars : tobeQualifiedWordsList) {
				// String ( h e l o) 돌기
				boolean isPossible = true;
				for (Character targetChar : chars) {
					if (Arrays.binarySearch(temp, targetChar) < 0) {
						isPossible = false;
						break;
					}
				}
				if (isPossible) {
					answer++;
				}
			}
			maxAnswer = Math.max(maxAnswer, answer);
			return;
		}

		int length = alphabetSet.size();
		for (int i = 0; i < length; i++) {
			if (!visited[i]) {
				visited[i] = true;
				temp[depth] = alphaArr[i];
				getMaxAnswer(depth + 1, i);
				visited[i] = false;
			}
		}
	}

}
