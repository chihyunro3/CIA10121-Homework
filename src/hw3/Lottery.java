package hw3;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字？");
		if (sc.hasNextInt()) {
			int i = sc.nextInt();

			// 宣告一個陣列，存放數字1~49
			int lottery[][] = new int[5][];
			lottery[0] = new int[10];
			lottery[1] = new int[10];
			lottery[2] = new int[10];
			lottery[3] = new int[10];
			lottery[4] = new int[9];

			int a = 1;
			int count = 0;
			for (int j = 0; j < lottery.length; j++) {
				for (int k = 0; k < lottery[j].length; k++) {
					lottery[j][k] = a;
					a++;
					if (j == i && k != 9 || k == i - 1 || (j == i - 1 && k == 9)) {
						// 有bug還印出40if (j == i || k == i - 1 || (j == i - 1 && k == 9))

					} else {
						System.out.print(lottery[j][k] + " ");
						count++;
					
					}

				}

				// 依據陣列索引值刪除阿文選到的數字
				// 依據陣列索引值找到阿文不想選到的數字

			}
			System.out.println();
			System.out.println("總共有" + count + "個數字可以選");
		}

	}
}
