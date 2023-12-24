// https://www.acmicpc.net/problem/11651
package Baekjoon;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortGraph2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		Point[] points = new Point[N];
		for(int i = 0 ; i < N ; i++){
			String[] split = br.readLine().split(" ");
			points[i] = new Point(
				Integer.parseInt(split[0]),
				Integer.parseInt(split[1])
			);
		}

		Arrays.sort(points, (o1, o2)->{
			if(o1.y==o2.y){
				return o1.x-o2.x;
			}
			return o1.y-o2.y;
		});

		for(int i = 0 ; i < N ; i++){
			sb.append(points[i].x).append(' ').append(points[i].y).append('\n');
		}
		System.out.println(sb);

	}
}
