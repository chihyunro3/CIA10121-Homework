package hw3;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		int a, b, c;

//		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入正整數");
		if (sc.hasNextInt()) {
//			i=sc.nextInt();
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
//			System.out.print(i);

			// 判斷是否為三角形
			if (a + b > c && b + c > a && a + c > b) {
				// 判斷是否為等腰三角形
				if (a == b && b == c && c == a) {
					System.out.println("正三角形");
				} else if (a == b || b == c || c == a) {
					if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) {
						System.out.println("直角三角形");
					}
					System.out.println("等腰三角形");
				} else {
					{
						if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) {
							System.out.println("直角三角形");

						} else {
							System.out.println("其他三角形");
						}
					}

				}

			} else {
				System.out.println("不是三角形");
			}

		} else {
			System.out.println("輸入錯誤，請輸入正整數");
		}
		sc.close();
	}

} //#巢哥
