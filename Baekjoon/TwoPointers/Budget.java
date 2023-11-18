// https://www.acmicpc.net/problem/2512
package Baekjoon.TwoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Budget {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int maxB = 0;
		int tempSum = 0;
		for(int i = 0; i<N;i++){
			tempSum+=arr[i]= Integer.parseInt(st.nextToken());
			maxB = Math.max(maxB, arr[i]);
		}
		int M = Integer.parseInt(br.readLine());

		// 입력 완료



		if(tempSum<=M){
			System.out.println(maxB);
			return;
		}

		int l = 1; // 1로 해야 함
		int r = maxB;

		// l < r X
		while(l <= r){
			int sum = 0;
			int m = (l+r)/2;

			for(int i = 0 ; i<N ; i++){
				if(arr[i]-m > 0){
					sum+=m;
				}else{
					sum+=arr[i];
				}
			}


			// 왜 각각 m+1, m-1 ?  r = m X ?
			if(sum <= M){
				l = m+1;
			}else{
				r = m-1;
			}

			System.out.println("l = " + l+", r = " + r+", m = " + m);
		}


		System.out.println(r);
	}
}
