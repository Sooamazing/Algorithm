import java.io.*;

import java.util.*;

// 24-12-03 5min
// https://www.acmicpc.net/problem/15894
// 참고: https://propercoding.tistory.com/248#google_vignette
public class MathIsAPhysicalEducationCourse {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine()); //학교의 수

        System.out.print(4 * n);

    }

}
