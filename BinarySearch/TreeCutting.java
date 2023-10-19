package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TreeCutting {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		long M = Integer.parseInt(st.nextToken());
		long[] arr = new long[N];
		long max = 0;

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i] > max) {
				max = arr[i];
			}
		}//입력 및 초기화 완료

		long downPtr = 0;
		long upPtr = max;
		long centerPtr = (downPtr + upPtr) / 2;
		long woodSum;
		long minWoodSub = Integer.MAX_VALUE;
		long maxCenterPtr = 0;

		while (true) {

			woodSum = 0;
			for (int i = 0; i < N; i++) {
				woodSum += ((arr[i] - centerPtr) > 0 ? arr[i] - centerPtr : 0);
			}
			if (woodSum >= M) {
				//가져가는 나무 >= 가져가기로 마음먹은 나무
				if (woodSum - M < minWoodSub) {
					minWoodSub = woodSum - M;
					maxCenterPtr = centerPtr;
				}
				downPtr = centerPtr + 1;
				centerPtr = (downPtr + upPtr) / 2;

			} else if (woodSum < M) {
				upPtr = centerPtr - 1;
				centerPtr = (downPtr + upPtr) / 2;
			}

			if (upPtr < downPtr) {
				break;
			}

		}
		System.out.println(maxCenterPtr);

	}
}
