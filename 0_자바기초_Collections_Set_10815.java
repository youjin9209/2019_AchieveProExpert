/*
Set
인터페이스 - 중복된 원소를 포함하지 않는다
HashSet, TreeSet, LinkedHashSet
일반적인 경우엔 HashSet
순서가 중요한 경우엔 TreeSet
입력으로 넣은 순서가 중요한 경우에는 LinkedHashSet

HashSet : 해시테이블을 이용해서 구현. 
삽입/삭제/제거연산의 시간복잡도 O(1) / 추가한 순서 보장 ❌

TreeSet : 이진검색트리 (레드블랙트리)를 이용
삽입/삭제/제거연산의 시간복잡도 O(logN) / 추가한 순서보장 안됨⭕️

LinkedHashSet : 해시테이블과 연결리스트를 이용해서 구현
삽입/삭제/제거연산의 시간복잡도 O(1) / 추가한 순서 보장 ⭕️
*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> d = new HashSet<Integer>();
//		TreeSet<Integer> d = new TreeSet<Integer>();
//		LinkedHashSet<Integer> d = new LinkedHashSet<Integer>();
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			int num = sc.nextInt();
			d.add(num);
		}
		int M = sc.nextInt();
		for (int j = 1; j <= M; j++) {
			int searchNum = sc.nextInt();
			if (d.contains(searchNum))
				System.out.print(1+" ");
			else 
				System.out.print(0+" ");
		}
	}
}
