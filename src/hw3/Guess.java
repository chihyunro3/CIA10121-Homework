package hw3;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {

//		取亂數1 ~ 9
		int r1 = (int) (Math.random() * 99) + 1; // 總共有10個數，+ 邊界最小數值

//		猜數字，宣告一個猜數字的物件
		int i;
		Scanner sc = new Scanner(System.in);

//			System.out.print(i);

//		顯示訊息
		System.out.println("開始猜數字吧");
		i = sc.nextInt();
		while (r1 != i) {
			if (r1 < i) {
				System.out.println("猜錯囉！比你猜的小！");
			} else {
				System.out.println("猜錯囉！比你猜的大！");
			}
			i = sc.nextInt();
		}
		System.out.println("答對了！");
	}
}
