// https://www.acmicpc.net/problem/10866

package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Deque {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		List<Integer> list = new ArrayList<>();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String[] split = br.readLine().split(" ");
			String cmd;
			int num = Integer.MAX_VALUE;
			if(split.length>1){
				cmd = split[0];
				num = Integer.parseInt(split[1]);
			}else{
				cmd = split[0];
			}


			switch (cmd){
				case "push_front":
					list.add(0, (Integer) num);
					break;
				case "push_back":
					list.add((Integer) num);	break;
				case "pop_front":
					if(list.isEmpty()){
						sb.append(-1).append('\n');
					}else{
						sb.append(list.remove(0)).append('\n');
					}	break;
				case "pop_back":
					if(list.isEmpty()){
						sb.append(-1).append('\n');
					}else{
						sb.append(list.remove(list.size()-1)).append('\n');
					}	break;
				case "size":
					sb.append(list.size()).append('\n');	break;
				case "empty":
					if(list.isEmpty()){
						sb.append(1).append('\n');
					}else{
						sb.append(0).append('\n');
					}	break;
				case "front":
					if(list.isEmpty()){
						sb.append(-1).append('\n');
					}else{
						sb.append(list.get(0)).append('\n');
					}	break;
				case "back":
					if(list.isEmpty()){
						sb.append(-1).append('\n');
					}else{
						sb.append(list.get(list.size()-1)).append('\n');
					}	break;
				default: 	break;
			}

		}
		System.out.println(sb);
	}
}
