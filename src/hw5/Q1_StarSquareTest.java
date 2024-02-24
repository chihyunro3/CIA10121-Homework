package hw5;

import java.util.Scanner;

public class Q1_StarSquareTest {

	public static void main(String[] args) {
		Q1_StarSquare SS = new Q1_StarSquare();
//		SS.setWidth(5);
//		SS.setHeight(4);
//		SS.starSquare();

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬與高");
		int a = sc.nextInt();
		int b = sc.nextInt();
		SS.setWidth(a);
		SS.setHeight(b);
		SS.starSquare();
		
		sc.close();

	}

}
