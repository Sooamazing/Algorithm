package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sequence {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		int cnt = 0;
		int max = Integer.MIN_VALUE;
		int sum = 0;

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int cur = arr[i] = Integer.parseInt(st.nextToken());
			sum += cur;
			if (cnt < K) {
				cnt++;
			} else {
				sum -= arr[i-K];
			}
			if(cnt==K){
				max = Math.max(max, sum);
			}
		}
		if(N==K){
			max=sum;
		}
		System.out.println(max);
	}
}
