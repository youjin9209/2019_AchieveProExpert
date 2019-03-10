import java.util.Arrays;
import java.util.Scanner;
/* Hashing : KEY-VALUE STORE.
 * 구현 : Key를 배열의 Index로 변환한다. (by Binarh Search : 구간을 찾는거니까 크기는 중요하지 않다. 찌부되도 상관없음) / 효과 : 값을 한번에 찾을 수 있게 된다.   
 * 제한된 공간을 이용하여 자료를 (운좋으면 ) 단 한번의 연산으로 찾는 방법 
 * Hashing 의 핵심 : 공간 축소. (for data storing) / 범위가 겁나게 넓은거를 쫙 줄인다. 배열의 Index로 !! 
*/
/*
pro대비 Day1
E01 - 겹치는 구간 찾기 
문제
[a, b)의 구간이 N개 주어지고, 이 구간을 색칠한다. 가장 짙게 색칠되는 구간의 갯수를 구하여라. 
입력 
첫 번째 줄에 N이 주어진다. (1 <= N <= 1000) 그 후 N개의 줄에 대하여 구간의 정보가 두 개의 정수로 주어진다. 시작점은 항상 끝점보다 작거나 같다. 
출력
가장 짙게 색칠되는 구간의 갯수를 출력한다.
예제1 
4
1 4
2 7
6 8
9 10
출력1
2 
예제2 
4
13257 25834 
15000 7182434
1000000 8000000
100000000 1000000000 
출력2 
2 
*/
public class pro_day1_E01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] data = new int[N][2];
		int sorted_inx = 0;
		int myUnique_inx = 0;
		int[] sorted = new int[2*N]; // 정렬한 거 
		int[] myUnique = new int[2*N]; // 중복 제거한거 
		int[] coloring = new int[2*N]; // 색칠한 거 
		for (int i = 0; i < N; i++) {
			data[i][0] = sc.nextInt();
			data[i][1] = sc.nextInt();
			sorted[sorted_inx++] = data[i][0];
			sorted[sorted_inx++] = data[i][1];
		}
		// (1) 입력받은 숫자 정렬 : 1 차원 수직선에 나래비 시켜야지 
		Arrays.sort(sorted);
		myUnique[0] = sorted[0];
		myUnique_inx++;
		// (2) 졍렬된 상태에서 중복 제거 
		for (int i = 1; i < sorted_inx; i++) {
		    if (myUnique[myUnique_inx-1] != sorted[i]) {
		      myUnique[myUnique_inx++] = sorted[i];
		    }
		}
		// (3) 좌표 축소 : key를 배열의 index로 변환 (using Binary Search) 
		for (int i = 0; i < N; i++) {
		    for (int j = 0 ; j < 2; j++) {
		    	int value = data[i][j];
		    	int start = 0, end = myUnique_inx; 
			    while(start < end) {
			    	int mid = (start + end)/2;
			    	if (myUnique[mid] == value) {
			    		data[i][j] = mid;
			    		break;
			    	} else if (myUnique[mid] > value) {
			    		end = mid;
			    	} else {
			    		start = mid;
			    	}
			    }
		    }
		}
		// (4) 색칠
		for (int i = 0 ; i < N; i++) {
			int start = data[i][0];
		    int end = data[i][1];
		    for (int j = start; j < end; j++) {
		    	coloring[j]++;
		    }
		}
		int maxValue = coloring[0]; // 가장 짙게 색칠된 max 값 찾아야지 
		for (int i = 1; i < myUnique_inx; i++) {
			if (maxValue < coloring[i]) {
				maxValue = coloring[i];
		    }
		}
		// (5) 구간 세기 : 연속되게 가장짙게 색칠된 개수 구하기 
		boolean isMiddle = false;
		int result = 0;
		for (int i = 0; i < myUnique_inx; i++) {
			if (coloring[i] == maxValue) {
				if (isMiddle) ;
			    else {
			    	result++;
			    	isMiddle = true;
			    }
		    } else {
		      isMiddle = false;
		    }
		}
		System.out.println(result);
	}
}
