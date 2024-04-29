package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

// 24-04-29 30min
// https://www.acmicpc.net/problem/1461
public class Library {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int bookNum = Integer.parseInt(st.nextToken());
		int maxBookOnceNum = Integer.parseInt(st.nextToken());

		// pq와 list 중 선택 - idx 활용 위해 list 사용
		List<Integer> positiveList = new ArrayList<>();
		List<Integer> negativeList = new ArrayList<>();

		st = new StringTokenizer(br.readLine());
		int positiveAbsMax = 0;
		int negativeAbsMax = 0;
		for (int i = 0; i < bookNum; i++) {
			int curNum = Integer.parseInt(st.nextToken());
			if (curNum < 0) {
				negativeList.add(curNum * (-1));
				negativeAbsMax = Math.max(negativeAbsMax, curNum * (-1));
			} else if (curNum > 0) {
				positiveList.add(curNum);
				positiveAbsMax = Math.max(positiveAbsMax, curNum);
			}
		}

		Collections.sort(positiveList);
		Collections.sort(negativeList);
		int positiveSize = positiveList.size();
		int negativeSize = negativeList.size();
		int sum = 0;

		// 양수
		if (positiveSize < maxBookOnceNum
			&& positiveSize > 0) {
			// maxBookOnceNum보다 작으면 그냥 최댓값 더함.
			sum += positiveList.get(positiveSize - 1);
		} else {
			// while로 하는 게 더 가독성에 좋을 듯.
			for (int i = 0; (positiveSize - 1) - maxBookOnceNum * i >= 0; i++) {
				int curIdx = (positiveSize - 1) - maxBookOnceNum * i;
				sum += positiveList.get(curIdx);
			}
		}

		// 음수
		if (negativeSize < maxBookOnceNum
			&& negativeSize > 0) {
			// maxBookOnceNum보다 작으면 그냥 최댓값 더함.
			sum += negativeList.get(negativeSize - 1);
		} else {
			for (int i = 0; (negativeSize - 1) - maxBookOnceNum * i >= 0; i++) {
				int curIdx = (negativeSize - 1) - maxBookOnceNum * i;
				sum += negativeList.get(curIdx);
			}
		}

		sum *= 2;

		// 가장 먼 거리는 돌아오지 않아도 됨. for에서 아예 max 구해도 됐을 듯.
		if (positiveAbsMax - negativeAbsMax >= 0) {
			sum -= positiveAbsMax;
		} else {
			sum -= negativeAbsMax;
		}

		System.out.println(sum);

	}
}
