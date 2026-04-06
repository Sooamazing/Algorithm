
package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-04-02 5min
// https://comain.tistory.com/m/48
// https://www.acmicpc.net/problem/16199
public class CalcAge {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//태어난 날
		StringTokenizer st = new StringTokenizer(br.readLine());
		int y1 = Integer.parseInt(st.nextToken());
		int m1 = Integer.parseInt(st.nextToken());
		int d1 = Integer.parseInt(st.nextToken());
		//해당 날짜
		st = new StringTokenizer(br.readLine());
		int y2 = Integer.parseInt(st.nextToken());
		int m2 = Integer.parseInt(st.nextToken());
		int d2 = Integer.parseInt(st.nextToken());
		//연 나이
		int age = y2 - y1;
		
		//연도가 같을 경우, 연도가 다를때 달이 같고 다른 경우 등 조건을 걸고 출력
		if(y1 == y2) {
			System.out.println(age);
		}else{
			if(m1 > m2) {
				System.out.println(age - 1);
			}else if(m1 == m2){
				if(d1 <= d2) {
					System.out.println(age);
				}else {
					System.out.println(age - 1);
				}
			}else{
				System.out.println(age);
			}
		}
		System.out.println(age + 1);
		System.out.println(age);
	}

}
