package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnSale2plus1 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);
		int temp = 0;
		int cnt3 = 2;
		for (int i = N-1; i >=0; i--) {
			if(cnt3==0){
				cnt3=2;
				continue;
			}
			temp+=arr[i];
			cnt3--;
		}
		System.out.println(temp);

	}
}
