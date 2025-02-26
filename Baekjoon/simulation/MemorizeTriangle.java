package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-02-26 5min
// https://www.acmicpc.net/problem/17269
public class MemorizeTriangle {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int aAngle = Integer.parseInt(br.readLine());
		int bAngle = Integer.parseInt(br.readLine());
		int cAngle = Integer.parseInt(br.readLine());
		if (aAngle + bAngle + cAngle != 180) {
			// 삼각형 아님
			System.out.println("Error");
		} else if (aAngle == 60 && aAngle == bAngle && bAngle == cAngle) {
			// 정삼각형
			System.out.println("Equilateral");
		} else if (aAngle == bAngle || bAngle == cAngle || cAngle == aAngle) {
			// 이등변 삼각형
			System.out.println("Isosceles");
		} else {
			// 삼각형
			System.out.println("Scalene");
		}
	}
	
}
