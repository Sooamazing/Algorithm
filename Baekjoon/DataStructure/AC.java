package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-05-09 55min
// https://www.acmicpc.net/problem/5430
// 반례 참고: https://www.acmicpc.net/board/view/140389
public class AC {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder resultSb = new StringBuilder();

		int testCase = Integer.parseInt(br.readLine());

		while (testCase-- > 0) {
			String cmd = br.readLine();
			int numSize = Integer.parseInt(br.readLine());
			String firstArrStr = br.readLine();
			firstArrStr = firstArrStr.substring(1, firstArrStr.length() - 1);
			StringTokenizer st = new StringTokenizer(firstArrStr, ",");
			int[] numArr = new int[numSize];
			for (int i = 0; i < numSize; i++) {
				numArr[i] = Integer.parseInt(st.nextToken());
			}

			if (numSize == 0 && cmd.contains("D")) {
				resultSb.append("error\n");
				continue;
			}
			int startIdx = 0;
			int endIdx = numArr.length - 1;
			boolean isReverse = false;
			boolean hasError = false;

			for (char c : cmd.toCharArray()) {
				if (c == 'R') {
					// 'R' reverse
					isReverse = !isReverse; // if 단순화!!
				} else {
					// 'D' delete
					if (startIdx > endIdx) {
						// error
						resultSb.append("error\n");
						hasError = true;
						break;
					} else {
						if (isReverse) {
							endIdx--;
						} else {
							startIdx++;
						}
					}
				}
			}

			if (!hasError) {
				resultSb.append("[");
				// 각 testCase에서의 , "," lastIndex 제거하기 위해 resultSb와 testSb 분리. - 하지 않는 경우, R-0-[]인 경우 이상한 답 출력.
				// 2
				// R
				// 3
				// [1,2,3]
				// R
				// 0
				// []
				StringBuilder tempSb = new StringBuilder();
				if (isReverse) {
					for (int j = endIdx; j >= startIdx; j--) {
						tempSb.append(numArr[j]).append(",");
					}
				} else {
					for (int j = startIdx; j <= endIdx; j++) {
						tempSb.append(numArr[j]).append(",");
					}
				}
				int lastIndex = tempSb.lastIndexOf(",");
				if (lastIndex != -1) {
					// 0개, R인 경우 고려 필요.
					// 1
					// R
					// 0
					// []
					tempSb.deleteCharAt(lastIndex);
				}
				resultSb.append(tempSb);
				resultSb.append("]\n");
			}

		}

		System.out.println(resultSb);

	}
}
