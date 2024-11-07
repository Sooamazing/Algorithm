
import java.util.*;
import java.lang.*;
import java.io.*;

// 24-11-06 5min
// https://www.acmicpc.net/problem/2438
class TakingAPictureOfTheStars1
{
	public static void main (String[] args) throws IOException
	{
		// your code goes here
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringBuilder sb = new StringBuilder();

int num = Integer.parseInt(br.readLine());

String star = "*";
for(int i=1; i <= num ; i++){
sb.append(star.repeat(i)).append("\n");
}

System.out.println(sb);
	}
}
