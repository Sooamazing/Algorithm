package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-10-22 10min
// https://www.acmicpc.net/problem/14681
public class PickingTheQuadrant {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());

		int y = Integer.parseInt(br.readLine());

		int quadrant = 0;

		if (x > 0 && y > 0) {

			quadrant = 1;

		} else if (x < 0 && y > 0) {

			quadrant = 2;

		} else if (x < 0 && y < 0) {

			quadrant = 3;

		} else {

			quadrant = 4;

		}

		System.out.println(quadrant);

	}

}