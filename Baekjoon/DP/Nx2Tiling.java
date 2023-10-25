package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Nx2Tiling {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		long[] dp = new long[N+1];
		//입력 및 초기화 완료

		if(N==1){
			dp[1]=1;
		} else if (N==2) {
			dp[1]=1;
			dp[2]=2;
		}else{
			dp[1]=1;
			dp[2]=2;
			for(int i = 3; i<N+1; i++){
				dp[i]=dp[i-1]+dp[i-2];
				dp[i]%=10007;
			}
		}
		//
		// for(int i=1;i<N+1;i++){
		// 	System.out.println("dp["+i +"]= " + dp[i]);
		// }
		System.out.println(dp[N]);

	}
}
