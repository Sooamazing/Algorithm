package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 24-04-04
// https://www.acmicpc.net/problem/1021
public class RotatingQue {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int queSize = Integer.parseInt(st.nextToken()); // 1 <= queSize <= 50
		int selectionNum = Integer.parseInt(st.nextToken()); // 1 <= selectionNum <= queSize

		List<Integer> que = new ArrayList<>();
		for (int i = 0; i < queSize; i++) {
			que.add(i + 1);
		}

		int result = 0;
		int curIdx = 0;
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < selectionNum; i++) {

			int eraserNum = Integer.parseInt(st.nextToken());
			int curNum;
			int curSize = que.size();
			int tempIdx = curIdx;
			int distance = -1;

			do {

				curNum = que.get(tempIdx);
				tempIdx = (tempIdx + 1) % curSize;
				distance++;

			} while (curNum != eraserNum);

			curIdx = (tempIdx - 1) < 0
				? (curSize - 1)
				: (tempIdx - 1);

			que.remove(curIdx);

			curIdx = (curIdx == que.size())
				? 0
				: (curIdx % que.size());

			distance = Math.min(curSize - distance, distance);

			result += distance;

		}

		System.out.println(result);

	}
}
