package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 24-04-14 35min
// https://www.acmicpc.net/problem/2252
public class SortTheLine {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int studentNum = Integer.parseInt(st.nextToken());
		int lineNum = Integer.parseInt(st.nextToken());
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < lineNum; i++) {
			st = new StringTokenizer(br.readLine());

			int low = Integer.parseInt(st.nextToken());
			int high = Integer.parseInt(st.nextToken());

			boolean lowExist = list.contains(Integer.valueOf(low));
			boolean highExist = list.contains(Integer.valueOf(high));
			int listSize = list.size();

			if (!lowExist && !highExist) {
				// 둘 다 없으면 순서대로 넣기
				list.add(low);
				list.add(high);
			} else if (lowExist && highExist) {
				// 둘 다 있으면 idx 추출해 순서 확인
				int lowIdx = list.indexOf(Integer.valueOf(low));
				int highIdx = list.indexOf(Integer.valueOf(high));
				if (lowIdx - highIdx > 0) {
					// 순서가 맞지 않으면 low를 high 뒤로 변경
					list.remove(Integer.valueOf(high));
					if (lowIdx == (listSize - 1)) {
						list.add(high);
					} else if (lowIdx == 0) {
						list.add(0, high);
					} else {
						list.add(lowIdx - 1, high);
					}
				}
			} else if (lowExist) {
				// 한 개만 있으면 둘 중 있는 것 뒤로
				int lowIdx = list.indexOf(Integer.valueOf(low));
				if (lowIdx == (listSize - 1)) {
					list.add(high);
				} else if (lowIdx == 0) {
					list.add(0, high);
				} else {
					list.add(lowIdx - 1, high);
				}
			} else if (highExist) {
				int highIdx = list.indexOf(Integer.valueOf(high));
				list.add(highIdx - 1, low);
			}

		}
		StringBuilder sb = new StringBuilder();
		for (int value : list) {
			sb.append(value).append(' ');
		}
		System.out.println(sb);
	}
}
