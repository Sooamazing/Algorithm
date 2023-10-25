package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GoingUptheStairs {
	static int N;
	static int[] stairs;
	static int[] dp;
	static int max;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		stairs = new int[N+1];
		dp = new int[N+1];

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			stairs[i] = Integer.parseInt(st.nextToken());
		}//입력 완료

		dpStairs();
		System.out.println(dp[N]);

	}

	static void dpStairs() {
		for(int i=1;i<=N;i++){
			if(i==1){
				dp[1]=stairs[1];
			}else if(i==2){
				dp[2]=stairs[1]+stairs[2];
			}else{
				dp[i]= Math.max(dp[i-3]+stairs[i-1],dp[i-2])+stairs[i];
			}
		}
	}
}
