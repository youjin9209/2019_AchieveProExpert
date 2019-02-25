import java.util.Scanner;
/*
pro대비 Day1
E00 - K 번째 최대값 찾기 
문제
N개의 숫자가 주어질 때, 이 중 K번째 최댓값을 찾는 프로그램을 작성하여라.
입력 
첫 번째 줄에 N과 K가 주어진다. (1 <= N <= 1,000,000) 그 후 두 번째 줄의 N개의 양의 정수가 주어진다
출력
K번째 최댓값을 출력한다 
예제 
10 3
1 8 4 6 8 2 3 2 5 7 
출력
7
*/
public class pro_day1_E00 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] arr = new int[N+1]; // input 받아올 배열 
		int[] sorted = new int[K+1]; // 내림차순 배열 
		for (int i = 1; i <= N; i++) {
			arr[i] = sc.nextInt();
		}
		// 1) 맨처음 숫자만 초기에 넣어준다 
		sorted[1] = arr[1];
		for (int i = 2; i <= N; i++) {
			int num = arr[i];
			// 2) sorted[K] 와 arr[] 숫자와 비교 -> 클경우 sorted[K] 에 넣기 
			if (num > sorted[K])
				sorted[K] = num;
			// 3) sorted[] 내림차순 정렬 
			for (int k = K; k >= 2; k--) {
				if (sorted[k] > sorted[k-1]) { // swap 
					int temp = sorted[k-1];
					sorted[k-1] = sorted[k];
					sorted[k] = temp;
				}
					 
			}
		}
		System.out.println(sorted[K]);
	}
}
