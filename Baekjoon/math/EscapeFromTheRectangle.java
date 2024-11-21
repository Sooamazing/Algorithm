
import java.util.*;
import java.lang.*;
import java.io.*;

// 24-11-21 5min
// https://www.acmicpc.net/problem/1085
class EscapeFromTheRectangle
{
	public static void main (String[] args) throws IOException
	{
		// your code goes here
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st = new StringTokenizer(br.readLine());

int x = Integer.parseInt(st.nextToken());
int y = Integer.parseInt(st.nextToken());
int w = Integer.parseInt(st.nextToken());
int h = Integer.parseInt(st.nextToken());

int min = x;
min = Math.min(min, y);
min = Math.min(min, w-x);
min = Math.min(min, h-y);

System.out.println(min);

	}
}
