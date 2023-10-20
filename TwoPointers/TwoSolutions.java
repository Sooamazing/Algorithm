package TwoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TwoSolutions {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		long[] solutionArr = new long[N];

		for (int i = 0; i < N; i++) {
			solutionArr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(solutionArr);
		//입력 및 초기화 완료

		long min = Integer.MAX_VALUE;
		int lPtr = 0;
		int rPtr = N - 1;
		int cPtr;
		int minLPtr = 0;
		int minRPtr = 0;

		while (lPtr < rPtr) {

			long temp = solutionArr[lPtr] + solutionArr[rPtr];
			cPtr = (lPtr + rPtr) / 2;
			long absTemp = Math.abs(temp);

			if (absTemp < min) {
				// System.out.print("min = " + min);
				min = absTemp;
				minLPtr = lPtr;
				minRPtr = rPtr;
				// System.out.println(", / minLPtr = " + minLPtr+", minRPtr = " + minRPtr+", absTemp = " + absTemp);
			}
			if (temp >= 0) {
				rPtr--;

			} else {
				lPtr++;
			}
		}
		System.out.print(solutionArr[minLPtr] + " ");
		System.out.println(solutionArr[minRPtr]);
	}
}
