package Baekjoon.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CuttingLan {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		Long[] arr = new Long[K];

		Long max = 0L;
		for (int i = 0; i < K; i++) {
			arr[i] = Long.parseLong(br.readLine());
			max = Math.max(max, arr[i]);
		}//입력 및 초기화 완료

		//2%일 경우 틀림 - 자료형 Long!
		//런타임 에러 (/ by zero)
		//82% 틀림
		Long start = 1L;
		Long end = max;

		Long result = 0L;
		while (start <= end) {

			Long sum = 0L;
			Long mid = (start + end) / 2;
			// if (mid == 0L) {
			// 	break;
			// }
			for (int i = 0; i < K; i++) {
				sum += arr[i] / mid;
			}

			if (sum >= N) {
				result = Math.max(mid, result);
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		System.out.println(result);

	}
}
