package hw3;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {

//		取亂數0 ~ 100
		int r1 = (int) (Math.random() * 101) + 0; // 總共有101個數，+ 邊界最小數值

//		猜數字，宣告一個猜數字的物件
		Scanner sc = new Scanner(System.in);
		

//		System.out.print(i);

//		顯示提示訊息
		System.out.println("開始猜數字吧");
		int i = sc.nextInt();
		while (r1 != i) {
			if (r1 < i) {
				System.out.println("猜錯囉！比你猜的小！");
			} else {
				System.out.println("猜錯囉！比你猜的大！");
			}
			i = sc.nextInt();
		}
		System.out.println("答對了！");
		sc.close();
	}
}
