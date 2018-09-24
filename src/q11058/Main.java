package q11058;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int N;
	static long[] memo;

	public static void main(String[] args) throws IOException {
		int i, j;
		long max;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(in.readLine());
		memo = new long[N];

		memo[0] = 1;

		for (i = 1; i < N; i++) {
			max = memo[i-1] + 1;
			for (j = 0; j < N - 3; j++) {
				max = (max > memo[j] * (i - j - 1)) ? max : memo[j] * (i - j - 1);
			}
			memo[i] = max;
		}
		
		System.out.println(memo[N - 1]);

		in.close();

	}
}
