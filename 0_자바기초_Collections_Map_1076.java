/*
백준 1076 저항
-> key, value 잘 설정하고 상관 관계 잘 파악하기 
*/
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> color = new HashMap<String, Integer>();
		color.put("black", 0);
		color.put("brown", 1);
		color.put("red", 2);
		color.put("orange", 3);
		color.put("yellow", 4);
		color.put("green", 5);
		color.put("blue", 6);
		color.put("violet", 7);
		color.put("grey", 8);
		color.put("white", 9);
		String a = sc.nextLine();
		String b = sc.nextLine();
		String c = sc.nextLine();
		long ans = 10*color.get(a) + color.get(b);
		int add = color.get(c);
		for (int i = 1; i <= add; i++) {
			ans *= 10;
		}
		System.out.println(ans);
	}
}
