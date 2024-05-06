package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

// 24-05-06 40min
// https://www.acmicpc.net/problem/1092
public class Ship {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int shipNum = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> shipList = new ArrayList<>();
		for (int i = 0; i < shipNum; i++) {
			shipList.add(Integer.parseInt(st.nextToken()));
		}

		int boxNum = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		List<Integer> boxList = new ArrayList<>();
		for (int i = 0; i < boxNum; i++) {
			boxList.add(Integer.parseInt(st.nextToken()));
		}

		Collections.sort(shipList, Comparator.reverseOrder());
		Collections.sort(boxList);

		// 이 예외 처리를 하지 않으면 메모리 초과 발생.
		if (shipList.get(0) < boxList.get(boxNum - 1)) {
			System.out.println(-1);
			return;
		}

		int result = 0;
		while (!boxList.isEmpty()) {

			for (int num : shipList) {

				// 중간에라도 빌 수 있으니 확인 후 break
				if (boxList.isEmpty()) {
					break;
				}

				// 이진 탐색으로 크레인이 들 수 있는 가장 무거운 박스 찾기
				int idx = Collections.binarySearch(boxList, num);

				if (idx < -1) {
					// 해당 무게가 없는 경우, 근사한 작은 값을 싣기.
					int curIdx = -(idx + 1);
					// if (curIdx > boxList.size()) {
					// 	System.out.println(-1);
					// 	return;
					// }
					boxList.remove(curIdx - 1);
				} else if (idx > -1) {
					boxList.remove(idx);
				}

				// idx == -1이면 0번째 인덱스에 삽입해야 하는 경우, 무게보다 큰 건 크레인에 실을 수 없음.
			}
			result++;
		}

		System.out.println(result);

	}
}
