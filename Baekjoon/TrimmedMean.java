// https://www.acmicpc.net/problem/6986
package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TrimmedMean {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		double[] arr = new double[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Double.parseDouble(br.readLine()) * 100;
		}
		Arrays.sort(arr);

		double trimmedMean = 0;
		double correctionMean = 0;

		// trimmedMean: arr[K] ~ arr[arr.length-1-K]/(N-2*K)개
		// correctionMean: (arr[K]*K +arr[K] ~ arr[arr.length-1-K]+ arr[arr.length-1-K]*K)/(N)

		correctionMean += arr[K] * K;
		for (int i = K; i < arr.length - K; i++) {
			trimmedMean += arr[i];
		}
		correctionMean += (trimmedMean + arr[arr.length - 1 - K] * K);
		trimmedMean=Math.round(trimmedMean/(N-2*K));
		correctionMean=Math.round(correctionMean/N);
		System.out.printf("%.2f", (double)trimmedMean/100);
		System.out.println();
		System.out.printf("%.2f", (double)correctionMean/100);

	}
}
