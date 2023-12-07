package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bracketing {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] split = br.readLine().split("");

		int cnt = 0;
		int result=0;
		for (String s : split) {
			if (s.equals("(")){
				cnt++;
			}else if(cnt>0&&s.equals(")")){
				cnt--;
			}else if(cnt<=0&&s.equals(")")){
				result++;
			}else{
				System.out.println("else "+s);
			}
		}

		System.out.println(cnt+result);
	}
}
