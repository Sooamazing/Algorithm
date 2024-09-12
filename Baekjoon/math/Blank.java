package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import org.jetbrains.annotations.NotNull;

// 24-08-01 45min
// https://www.acmicpc.net/problem/1474
public class Blank {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int wordNum = Integer.parseInt(st.nextToken());
		int goalLength = Integer.parseInt(st.nextToken());
		int[] nextIdxesAtSentence = new int[wordNum];
		String[] words = new String[wordNum];
		int totalLength = 0;
		Node[] nodes = new Node[wordNum];
		for (int i = 0; i < wordNum; i++) {
			String str = br.readLine();
			sb.append(str);
			words[i] = str;
			nextIdxesAtSentence[i] = totalLength;
			nodes[i] = new Node(str, totalLength);
			totalLength += str.length();
		}

		int sameUnderBarNum = (goalLength - totalLength) / (wordNum - 1);
		for (int i = wordNum - 1; i > 0; i--) {
			// 거꾸로 해야 함.
			sb.insert(nextIdxesAtSentence[i], "_".repeat(sameUnderBarNum));
			nextIdxesAtSentence[i] += sameUnderBarNum;
			nodes[i].idx += sameUnderBarNum;
		}
		int restUnderBarNum = (goalLength - totalLength) % (wordNum - 1);
		Arrays.sort(nodes);
		for (int i = 0; i < restUnderBarNum; i++) {

			int curIdx = sb.indexOf(nodes[wordNum - i - 1].word);
			sb.insert(curIdx - 1, "_");

			// copilot
			// sb.insert(nodes[restUnderBarNum].idx, "_");
		}

		System.out.println(sb);

	}

	static class Node implements Comparable<Node> {
		String word;
		int idx;

		public Node(String word, int idx) {
			this.word = word;
			this.idx = idx;
		}

		@Override
		public int compareTo(@NotNull Node o) {
			// word의 charAt(idx) 값 비교, 각 str의 char 오름차순, 모든 char가 동일한데, 길이 차이나는 경우에는 길이가 짧은 것이 먼저.
			int wordLength = word.length();
			int oWordLength = o.word.length();
			int min = Math.min(wordLength, oWordLength);
			for (int i = 0; i < min; i++) {
				if (word.charAt(i) != o.word.charAt(i)) {
					return word.charAt(i) - o.word.charAt(i);
				}
			}
			return wordLength - oWordLength;
		}
	}

}
