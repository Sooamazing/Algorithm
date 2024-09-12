package Baekjoon.math;

import java.awt.*;
import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-05-15 10min
// https://www.acmicpc.net/problem/11758
public class Ccw {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int p1x = Integer.parseInt(st.nextToken());
		int p1y = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int p2x = Integer.parseInt(st.nextToken());
		int p2y = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int p3x = Integer.parseInt(st.nextToken());
		int p3y = Integer.parseInt(st.nextToken());

		Point point = new Point(p1x, p1y);
		Point2D.Double.distance(p1x, p1y, p2x, p2y);
	}
}
